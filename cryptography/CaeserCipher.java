import java.util.Scanner;

public class CaeserCipher {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("Enter text:");
        String text = input.nextLine().toUpperCase();

        System.out.println("Enter shift number:");
        int shiftNumber = input.nextInt();

        String result = "";

        for (int counter = 0; counter < text.length(); counter++) {
            char c = text.charAt(counter);

                      if (alphabet.indexOf(c) != -1) {
                int originalPosition = alphabet.indexOf(c);
                int newPosition = (originalPosition + shiftNumber) % 26; 
                result += alphabet.charAt(newPosition);
            } else {
                
                result += c;
            }
        }

        System.out.println("Encrypted text: " + result);

        
    }
}

