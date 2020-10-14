public class Circle extends Shape2D {

    double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "circle";
    }

}
