
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    public void testSquareName(){
        Shape shape = new Square(10);
        assertEquals("square", shape.getName());
    }

    @Test
    public void testSquareArea(){
        Shape2D shape = new Square(10);
        assertEquals(100, shape.getArea());
    }

    @Test
    public void testSquareArea2(){
        Shape2D shape = new Square(0.5);
        assertEquals(0.25, shape.getArea());
    }

    @Test
    public void testTriangleName(){
        Shape shape = new Triangle(100, 100);
        assertEquals("triangle", shape.getName());
    }

    @Test
    public void testTriangleArea(){
        Shape2D shape = new Triangle(10, 10);
        assertEquals(50, shape.getArea());
    }

    @Test
    public void testCircleName(){
        Shape shape = new Circle(10);
        assertEquals("circle", shape.getName());
    }

    @Test
    public void testCubeName(){
        Shape shape = new Cube(10);
        assertEquals("cube", shape.getName());
    }

    @Test
    public void testPyramidName(){
        Shape shape = new Pyramid(10,10,10);
        assertEquals("pyramid", shape.getName());
    }

    @Test
    public void testSphereName(){
        Shape shape = new Sphere(10);
        assertEquals("sphere", shape.getName());
    }



}