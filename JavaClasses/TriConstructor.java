/*

05.Write a program to print the area and perimeter of a triangle having sides of 3, 4 
and 5 units by creating a class named 'Triangle' with constructor having the three 
sides as its parameters.


 */

class TriangleDimensions{
    int a;
    int b;
    int c;
    TriangleDimensions(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getArea(){
        double s = (this.a+this.b+this.c)/2.0;
        double area = Math.pow((s * (s - this.a) * (s - this.b) * (s - this.c)), 0.5);
        return area;
    }
    public double getPerimeter(){
        int perimeter = (this.a+this.b+this.c);
        return perimeter;
    }
}

public class TriConstructor {
    public static void main(String[] args) {
        TriangleDimensions triangle = new TriangleDimensions(2,5,6);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}
