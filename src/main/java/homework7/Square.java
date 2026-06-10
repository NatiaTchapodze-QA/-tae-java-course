/** @author <Natia Tchapodze> */
package homework7;

public class Square implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing Square");

    }
    public static void main(String[] args) {
        Drawable[] arr = {
                new Square(),
                new Triangle(),
                new Star()
        };
        for (int i = 0; i < arr.length; i++) {
            arr[i].draw();
        }
    }
}
