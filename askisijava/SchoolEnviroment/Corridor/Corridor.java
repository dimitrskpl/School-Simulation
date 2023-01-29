package askisijava.SchoolEnviroment.Corridor;

import askisijava.SchoolEnviroment.SchoolPlace.SchoolPlace;
import askisijava.SchoolPeople.Student.Student;

public class Corridor extends SchoolPlace{    
    public Corridor(){
        System.out.println("\tA New Corridor has been created!");
    }

    public void enter(Student s){
        s.printOnlyName();
        System.out.println(" enters corridor!");
        student = s;
    }

    public void exit(){
        student.printOnlyName();
        System.out.println(" exits corridor!");
        student = null;
    }
}
