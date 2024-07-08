import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();
        if(age < 18){
            System.out.println("Ohh no! You're too young to drive!");
        }
        else if(age >= 65){
            System.out.println("Oops! You're too old to drive!");
        }
        else{
            System.out.println("Wow, You're permitted to drive! Get a license!");
        }
    }
}
