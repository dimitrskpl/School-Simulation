package askisijava.SchoolEnviroment.SchoolPlace;

import askisijava.SchoolPeople.Student.Student;

public abstract class SchoolPlace{
    //the student who exists in the place
    //or the last student who entered, 
    //if more than one student exist in class
    protected Student student; 

    public SchoolPlace(){
        student = null; //place is empty initially
    }

    //student s enters the corresponding place
    public abstract void enter(Student s); 

    //student s exits the corresponding place
    public abstract void exit(); 

    //continues root from current place to the place p
    public void continueToNextPlace(SchoolPlace p){ 
        Student s = student;
        exit();
        p.enter(s);
    }
}
 