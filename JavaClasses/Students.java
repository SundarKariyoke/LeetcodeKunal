/*
//https://www.codesdope.com/practice/java-classes-and-objects/

//LEVEL 1:
02.Create a class named 'Student' with String variable 'name' and 
integer variable 'roll_no'. Assign the value of roll_no as '2' and 
that of name as "John" by creating an object of the class Student.
//################################################################
03.Assign and print the roll number, phone number and address of 
two students having names "Sam" and "John" respectively by creating 
two objects of class 'Student'.
*/

class Student{
    String name;
    int roll_no;
    String phone_no;

    Student(String name,int roll_no,String phone_no){
        this.name = name;
        this.roll_no=roll_no;
        this.phone_no=phone_no;
    }
}

public class Students {
    public static void main(String[] args) {
        Student student1 = new Student("Jhon",2,"88488588388");
        System.out.println("The student name is " + student1.name);
        System.out.println("The student roll number is " + student1.roll_no);
        System.out.println("The student phone number is " + student1.phone_no);
// #####################################################################
        System.out.println("###########################################");
// #####################################################################
        Student student2 = new Student("Sundar",1,"99499599399");
        System.out.println("The student name is " + student2.name);
        System.out.println("The student roll number is " + student2.roll_no);
        System.out.println("The student phone number is " + student2.phone_no);
        }
}
