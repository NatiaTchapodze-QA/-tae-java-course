/** @author <Natia Tchapodze> */
package homework8;

public class InputValidator {

    public static int processAge(String input)
            throws NumberFormatException, IllegalArgumentException {
        int age = Integer.parseInt(input);
        if (age < 0) {
            throw new IllegalArgumentException("ასაკი არ შეიძლება იყოს უარყოფითი: " + age);
        }
        return age * 12;
    }
    public static void main(String[] args) {

        try {
            System.out.println(processAge("25"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(processAge("-5"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(processAge("abc"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    }

