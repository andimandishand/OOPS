package govind;
import java.util.Scanner;
class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("enter the length :-");
    	int length = sc.nextInt();
    	System.out.print("enter the width :-");
    	int width = sc.nextInt();
        Rectangle rect = new Rectangle(length, width);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        sc.close();
    }
}
