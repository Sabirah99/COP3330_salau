public class Sphere extends Shape3D {

    double radius;
    public Sphere(double radius) {
        super();
        this.radius = radius;

    }

    @Override
    public String getName() {
        return "sphere";
    }

    @Override
    public double getArea() {
        return 0;
    }
}