package SchoolSimulation.SchoolEnviroment;

import SchoolSimulation.SchoolPeople.Student;

public class Staircase extends SchoolPlace{  
    public Staircase(){
        System.out.println("\tA New Staircase has been created!");
    }
    
    public void enter(Student s){
        s.printOnlyName();
        System.out.println(" enters staircase!");
        student = s;
    }

    public void exit(){
        student.printOnlyName();
        System.out.println(" exits staircase!");
        student = null;
    }
}
