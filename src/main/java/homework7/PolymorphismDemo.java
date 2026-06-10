/** @author <Natia Tchapodze> */
package homework7;

public class PolymorphismDemo {

    public static void main(String[] args) {
    Animal[] animals = new Animal[4];
    animals[0] = new Dog("Jeka");
    animals[1] = new Cat("Katuna");
    animals[2] = new Dog("Brolia");
    animals[3] = new Cat("Fiso");
        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            if (animal instanceof Dog) {
                System.out.print(animal.name + " (Dog): ");
            } else if (animal instanceof Cat) {
                System.out.print(animal.name + " (Cat): ");
            }
            animal.makeSound();
            animal.sleep();
        }
}
}