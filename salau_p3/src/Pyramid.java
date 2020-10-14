public class Pyramid extends Shape3D {
    double side1, side2, side3;
    public Pyramid(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side1;
        this.side3 = side1;

    }

    @Override
    public String getName() {
        return "pyramid";
    }

    @Override
    public double getArea() {
        return 0;
    }
}