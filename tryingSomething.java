import java.util.Scanner;

class TryingMe{

   public static String formatInfo(String fname, int fNum, float eGPA){
      return String.format("First Name: %s\nNumber: %d\nExpected GPA: %.2f",
                           fname, fNum, eGPA);
      System.out.printf("First Name: %s\nNumber: %d\nExpected GPA: %.2f",
                           fname, fNum, eGPA);
   
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
      
   }
}

/* is this working? >>> no, it's not (trying to see if the file will update on desktop)
it isn't updating in real time?
*/
