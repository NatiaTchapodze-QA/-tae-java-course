/** @author <ნათია ჭაფოძე> */
package homework6;

public class Main {

    public static void main (String[] args) {

        Person p1= new Person("Natia", 38, "nchapodze@credo.ge");
        Person p2= new Person("Mate", 16, "mate@credo.ge");

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getEmail());

        p1.introduce();
        p2.introduce();

  BankAccount acc = new BankAccount("ნათია ჭაფოძე", 10000);
  acc.deposit(50);
  System.out.println(acc.getBalance());

  Counter c = new Counter();
  c.countTo(5);
  System.out.println(c.count);

new Dog("Rex").makeSound();

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.area());

        Circle circle = new Circle(3);
        System.out.println(circle.area());
        new Car("Toyota", 2020, 4).info();

        Calculator calc = new Calculator();

        System.out.println(calc.calculate(10, 3, '+'));
        System.out.println(calc.calculate(10, 2, '-'));
        System.out.println(calc.calculate(10, 0, '/'));
        Student s = new Student("ანა", new int[]{85, 92, 78});

        System.out.println(s.getStatus());
    }
}
