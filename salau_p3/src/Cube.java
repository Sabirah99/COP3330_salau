public class Cube extends Shape3D {
    public Cube(double length) {
        super();
        this.length = length;

    }

    @Override
    public String getName() {
        return "cube";
    }

    @Override
    public double getArea() {
        return 0;
    }
}