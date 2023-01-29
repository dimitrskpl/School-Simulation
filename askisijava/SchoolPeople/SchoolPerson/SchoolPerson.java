package askisijava.SchoolPeople.SchoolPerson;

import askisijava.SchoolPeople.Person.Person;

public class SchoolPerson extends Person{
    private int roof; //roof number
    private int classroom; //class number
    private boolean insideClass; //true if he is inside class, otherwise false
    private int tiredDegree; //degree of tiredness
    
    public SchoolPerson(String n, int r, int c){ //initialization with name, roof number, class number
        super(n);
        roof = r;
        classroom = c;
        insideClass = false;
        tiredDegree = 0;
    }

    public int getRoof(){
        return roof;
    }

    public int getClassroom(){
        return classroom;
    }

    public boolean getInsideClass(){
        return insideClass;
    }

    public void setInsideClass(){ //asigh true
        insideClass = true;
    }

    public void setOutsideClass(){ //asigh false
        insideClass = false;
    }

    public void setTiredDegree(int t_d){
        tiredDegree = t_d;
    }

    public void print(){ //calls Person::print and prints tiredness degree additionally
        super.print();
        System.out.print("(" + tiredDegree + ")");
    }
    
    public void printOnlyName(){ //calls only Person::print
        super.print();
    }
}
