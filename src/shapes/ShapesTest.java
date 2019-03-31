package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(5,4);
//        Square box2 = new Square(5);
//
//
//
//        System.out.println(box1.getperimenter());
//        System.out.println(box1.getArea());
//
//        System.out.println(box2.getperimenter());
//        System.out.println(box2.getArea());
//
//        System.out.println(box2.babySquare());


        Measurable mySquare = new Square(5);

        Measurable myRectangle = new Rectangle(5,4);


        System.out.println(mySquare.getArea());
        System.out.println(mySquare.getPerimeter());

        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());









    }
}
