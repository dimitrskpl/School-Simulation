# School-Simulation

The commands for the compilation are:
javac askisijava/SchoolMain/SchoolMain.java
The execution command is java askisijava/SchoolMain/SchoolMain with 5 integers on the command line where the first corresponds to
the class capacity, the second to the hourly increase in the degree of tiredness of students in small classes, the third to the hourly increase in the degree of tiredness of students in large classes, the fourth to the hourly increase in the degree of tiredness of the teachers and the fifth corresponds to the school's operating hours.

It is necessary to have a file called "input.txt" in the SchoolMain project in which each line contains information
for a single person, as in the indicative existing. In each line the first word is the person's type, "Student" or "Teacher",
the second is its name (string), the third its class (int) and the fourth its floor (int). In this file you should include the 18 teachers of the school, while the students in total should be able to be placed in classes based on their capacity.

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