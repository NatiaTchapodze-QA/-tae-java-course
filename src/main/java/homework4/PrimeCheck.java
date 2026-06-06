/** @author <Natia Tchapodze> */

package homework4;

public class PrimeCheck {

    public static void main(String[] args) {
        int age = 38;
        boolean isPrime = true;

        for (int i = 2; i < age; i++) {
            if (age % i == 0) {
                isPrime = false;
                break;
            }
    }
           if (isPrime) {
        System.out.println("მარტივია");
    } else {
        System.out.println("არ არის მარტივი");


           }

    }
}
