/** @author <Natia Tchapodze> */

package homework4;

public class Factorial {public static void main(String[] args) {

   int month=10;
   long factorial=1;
   for (int i=1; i<=month; i++)
   {factorial=factorial*i;
   }
    System.out.println(month + "! = " + factorial);

    }
}

