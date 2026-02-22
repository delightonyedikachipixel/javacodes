import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        for (int count = 0; count < text.length(); count++) {
            System.out.println(text.charAt(count));
        }

        
    }
}
