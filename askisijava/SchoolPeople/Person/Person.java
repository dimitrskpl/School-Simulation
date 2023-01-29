package askisijava.SchoolPeople.Person;

public class Person {
    private String name;

    public Person(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
    
    public void print(){//prints the name
        System.out.print(name);
    }
}
