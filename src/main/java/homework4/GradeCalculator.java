/** @author <Natia Tchapodze> */

package homework4;

public class GradeCalculator {

    public static void main(String[] args) {

        int month = 10;
        String grade;

        if (month == 12) {
            grade = "A";
        }
        else if (month >= 9 && month <= 11) {
            grade = "B";
        }
        else if (month >= 6 && month <= 8) {
            grade = "C";
        }
        else if (month >= 3 && month <= 5) {
            grade = "D";
        }
        else {
            grade = "F";
        }

        System.out.println("შეფასება: " + grade);

        }
}
