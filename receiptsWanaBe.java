// DONE! 1/28/26
// Here's what was submitted

//v3
/*

NOTE TO REVIEWER:
I'm aware that double types are more precise and I did start with double.
However, I chose to submit float types hoping to build a program that stresses the hardware less.

QUESTION:
Is this a valid thought?

*/


import java.util.Scanner;

class SSnBrews{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
      float pototprice = 1.1f;
      float cacarotprice = 0.98f;
      float gingarprice = 0.75f;
      float broprice = 3.0f;
      float meatprice = 4.0f;
      
      System.out.print("\n~~~Soups, Stews, and all Kinds of Brews!~~~\n\n");
      System.out.print("\t\t\tWhat we got!\n\n");
        
     //adding spaces so they come out straight
      System.out.printf("Potatoes:\t\t$%.2f\n", pototprice);
      System.out.printf("Carrots:\t\t   $%.2f\n", cacarotprice);
      System.out.printf("Ginger:\t\t   $%.2f\n", gingarprice);
      System.out.printf("Broth(s):\t\t$%.2f\n", broprice);
      System.out.printf("Meat(s):\t\t   $%.2f", meatprice);

      System.out.println("\n\nHow many potatoes would you like?: ");
      float pototqty = in.nextFloat();

      System.out.println("How many carrots would you like?: ");
      float cacarotqty = in.nextFloat();

      System.out.println("How much ginger would you like?: ");
      float gingarqty = in.nextFloat();

      System.out.println("How much broth would you like?: ");
      float broqty = in.nextFloat();

      System.out.println("How much meat would you like?: ");
      float meatqty = in.nextFloat();
      
      float pototpur = pototprice * pototqty;
      float cacarotpur = cacarotprice * cacarotqty;
      float gingarpur = gingarprice * gingarqty;
      float bropur = broprice * broqty;
      float meatpur = meatprice * meatqty;

      System.out.println("\n\nQuantity\t\tItem\t\t\t\tCost\n");
      System.out.printf("%.0f\t\t\t\tPotato(es)\t\t$%.2f", pototqty, pototpur);
      System.out.printf("\n%.0f\t\t\t\tCarrot(s)\t\t$%.2f", cacarotqty, cacarotpur);
      System.out.printf("\n%.0f\t\t\t\tGinger\t\t\t$%.2f", gingarqty, gingarpur);
      System.out.printf("\n%.0f\t\t\t\tBroth(s)\t\t\t$%.2f", broqty, bropur);
      System.out.printf("\n%.0f\t\t\t\tMeat(s)\t\t\t$%.2f", meatqty, meatpur);
      
      float subtot = pototpur + cacarotpur + gingarpur + bropur + meatpur;
      float tax = subtot * 85 / 100; // using subtot * 0.85 gave me datatype mismatch errors
      float toats = subtot + tax;    // instead of converting to double, I changed my math and kept them float

      System.out.printf("\n\nSubtotal:\t\t$%.2f", subtot);
      System.out.printf("\nTax:\t\t\t\t$%.2f", tax);
      System.out.printf("\n\nTotal:\t\t\t$%.2f\n\n", toats);

      System.out.print("How much will you be paying with today?: ");
      float custin = in.nextFloat();

      float custdone = toats - custin;

      System.out.printf("\nRemaining: $%.2f", custdone);
      System.out.print("\n\n\t\t\tThank you for shopping at \n~~~Soups, Stews, and all Kinds of Brews!~~~");
      System.out.print("\n\t\t\t\tSee you next time!");
      
      
   }
}
