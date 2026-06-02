/** @author Natia Tchapodze */
package homework5;
public class GradeCalculator {

    public static String getGrade(int score) {
        if (score < 0 || score > 100) {
            return "Invalid"; }
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }

        }
        public static void main(String[] args) {

            String result = getGrade(85);
            System.out.println(result);
            String result2 = getGrade(40);
            System.out.println(result2);
            String result3 = getGrade(101);
            System.out.println(result3);
    }
}
