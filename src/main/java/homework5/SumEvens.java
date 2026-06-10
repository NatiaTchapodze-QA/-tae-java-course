/** @author Natia Tchapodze */
package homework5;
public class SumEvens {
    public static int sumEvens(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int result = sumEvens(1, 76);
        System.out.println(result);
    }
}
