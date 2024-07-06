public class Swap {
    public static void main(String[] args) {
        int r = 101;
        int a = 103;
        System.out.println("Before swapping: a = " + a + ", r = " + r);
        int temp;
        temp = r;
        r = a;
        a= temp;
        System.out.println("After swapping: a = " + a + ", r = " + r);
    }
}
