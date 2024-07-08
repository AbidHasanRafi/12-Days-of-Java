public class Arrays {
    public static void main(String[] args) {
        // String[] bike = {"Pulsar", "Apache", "Gixxer"};
        // bike[1] = "Hunk";
        // System.out.println(bike[1]);

        String[] bike = new String[3];

        bike[0] = "Pulsar";
        bike[1] = "Apache";
        bike[2] = "Gixxer";

        for (int i = 0; i < bike.length; i++) {
            System.out.println(bike[i]);
        }
    }
}
