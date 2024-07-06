import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your are " + age + " years old!");
        System.out.print("Enter the value of pi: ");
        double pi = scanner.nextDouble();
        System.out.println("The value of pi is: " + pi);
        // if we have a scanner before nextLine() it holds a \n that automatically shuts nextLine()
        // so we have to do an extra scanner.nextLine() to clear it out
        scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hi, " + name);
        scanner.close();
    }
}
