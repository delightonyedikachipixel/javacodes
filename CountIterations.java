public class CountIterations {
    public static void main(String[] args) {
        int counter = 0;

        for (int count = 1; count <= 100; count++) {
            if (count % 7 == 0) {
                counter++;
            }
        }

        System.out.println("The number of multiples of 7 are: " + counter);
    }
}
