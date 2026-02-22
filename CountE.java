import java.util.Scanner;
public class CountE {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter text:");
    String text = input.nextLine;
       
        int counter = 0;
        for (int count = 0; count < text.length(); count++) {
            char c = text.charAt(count);
            if (c == 'e' || c == 'E') {
                counter++;
            }
        }
        System.out.println("Number of 'e's: " + counter);
    }
}
