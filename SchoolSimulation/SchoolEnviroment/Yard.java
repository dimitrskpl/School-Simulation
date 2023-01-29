package SchoolSimulation.SchoolEnviroment;

import SchoolSimulation.SchoolPeople.Student;

public class Yard extends SchoolPlace{    
    public Yard(){
        System.out.println("\tA New Yard has been created!");
    }

    public void enter(Student s){
        s.printOnlyName();
        System.out.println(" enters yard!");
        student = s;
    }

    public void exit(){
        student.printOnlyName();
        System.out.println(" exits yard!");
        student = null;
    }
}
