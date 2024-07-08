import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        String name = "";
        Scanner scanner = new Scanner(System.in);

        // while (name.isEmpty()) {
        //     System.out.print("Enter your name: ");
        //     name = scanner.nextLine();
        // };
        
        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isEmpty());
        System.out.println("Hello, " + name);
        scanner.close();
    }
}
