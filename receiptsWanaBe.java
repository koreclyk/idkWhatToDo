// receipts rough draft

/*
RELEVANT INFO:
System.out.print() >>>prints output
methods & classes
DECLARING AND STORING VALUES: int/double/String
operations
receiving user input: import java.util.Scanner
                      public static void main (String[] args){
                        Scanner in = new Scanner(System.in);
reading inputs
output formatting: printf(%.2f)

ch 2 variable storage & calculations
*/


//YOU CAN SPECIFY THEIR TYPES UNDER THE PRINT STATEMENT

import java.util.Scanner;

class ReceiptsWanaBe{
  public static void main(String[] args){
    //i don't need it~
    Scanner in = new Scanner(System.in);

    //Chapter 2
    String iName1;
    String iName2;
    String iName3;
    String iName4;
    String iName5;
    int iqty1;
    int iqty2;
    int iqty3;
    int iqty4;
    int iqty5;
    double iPrice1;
    double iPrice2;
    double iPrice3;
    double iPrice4;
    double iPrice5;
    String dispPrice1;
    String dispPrice2;
    String dispPrice3;
    String dispPrice4;
    String dispPrice5;
    double subtot;
    double tax;
    double total;
    double count1;
    double count2;
    double count3;
    double count4;
    double count5;

    iName1 = "Potato(s)";
    iName2 = "Carrot(s)";
    iName3 = "Ginger";
    iName4 = "Broth(s)";
    iName5 = "Meat(s)";

    iPrice1 = 1.10;
    iPrice2 = 0.98;
    iPrice3 = 0.75;
    iPrice4 = 3.00;
    iPrice5 = 4.00;
    

    //Chapter 3: this will receive specific input for EVERYTHING
    //will need to adjust to account for information that's already entered... or maybe...
    System.out.print("How many potatoes do you want?: ");
    iqty1 = input.nextInt();

    System.out.print("How many carrots do you want?: ");
    iqty2 = input.nextInt();

    System.out.print("How much ginger do you want?: ");
    iqty3 = input.nextInt();

    System.out.print("How much broth do you want?: ");
    iqty4 = input.nextInt();

    System.out.print("How much meat do you want?: ");
    iqty5 = input.nextInt();

    //for display only~
    dispPrice1 = "$1.10";
    dispPrice2 = "$0.98";
    dispPrice3 = "$0.75";
    dispPrice4 = "$3.00";
    dispPrice5 = "$4.00";


    //Chapter 2: math it!
    //Quantities * item price
    count1 = iqty1 * iPrice1;
    count2 = iqty2 * iPrice2;
    count3 = iqty3 * iPrice3;
    count4 = iqty4 * iPrice4;
    count5 = iqty5 * iPrice5;

    //Everything put together
    subtot = count1 + count2 + count3 + count4 + count5;
    tax = subtot * 0.085;
    total = subtot + tax;

    //Ch. 1 and 3 >>>
    System.out.println("\t\t-----Soups, Stews, and all kinds of Brews!-----");
    System.out.println("WHAT WE GOT\n\t",
                       iName1, "\t\t", dispPrice1, "\n\t",
                       iName2, "\t\t", dispPrice2, "\n\t",
                       iName3, "\t\t", dispPrice3, "\n\t",
                       iName4, "\t\t", dispPrice4, "\n\t",
                       iName5, "\t\t", dispPrice5, "\n");
    System.out.print("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
    System.out.printf("Subtotal: $%.2f\n", subtotal); //why didn't i just do this for prices................. omg
    System.out.printf("Tax: $%.2f\n", tax);
    System.out.printf("Total: $%.2f\n", total);
  }
}


