package SchoolSimulation.SchoolEnviroment;

import SchoolSimulation.SchoolPeople.Student;
import SchoolSimulation.SchoolPeople.Teacher;

public class School extends SchoolPlace{
    private Yard yard; //school yard
    private Staircase staircase; //school staircase
    private Floor floorArray[]; //the 3 floors of school

    public School(int c_class){
        floorArray = new Floor[3];
        for(int i = 0; i < 3; i++)
            floorArray[i] = new Floor(i, c_class);
        staircase = new Staircase();
        yard = new Yard();
        System.out.println("A New School has been created!");
    }

    public void enter(Student s){
        student = s;
        s.printOnlyName();
        System.out.println(" enters school!");
        continueToNextPlace(yard);
        yard.continueToNextPlace((staircase));
        int roof = s.getRoof() - 1; //convert to 0-base
        staircase.continueToNextPlace(floorArray[roof]);
        floorArray[roof].continueToClass(); 
    }

    public void exit(){
        student = null;
    }

    //drives student one by one outside the school
    public void empty(){
        for(int i = 0; i < 3; i++){
            while(floorArray[i].isEmpty() == false){
                floorArray[i].exitStudent();
                floorArray[i].continueToNextPlace(staircase);
                staircase.continueToNextPlace(yard);
                yard.exit();
           }
        }
    }

    //drives teachers one by one outside school
    public void teachersOut(){
        for(int i = 0; i < 3; i++)
            floorArray[i].teachersOut();
    }

    //prints school by printing all floors of school
    public void print(){ 
        System.out.println("School life consists of:");
        //prints all floors
        for(int i = 0; i < 3; i++)
            floorArray[i].print();
    }

    public void place(Teacher t){
        int roof = t.getRoof() - 1;
        floorArray[roof].place(t);
    }

    //computes tiredness degree of each person in school dependent on school operation
    public void operate(int N){ 
        //for each floor of school compute tiredness of people
        for(int i = 0; i < 3; i++)
            floorArray[i].operate(N);
    }

}
