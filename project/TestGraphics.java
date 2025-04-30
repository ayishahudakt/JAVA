import graphics.*;
import java.util.Scanner;

public class TestGraphics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and width of the rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        Figure rectangle = new Rectangle(length, width);

        System.out.print("Enter base and height of the triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        Figure triangle = new Triangle(base, height);

        System.out.print("Enter side of the square: ");
        double side = sc.nextDouble();
        Figure square = new Square(side);

        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        Figure circle = new Circle(radius);

        System.out.println("\n--- Area Results ---");
        System.out.printf("Rectangle Area: %.2f\n", rectangle.area());
        System.out.printf("Triangle Area: %.2f\n", triangle.area());
        System.out.printf("Square Area: %.2f\n", square.area());
        System.out.printf("Circle Area: %.2f\n", circle.area());

        sc.close();
    }
}

