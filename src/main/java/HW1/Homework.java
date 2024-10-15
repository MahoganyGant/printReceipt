package HW1;

import java.util.Date;
import java.util.Scanner;

public class Homework {


    //create a method named printReceipt
    public static void printReceipt(){
        //Instantiating what we know
        Date date = new Date();
        String closingStatement = "\t\tThank you. Come again!!!";
        String purchaseDate = String.format("Purchased on: %tA, %<tB %<td, 2024" , date);

        //scanning for all the information, and storing the values we scanned for
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the name of your product?: ");
        String Name = scan.nextLine();
        System.out.println("How many are you buying today?: ");
        int qty = scan.nextInt();
        System.out.println("What is the price of the product?: ");
        double price = scan.nextDouble();
        double total = price*qty;

        System.out.println("-------------------------------------------------------------\n");
        System.out.printf("%-10s %5s %10s %10s%n", "Name","Qty","Price","Total");
        System.out.printf("%-10s %5s %10s %10s%n", "-----","-----","-----","-----\n");
        System.out.printf("%-10s %5d %10.2f %10.2f%n",Name,qty,price,total);
        System.out.println("\n" + closingStatement + "\n \n" + purchaseDate);
        System.out.println("\n-------------------------------------------------------------");
    }

    public static void main(String[] args) {
       printReceipt();
    }
}
