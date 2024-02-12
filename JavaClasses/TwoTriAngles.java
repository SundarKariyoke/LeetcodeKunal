/*
Write a program to print the area of two rectangles having sides (4,5) and (5,8) 
respectively by creating a class named 'Rectangle' with a method named 'Area' 
which returns the area and length and breadth passed as parameters to its constructor.
*/

class RectangleArea{
    int length;
    int breadth;
    RectangleArea(int length, int breadth){
        this.length = length;
        this.breadth=breadth;
    }
    int getArea(){
        return this.length * this.breadth;
    }
}

public class TwoTriAngles {
    public static void main(String[] args) {
        RectangleArea triangle1 = new RectangleArea(4,5);
        RectangleArea triangle2 = new RectangleArea(3,1);
        System.out.println(triangle1.getArea());
        System.out.println(triangle2.getArea());
    }
}
