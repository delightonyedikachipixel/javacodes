import java.util.Scanner;

public class CheckoutSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the customer's name?");
        String customersName = input.nextLine();

        System.out.println("What did the user buy?");
        String usersItem = input.nextLine();

        System.out.println("How many pieces did the user buy?");
        int numberOfItems = input.nextInt();

        System.out.println("How much per unit?");
        double pricePerUnit = input.nextInt();

        input.nextLine(); 

        System.out.println("Would you like to add more items? (true/false)");
        boolean response = input.nextBoolean();

        if (response) {
            input.nextLine(); 

            System.out.println("What did the user buy?");
            String moreGoods = input.nextLine();

            System.out.println("How many pieces did the user buy?");
            int numberOfPieces = input.nextInt();

            System.out.println("How much per unit?");
            double pricePerUnit2 = input.nextInt();
        }

        input.nextLine(); 

        System.out.println("What is the cashier's name?");
        String cashiersName = input.nextLine();

        System.out.println("How much discount is the customer getting?");
        double customersDiscount = input.nextInt();
        
        System.out.println("====================================================");
        System.out.print("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println( "03293828343");
        System.out.println("Date: 18-Dec-22 8:57:31 pm");
        System.out.println("Cashier's Name" );
        System.out.println("Chukwuma Adekunle Ciroma");        
        
         String item1 = "Parfait";
        int quantity1 = 2;
        double price1 = 2100;

        String item2 = "Rice";
        int quantity2 = 2;
        double price2 = 550;

        double total1 = quantity1 * price1;
        double total2 = quantity2 * price2;
        double subTotal = total1 + total2;

        double discount = 424;
        double vat = subTotal * 0.175;  

        double billTotal = subTotal - discount + vat;
         System.out.println("====================================================");
        System.out.printf("%-20s %-10s %-15s %-10s%n","ITEM","quantity","PRICE","TOTAL(NGN)");
        System.out.println("----------------------------------------------------");

        System.out.printf("%-15s %-10d %-15.2f %-15.2f%n", item1, quantity1, price1, total1);
        System.out.printf("%-15s %-10d %-15.2f %-15.2f%n", item2, quantity2, price2, total2);

        System.out.println("----------------------------------------------------");
        System.out.printf("Sub Total: %.2f%n", subTotal);
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("VAT @ 17.5%%: %.2f%n", vat);

        System.out.println("====================================================");
        System.out.printf("Bill Total: %.2f%n", billTotal);
        System.out.println("====================================================");


        System.out.print("How much did the customer give to you? ");
        double amountPaid = input.nextDouble();



     if(amountPaid >= billTotal){
            double balance = amountPaid - billTotal;
            System.out.printf("Balance: %.2f%n", balance);
        }else{
            double balance = billTotal - amountPaid;
            System.out.println("INSUFFICIENT AMOUNT PAID");
        }

        System.out.println("====================================================");
        System.out.println("THANK YOU FOR YOUR PATRONAGE");
        System.out.println("====================================================");



    }
}

