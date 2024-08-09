import java.io.*;

public class Deserialize {

    public static void main(String[] args) {

        User user = null;

        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");  // Use a relative path or adjust as needed
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (User) in.readObject();
            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (user != null) {
            long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
            System.out.println("serialVersionUID: " + serialVersionUID);

            System.out.println("name: " + user.name);
            System.out.println("password: " + user.password);

            user.hello();
        }
    }
}
