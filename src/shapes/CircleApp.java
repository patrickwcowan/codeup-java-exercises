package shapes;
import util.Input;
public class CircleApp {

    public static void main(String[] args) {

        boolean response;
        do {
            System.out.println("Please the radius: ");
            Input p1 = new Input();
            double rad = p1.getDouble();
            Circle radius = new Circle(rad);
            System.out.println(radius.getArea());
            System.out.println(radius.getCircumference());

            System.out.println("Would you like to make another?");
            response = p1.yesNo();
        } while (response);
    }
}
