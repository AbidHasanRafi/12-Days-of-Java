import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {
    public static void main(String[] args) {
        try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Vabee ami vabee ami,\nVabte valobashi!\nVabte vabte prithibita,\nMonmora udashi!");
			writer.append("\n\n-Abid");
			writer.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
    }
}
