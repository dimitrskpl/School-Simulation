package SchoolSimulation.SchoolPeople;

public class JuniorStudent extends Student{
    private int tiredIncrease; //degree of tiredness increase
    public JuniorStudent(String n, int r, int c, int t_d){
        super(n, r, c);
        tiredIncrease = t_d;
    } 
    
    public void attend(int N){ //compute tiredness degree of attendance
        super.setTiredDegree(N*tiredIncrease);
    }
}
