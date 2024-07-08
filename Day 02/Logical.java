import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press q or Q to quit: ");
        String button = scanner.nextLine();
        
        // if(button.equals("q") || button.equals("Q")){
        //     System.out.println("You quit the game!");
        // }
        // else{
        //     System.out.println("You're still playing!");
        // }

        if(!button.equals("q") && !button.equals("Q")){
            System.out.println("You're still playing!");
        }
        else{
            System.out.println("You quit the game!");
        }
        scanner.close();
    }
}
