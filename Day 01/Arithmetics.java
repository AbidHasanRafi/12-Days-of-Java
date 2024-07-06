import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        // expression = operands and operators
        // operands = values, variables, numbers, quantity
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x = scanner.nextInt();
        System.out.print("Enter the value of y: ");
        y = scanner.nextInt();
        int sum = x + y;
        int sub = x - y;
        int mult = x * y;
        int div = x / y;
        int mod = x % y;
        System.out.println("Summation of x & y =" + sum);
        System.out.println("Subtraction of x & y =" + sub);
        System.out.println("Multiplication of x & y =" + mult);
        System.out.println("Division of x & y =" + div);
        System.out.println("Modulo division of x & y =" + mod);
        System.out.println("Increment of x =" + ++x);
        scanner.close();
    }
}
