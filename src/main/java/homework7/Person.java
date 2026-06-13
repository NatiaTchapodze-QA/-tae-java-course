/** @author <Natia Tchapodze> */
package homework7;
import java.util.Arrays;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
    public static void main(String[] args) {

        Person[] people = new Person[4];

        people[0] = new Person("Anna", 25);
        people[1] = new Person("Beka", 30);
        people[2] = new Person("Barbare", 22);
        people[3] = new Person("Natia", 38);
        Arrays.sort(people);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
