/** @author <ნათია ჭაფოძე> */
package homework6;

public class Student {

    String name;
    int [] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }
    public double averageGrade (){
            int sum=0;
            for (int i = 0; i < grades.length; i++) {
        sum =sum+ grades[i];
    }
        return (double) sum / grades.length;}

        public String getStatus() {

            if (averageGrade() >= 60) {
                return "Pass";
            } else {
                return "Fail";
            }
    }
}
