public class Triangle extends Shape2D {
    double base;
    double height;

    public Triangle(double base, double height){
        super();
        this.base = base;
        this.height = height;
    }
    @Override
    public String getName() {
        return "triangle";
    }


    public double getArea(double base, double height) {
        double area = (base * height) * (0.5);
        return (base * height) * (0.5);
    }
}
