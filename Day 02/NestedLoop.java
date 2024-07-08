import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        int col, row;
        String symbol;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of columns: ");
        col = scanner.nextInt();
        System.out.print("Enter the number of rows: ");
        row = scanner.nextInt();
        System.out.print("Enter the symbol: ");
        symbol = scanner.next();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}
