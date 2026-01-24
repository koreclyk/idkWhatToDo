import java.util.Scanner;

class TryingMe{

   public static String formatInfo(String fname, int fNum, float eGPA){
      return String.format("First Name: %s\nNumber: %d\nExpected GPA: %.2f",
                           fname, fNum, eGPA);
   
   }
   
   
   public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      
      String fname;
      int faveNum;
      float expectedGPA;
      

      
      String formattedStr = formatInfo(fname, faveNum, expectedGPA);
      
      System.out.println();
      
   }
}
