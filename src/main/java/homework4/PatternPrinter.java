/** @author <Natia Tchapodze> */
package homework4;

public class PatternPrinter {
    public static void main(String[] args) {

  String name="Natia";

  int n=name.length();
  for (int i=1; i<=n; i++) {
      for (int j=1; j<=i; j++)
      {
          System.out.print("*");
        }
      System.out.println();

  }
    }
}

