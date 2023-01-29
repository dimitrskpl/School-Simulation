# School-Simulation
Go to initial folder School-Simulation/
The compilation command is:
javac ./SchoolSimulation/SchoolMain/SchoolMain.java ./SchoolSimulation/SchoolEnviroment/*.java ./SchoolSimulation/SchoolPeople/*.java
The execution command is: 
java SchoolSimulation/SchoolMain/SchoolMain <input_file> <class_c> <j_s_hourly_increase> <s_s_hourly_increase> <t_hourly_increase> <op_hours>
class_c: the capacity of the classroom
j_s_hourly_increase: the hourly increase in the degree of tiredness of students in small classes
s_s_hourly_increase: the hourly increase in the degree of tiredness of students in large classes 
t_hourly_increase: the hourly increase in the degree of tiredness of the teachers
op_hours: the school's operating hours
input_file: The path the input file ralated to School-Simulation/ . Each line of the file must contain information for a single person and must be of the form: 
<type> <name> <class> <floor> 
type: the person's type ("Student"/"Teacher")
name: the name of the person
class: the number of the classroom (1-6)
floor: the number of the floor (1-3)

This file must include the 18 teachers of the school.
There is an example file SchoolSimulation/SchoolMain/input.txt.






There are 3 general projects: the SchoolEnviroment which contains all the necessary classes for the implementation of the school spaces,
the SchoolPeople which contains all the necessary classes to implement the individuals of the school and the SchoolMain which contains
the main class and the input file.

For the implementation of the school's persons there is a generic Person class that contains information about a common person, a class
SchoolPerson, a subclass of Person, which adds some features and functions necessary for a person belonging to the school
environment, a class Student, a subclass of SchoolPerson, which specifically refers only to a student of the school, a class Teacher, a subclass
of SchoolPerson, which specifically concerns only a teacher of the school. There is also a SeniorStudent and a JuniorStudent class,
subclasses of Student, which refer to students of the big and small classes respectively.

For the implementation of the school spaces there is a general class SchoolPlace that represents a part of the school with the functions
entry and exit of a student and his journey from one place to another. All other classes are subclasses of SchoolPlace. The Classroom class represents a class and contains its necessary information and functions. The Corridor class
represent the corridor of a floor. The Floor class represents a floor. It contains the corridor and 6 classrooms of the floor and
contains neccessary functions. The Staircase class represents the school staircase, while the Yard class represents the front yard school's. The School class represents the school. It contains a yard, a staircase and the 3 floors of the school together with
the necessary functions of the school.

In the SchoolMain class, the entrance of all students to the school, the operation of the school and its evacuation are represented. Inside her
students and teachers are created based on the input file "input.txt". After they are created, they are randomly entered into classes one by one
calling enter of the School class. Then, the school runs for N hours by calling the operate function of its class
of the school with a definition of the hours of operation. Finally, the school is evacuated with the first exit of all the students on each floor from the first
floor up to the third by calling the school empty and then with the exit of all the teachers with teachersOut respectively.
The people come out one by one.