import java.util.Scanner;

public class Mathclass {
    public static void main(String[] args) {
        double pi = 3.1416;
        double x;
        double y;
        double z;

        System.out.println("The absolute value of - pi = " + Math.abs(-pi));
        System.out.println("The round value of pi = " + Math.round(pi));
        System.out.println("The ceil value of pi = " + Math.ceil(pi));
        System.out.println("The floor value of pi = " + Math.floor(pi));
        System.out.println("The value of two squared three is = " + Math.pow(2, 3));
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Value of x: ");
        x = scanner.nextDouble();
        System.out.print("Value of y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));

        System.out.println("Value of hypotenuse is: " + z);

        scanner.close();
    }
}
