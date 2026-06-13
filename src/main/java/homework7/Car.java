/** @author <Natia Tchapodze> */
package homework7;

public class Car extends Vehicle{

    public Car(String brand) {
        super(brand);
    }
    @Override
    public void start() {
        System.out.println(brand + ' ' + "engine started");
    }
        public static void main(String[] args) {

            Car car = new Car("Toyota");
            car.start();

            Bike bike = new Bike("Trek");
            bike.stop();
        }
    }

