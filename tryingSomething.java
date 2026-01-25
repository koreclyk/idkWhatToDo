//TRY THIS AGAIN
import java.util.Scanner;

class TryMe{

   public static String formatInfo(String iname, double iprice, int iqty){
      return String.format("-----Belethor's Goods-----\nCashier: Belethor\t\tDate: 09/18/2023\n\nQTY\tDesc\t\t\tAmt\n"%d\t%s\t\t\t%d",
                           iqty, iname, iprice);
   }

   public static void main (String[] args){
      Scanner in = new Scanner(System.in);

      String iname;
      double iprice;
      int iqty;

      System.out.print("Enter the number of

/*
import java.util.Scanner;

class TryingMe{

   public static String formatInfo(String fname, int fNum, float eGPA){
      return String.format("First Name: %s\nNumber: %d\nExpected GPA: %.2f", //this will tell the system to give me a result
                           fname, fNum, eGPA);
   //I had a print statement here thinking it would print my result but that needs to print the "formattedStr" item to get the results
   }
   
   
   public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      
      String fname;
      int faveNum;
      float expectedGPA;

      System.out.print("Enter your first name: ");
      fname = in.next();

      System.out.print("Enter your favorite number: ");
      faveNum = in.nextInt();

      System.out.print("Enter your expected GPA for this class: ");
      expectedGPA = in.nextFloat();

      
      String formattedStr = formatInfo(fname, faveNum, expectedGPA);
      
      System.out.println();
      formatInfo(fname, faveNum, expectedGPA);

      System.out.println(formattedStr); //prints the received input
      
   }
}
*/
