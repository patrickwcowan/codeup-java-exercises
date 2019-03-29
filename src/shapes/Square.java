package shapes;

public class Square extends Rectangle {
    protected int side;


    public Square(int side) {
        super(side,side);
    }

    public int getperimenter() {
        System.out.println("Square");
        return 4 * this.length;
    }

    public int getArea() {
        System.out.println("Square");
        return this.length * this.width;
    }

    public String babySquare() {
        return "this is a baby square";
    }

}
