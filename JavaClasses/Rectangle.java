/*
//https://www.codesdope.com/practice/java-classes-and-objects/

//LEVEL 1:
01.Write a program to print the area of a rectangle by creating a class 
named 'Area' having two methods. First method named as 'setDim' takes length 
and breadth of rectangle as parameters and the second method named as 'getArea' 
returns the area of the rectangle. Length and breadth of rectangle are entered 
through keyboard.
 */

import java.util.Scanner;

class Area{
    int length;
    int breadth;

    void setDim(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    int getArea(){
        return this.length * this.breadth;
    }
}

public class Rectangle{
    public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                System.out.print("Enter the length in cm: ");
                int length = in.nextInt();
                System.out.print("Enter the breadth in cm: ");
                int breadth = in.nextInt();
                Area area = new Area();
                area.setDim(length,breadth);
                System.out.println("The Area of the Rectangle with the given inputs are " + area.getArea()+ " sq.cm");
            }
    }
}