import java.util.Scanner;
public class Reverse{
    public static void main (String[]args){

    Scanner input = new Scanner(System.in);
System.out.println("Enter a string:");
String text = input.nextLine();

 String Reversed = "";
    for (int counter = text.length() - 1; counter >= 0; counter--) {
            Reversed += text.charAt(counter);

}
     
   System.out.print (Reversed);




}
}

