/** @author <Natia Tchapodze> */
package homework4;

public class SumOfDigits {

    public static void main(String[] args) {
        int year = 1987;

        int sum = 0;

        while (year > 0) {

            int digit = year % 10;

            sum = sum + digit;

            year = year / 10;
        }

        System.out.println("ციფრების ჯამი: " + sum);

        }
}

