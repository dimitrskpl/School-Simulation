package SchoolSimulation.SchoolEnviroment;

import SchoolSimulation.SchoolPeople.Student;
import SchoolSimulation.SchoolPeople.Teacher;

public class Floor extends SchoolPlace{
    private int floor_numb; //number of floor
    private Corridor corridor; //corridor of floor
    private Classroom classroomArray[]; //the 6 classrooms of floor
    
    public Floor(int f_n, int c){ //initialization with floor number and classroom capacity
        floor_numb = f_n;
        corridor = new Corridor();
        classroomArray = new Classroom[6];
        for(int i = 0; i < 6; i++)
            classroomArray[i] = new Classroom(i, c);

        System.out.println("\tA New Floor has been created!");
    }

    public void enter(Student s){
        student = s;
        s.printOnlyName();
        System.out.println(" enters floor!");
    }
    
    public void exit(){
        student = null;
    }

    //checks which class is not empty and moves one student 
    //from class to corridor and then in this place
    public void exitStudent(){ 
        for(int i = 0; i < 6; i++){
            if(classroomArray[i].isEmpty() == false){            
                classroomArray[i].startStudentExiting();
                classroomArray[i].continueToNextPlace(corridor);
                corridor.continueToNextPlace(this);
                return;
            }
        }
    }

    //remove teacher for each classroom
    public void teachersOut(){
        for(int i = 0; i < 6; i++)
            if(classroomArray[i].teacherIsInside())
                classroomArray[i].teacherOut();
    }

    public boolean isEmpty(){
        for(int i = 0; i < 6; i++){
            if(classroomArray[i].isEmpty() == false){
                return false;
            }
        }

        return true;
    }
        
    //move existing student to corridor and then to his classroom
    public void continueToClass(){
        Student s = student;
        continueToNextPlace(corridor);
        int classroom = s.getClassroom() - 1;
        corridor.continueToNextPlace(classroomArray[classroom]);
    }

    //teacher t is placed in floor
    public void place(Teacher t){ 
        int realClassNumb = t.getClassroom() - 1;
        classroomArray[realClassNumb].place(t);
    }
        
    //prints floor by printing the classrooms of floor  
    public void print(){       
        System.out.println("\tFloor number " + floor_numb + " contains:");
        for(int i = 0; i < 6; i++)
            classroomArray[i].print();
    }
    
    //computes tiredness degree of each person on the floor 
    //dependent on the operation of school
    public void operate(int N){ 
        //for each classroom of the floor
        for(int i = 0 ; i < 6; i++)
            classroomArray[i].operate(N); //compute tiredness of people of each classroom       
    }

}