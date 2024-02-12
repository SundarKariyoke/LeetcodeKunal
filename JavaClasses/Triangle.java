import java.util.Scanner;

class TriangleDimension{
    int a,b,c;
    public double getArea(){
        double s = (a+b+c)/2.0;
        double area = Math.pow((s *(s-a)*(s-b)*(s-c)),.5);
        return area;
    }
    public double getPerimeter(){
        double perimeter = (a+b+c)/2.0;
        return perimeter;
    }
}

public class Triangle {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int [] sides = new int[3];
      for(int i =0;i<sides.length;i++){
            System.out.println("Enter the side in cm ");
            sides[i] = in.nextInt();
      }
            TriangleDimension triangle = new TriangleDimension();
            triangle.a = sides[0];
            triangle.b = sides[1];
            triangle.c = sides[2];
            double perimeter = triangle.getPerimeter();
            System.out.println(perimeter);
            double area = triangle.getArea();
            System.out.println(area);
        }
    }
}
