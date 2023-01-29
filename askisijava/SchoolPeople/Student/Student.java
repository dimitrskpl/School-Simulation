package askisijava.SchoolPeople.Student;

import askisijava.SchoolPeople.SchoolPerson.SchoolPerson;

public abstract class Student extends SchoolPerson{
    public Student(String n, int r, int c){ //initialization of SchoolPerson
            super(n, r, c);
            System.out.println("A Student has been created");
        }
        
    public abstract void attend(int N); //compute tiredness degree of attendance
}
