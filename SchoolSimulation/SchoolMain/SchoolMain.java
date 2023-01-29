package SchoolSimulation.SchoolMain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import SchoolSimulation.SchoolEnviroment.School;
import SchoolSimulation.SchoolPeople.JuniorStudent;
import SchoolSimulation.SchoolPeople.SeniorStudent;
import SchoolSimulation.SchoolPeople.Student;
import SchoolSimulation.SchoolPeople.Teacher;


public class SchoolMain {
    static public void main(String[] args) throws
FileNotFoundException {
        String inputFile = args[0];
        int c_class = Integer.parseInt(args[1]); //capacity of classrooms
        int Lj = Integer.parseInt(args[2]); //tiredness increase degree for junior students
        int Ls = Integer.parseInt(args[3]); //tiredness increase degree for senior students
        int Lt = Integer.parseInt(args[4]); //tiredness increase degree for teachers
        int N = Integer.parseInt(args[5]); //school operation hours
        
        Vector<Student> students = new Vector<>();
        Vector<Teacher> teachers = new Vector<>();
        File file = new File(inputFile);
        Scanner sc = new Scanner(file);
        
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] words = line.split(" ");
            String type = words[0];
            String name = words[1];
            String stringClassroom = words[2];
            int classroom = Integer.parseInt(stringClassroom);
            String stringRoof = words[3];
            int roof = Integer.parseInt(stringRoof);

            if(type.equals("Student")){ //Student type
                Student student;
                if(classroom <=3)
                    student = new JuniorStudent(name, roof, classroom, Lj);
                else
                    student = new SeniorStudent(name, roof, classroom, Ls);
                students.add(student);
            }
            else{ //Teacher type
                Teacher teacher = new Teacher(name, roof, classroom, Lt);
                teachers.add(teacher);
            }
        }
        sc.close();

        School school = new School(c_class);
        Random rand = new Random();

        //while school people has left outside the school
        while(students.size() + teachers.size() > 0){
            int chooseStudent = rand.nextInt(2); //0 or 1

            if(students.size() == 0) //if no student has left outside, dont choose student
                chooseStudent = 0;
            else if(teachers.size() == 0) //if no teacher has left outside, choose student
                chooseStudent = 1;

            if(chooseStudent == 1){
                int pos = rand.nextInt(students.size()); //[0, size-1]
                Student student = students.get(pos);
                school.enter(student);
                students.remove(pos);
            }
            else{
                int pos = rand.nextInt(teachers.size());
                Teacher teacher = teachers.get(pos);
                school.place(teacher);
                teachers.remove(pos);
            }
        }
        school.print(); //print school simulation before the operation (tired degree=0)
        school.operate(N); //school operation
        school.print(); //print school simulation after the operation
        school.empty(); //drive all students outside
        school.teachersOut(); //drive all teachers outside
        school.print(); //print school simulation (school must be empty)
    }
}
