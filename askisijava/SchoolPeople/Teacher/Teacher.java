package askisijava.SchoolPeople.Teacher;

import askisijava.SchoolPeople.SchoolPerson.SchoolPerson;

public class Teacher extends SchoolPerson{
    private int tiredIncrease; //degree of tiredness increase
    
    public Teacher(String n, int r, int c, int t_d){
        super(n, r, c);
        tiredIncrease = t_d;
        System.out.println("A Teacher has been created");
    } 
    
    public void teach(int N){ //compute tiredness degree of teaching
        super.setTiredDegree(N*tiredIncrease);
    }
}
