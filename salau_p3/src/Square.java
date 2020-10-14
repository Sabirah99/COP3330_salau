public class Square extends Shape2D {
    public Square(double length) {
        super();
        this.length = length;

    }

    @Override
    public String getName() {
        return "square";
    }


    public double getArea(double length) {
        return length * length;
    }
}
