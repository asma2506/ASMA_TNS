package question3;


import java.util.Scanner;

public class Circle {
    int radius;
    String clr;

    
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        radius = sc.nextInt();

        System.out.println("Enter colour of the circle:");
        clr = sc.next();

        sc.close();
    }

    
    void calcArea() {
        final float PI = 3.14f;
        float area = PI * radius * radius;
        System.out.println("Radius = " + radius);
        System.out.println("Colour = " + clr);
        System.out.println("Area of Circle = " + area);
    }

    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.getInput();   
        obj.calcArea();    
    }
}
