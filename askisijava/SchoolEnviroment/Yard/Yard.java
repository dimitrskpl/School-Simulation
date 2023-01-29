package askisijava.SchoolEnviroment.Yard;

import askisijava.SchoolEnviroment.SchoolPlace.SchoolPlace;
import askisijava.SchoolPeople.Student.Student;

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
