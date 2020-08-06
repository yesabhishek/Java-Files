package misc;
import java.lang.*;

public class SetCharAt {

   public static void main(String[] args) {
  
   StringBuilder str = new StringBuilder("AMIT");
   System.out.println("string = " + str);
   // character at index 3
   System.out.println("character at index 3 = " + str.charAt(3));
  
   // set character at index 3
   str.setCharAt(3, 'L');
  
   System.out.println("After Set, string = " + str);
   // character at index 3
   System.out.println("character at index 3 = " + str.charAt(3));
   }
}