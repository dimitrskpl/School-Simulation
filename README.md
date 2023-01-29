# School-Simulation 

In this project I implement a simulation of the morning arrival of students in a school building and their entry into classrooms. The school building consists of: 3 roofs, 1 yard, 1 staircase. Each roof consists of 6 classrooms and 1 corridor. Each classroom has at most Cclass students and one teacher.
Student's-Teacher's details: name, number of roof, number of classroom, an indication of whether he is in his class or not and a meter corresponding to his level of tiredness.
There are junior and senior students. They attend lessons for some hours. For each hour the tiredness degree of junior Student is increased by Lj and the tiredness degree of senior Student is increased by Ls. The teachers teach for some hour and for each hour their tiredness degree is increased by Lt. 

The students enters the school one by one. Firstly, they enter the yard, then the staircase and then their roof. After they enter the corridor and finally their classroom. Each teacher is placed directly in his classroom. The school operates for N hours. Finally, the school is evacuated starting with students from the first floor up to the third and then with the exit of all the teachers. The people come out one by one and the evacuation follows the oposite order of the entrance of the students.

There are three packages: the SchoolEnviroment which contains all the necessary classes for the implementation of the school places, the SchoolPeople which contains all the necessary classes to implement the individuals of the school and the SchoolMain which contains the main class.

SchoolMain:
Students and teachers are created based on the input file "input.txt". After they are created, they are randomly entered into classes one by one. Then, the school 
operates for N hour. Finally, the school is evacuated. The school simulation is represented by messages to the stdout.

# Usage

Go to initial folder School-Simulation/
The compilation command is:
javac ./SchoolSimulation/SchoolMain/SchoolMain.java ./SchoolSimulation/SchoolEnviroment/*.java ./SchoolSimulation/SchoolPeople/*.java
The execution command is: 
java SchoolSimulation/SchoolMain/SchoolMain <inputFile> <Cclass> <Lj> <Ls> <Lt> <N>
Cclass: the capacity of the classroom
Lj: the hourly increase in the degree of tiredness of students in small classes
Ls: the hourly increase in the degree of tiredness of students in large classes 
Lt: the hourly increase in the degree of tiredness of the teachers
N: the school's operating hours
inputFile: The path to the input file ralated to School-Simulation/. Each line of the file must contain information for a single person and must be of the form: 
<type> <name> <class> <floor> 
type: the person's type ("Student"/"Teacher")
name: the name of the person
class: the number of the classroom (1-6)
floor: the number of the floor (1-3)

This file must include the 18 teachers of the school.
There is an example file SchoolSimulation/SchoolMain/input.txt.
