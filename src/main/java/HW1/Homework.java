package HW1;

import java.util.Date;
import java.util.Scanner;

public class Homework {


    //create a method named printReceipt
    public static void printReceipt(){
        //Instantiating what we know
        Date date = new Date();
        String closingStatement = "Thank you. Come again!!!";
        String purchaseDate = String.format("Purchased on: %tA, %<tB %<td, 2024" , date);

        //scanning for all the information, and storing the values we scanned for
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the name of your product?: ");
        String productName = scan.nextLine();
        System.out.println("How many are you buying today?: ");
        int qty = scan.nextInt();
        System.out.println("What is the price of the product?: ");
        double price = scan.nextDouble();
        double total = price*qty;
        String fTotal = String.format("%.2f",total);

        System.out.println("-------------------------------------------------------------\n" +
                "Name    Qty    Price    Total\n" +
                "-----   ----   -----   ------\n" + productName + "     " + qty + "     $" + price + "     $" + fTotal + "\n \n" + closingStatement + "\n \n" + purchaseDate
        + "\n-------------------------------------------------------------");
    }

    public static void main(String[] args) {
       printReceipt();
    }
}
