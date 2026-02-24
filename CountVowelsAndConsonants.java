import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = input.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int counter = 0; counter < word.length(); counter++) {

            char ch = word.charAt(counter);

            
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("The Number Of Vowels is " + vowels);
        System.out.println("The Number Of Consonants is " + consonants);

        
    }
}
