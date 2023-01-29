package SchoolSimulation.SchoolEnviroment;

import java.util.Vector;

import SchoolSimulation.SchoolPeople.Student;
import SchoolSimulation.SchoolPeople.Teacher;

public class Classroom extends SchoolPlace{
    private Vector<Student> studentArray; //includes the students of the classroom
    private int classNumb; //number of class
    private int capacity; //the capacity of class
    private Teacher teacher; //the teacher of the classroom or NULL if no teacher has entered classroom
    
    public Classroom(int c_n, int c){
        studentArray = new Vector<>();
        classNumb = c_n;
        capacity = c;
        teacher = null;
        System.out.println("\t\tA New Class has been created!");
    }

    public int getCapacity(){
        return capacity;
    }

    public void print(){ //prints teacher and students of classroom and their tiredness degree
        int realClassNumb = classNumb + 1;
        System.out.println("\t\tPeople in class " + realClassNumb + " are:");
        System.out.print("\t\t\tTeacher is ");
        if(teacher != null)
            teacher.print();
        System.out.println();
        System.out.print("\t\t\tStudents are ");
        for(Student s : studentArray){
            s.print();
            System.out.print(" ");
        }
        System.out.println();
    }
    
    public int getSize(){
        return studentArray.size();
    }
        
    public void enter(Student s){
        student = s;
        studentArray.add(s); //places student s to the end of the vector  
        s.printOnlyName();
        System.out.println(" enters classroom!");
        s.setInsideClass(); //student s is inside class     
    }

    public void exit(){
        student.printOnlyName();
        System.out.println(" exits classroom!");
        student.setOutsideClass();
        studentArray.remove(studentArray.size() - 1);
        if(studentArray.size() == 0)
            student = null;
        else 
            student = studentArray.get(studentArray.size() - 1);
    }

    public void place(Teacher t){ //teacher t is placed in classroom
        teacher = t;
        t.setInsideClass(); //teacher t is inside class   
    }

    public void operate(int N){ //computes redness degree of each person in class dependent on the N hours
        //for every student in class
        for(Student s : studentArray)
            s.attend(N); //compute tiredness of attendance

        if(teacher != null) //if teacher is inside class
            teacher.teach(N); //compute tiredness of teaching
    }

    public boolean isEmpty(){
        if(studentArray.size() == 0)
            return true;
        else  
            return false;
    }

    public void startStudentExiting(){
        Student s = student; 
        s.printOnlyName();
        System.out.println(" starts exiting!");
    }

    public void teacherOut(){
        System.out.print("Teacher ");
        teacher.printOnlyName();
        System.out.println(" is out!");
        teacher.setOutsideClass();
        teacher = null;
    }

    public boolean teacherIsInside(){
        if(teacher == null)
            return false;
        else
            return true;
    }
}
