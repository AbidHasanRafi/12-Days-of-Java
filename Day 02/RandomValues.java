import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(10)+1;
        System.out.println(x);

        double y = random.nextDouble(10)+1;
        System.out.println(y);

        boolean z = random.nextBoolean();
        System.out.println(z);
    }

}