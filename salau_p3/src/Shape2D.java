public abstract class Shape2D extends Shape {

    String name;
    double length;
    double height;
    double base;



    public double getArea() {
        double area = length * length;
        return area;
    }


    public double getArea(double base, double height) {
        double area = (base * height) * (0.5);
       return area;
    }





}
