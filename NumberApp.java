import java.util.Scanner;

public class NumberApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Number App:");
        System.out.println("Enter a number:");
        int number = input.nextInt();

        
        System.out.println("The factors are:");
        for (int factor = 1; factor <= number; factor++) {
            if (number % factor == 0) {
                System.out.println(factor);
            }
        }

        
        if (number < 0) {
            System.out.println("Number is not a perfect square.");
        } else {
            boolean isPerfectSquare = false;

            for (int squaredNumber = 1; squaredNumber * squaredNumber <= number; squaredNumber++) {
                if (squaredNumber * squaredNumber == number) {
                    isPerfectSquare = true;
                    break;
                }
            }

            if (isPerfectSquare) {
                System.out.println("Number is a perfect square.");
            } else {
                System.out.println("Number is not a perfect square.");
            }
        }

       
        if (number % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

       
        System.out.println("The number squared is = " + (number * number));

        
        if (number <= 1) {
            System.out.println(number + " is not prime");
        } else {
            boolean isPrime = true;

            for (int counter = 2; counter < number; counter++) {
                if (number % counter == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }
        }

        
    }
}
