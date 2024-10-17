package HW1;

import java.util.Date;
import java.util.Scanner;

public class Homework {
 /*
    Additonal Homework questions to tackle after printReceipt HW:
    1. How do we get rid of an object?
    2. create a small demo to understand variable scope in java
    3. what's the constructor called that has parameters
     */


    //Small demo variable scope
     /*
        step one-uncomment out line 59, view the error

        step two-uncomment out line 28, notice that didn't fix the error, although we declared the variable outside the method that didn't allow us
        to access the variable 'Name' we intended to print out. This is because the variable 'Name' we wanted to print is a local variable meaning it only
        exist within the block of code it's declared in. As the variable Name declared at the top of the class is not the same variable 'Name' inside the method

        step three-Add the non access modifier 'static' at the beginning of the statement on line 28, if you test this at this point you will get a null return
        because we are still not accessing the variable Name within the printReceipt method. In order to access the same variable we need to take out the data
        type we placed in front of the variable name on line 41 to tell the program they are the same variable
         */

  // String Name;


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
        System.out.printf("%-10s %-5s %10s %10s%n", "Name","Qty","Price","Total");
        System.out.printf("%-10s %-5s %10s %10s%n", "-----","-----","-----","-----\n");
        System.out.printf("%-10s %-5d %10.2f %10.2f%n",Name,qty,price,total);
        System.out.println("\n" + closingStatement + "\n \n" + purchaseDate);
        System.out.println("\n-------------------------------------------------------------");
    }

    public static void main(String[] args) {
       printReceipt();

        // System.out.println(Name);

    }
}
