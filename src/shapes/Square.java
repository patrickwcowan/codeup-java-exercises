package shapes;

public class Square extends Quadrilateral {
//    protected int side;
//
//
//    public Square(int side) {
//        super(side,side);
//    }
//
//    public int getperimenter() {
//        System.out.println("Square");
//        return 4 * this.length;
//    }
//
//    public int getArea() {
//        System.out.println("Square");
//        return this.length * this.width;
//    }
//
//    public String babySquare() {
//        return "this is a baby square";
//    }


    public Square(int length) {
        super(length, length);
    }

    public void setLength() {
        this.length = length;
    }


    public void setWidth() {
        this.width = width;
    }


    public int getPerimeter() {
        return 4 * length;
    }


    public int getArea() {
        return length * length;
    }


}
