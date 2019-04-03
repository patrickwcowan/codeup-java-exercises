package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public Rectangle() {
//
//    }
//
//    public int getperimenter() {
//        System.out.println("rectangle");
//        int perimeter = (2 * this.length) + (2 * this.width);
//        return perimeter;
//    }
//
//    public int getArea() {
//        System.out.println("rectangle");
//        int area = this.length * this.width;
//        return area;
//    }



    @Override
    public void setLength() {
        this.length = length;
    }


    public void setWidth() {
        this.width = width;
    }


    public int getPerimeter() {
        return 2 * width + 2 * length;
    }


    public int getArea() {
        return length * width;
    }

    public Rectangle(int length, int width) {
        super(length, width);
    }
}
