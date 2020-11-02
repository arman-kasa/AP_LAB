import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Paint {
   ArrayList<Shape> shapes = new ArrayList<>();
    public Paint (){
        shapes = new ArrayList<>();
    }

  /*  public void  addCircle(Circle circle){
        circles.add(circle);
    }

    public void  addTriangle(Triangle triangle){
        triangles.add(triangle);
    }

    public void  addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);
    }
*/

    public void AddShape(Shape shape){
        shapes.add(shape);
    }
    public void  drawAll (){
        for (Shape circle: shapes) {
            circle.draw();
        }

        for (Shape triangle: shapes) {
            triangle.draw();
        }
        for (Shape rectangle: shapes) {
            rectangle.draw();
        }

    }

    public void printAll(){
        for (Shape circle: shapes) {
            circle.toString();
        }

        for (Shape triangle: shapes) {
            triangle.toString();
        }

        for (Shape rectangle: shapes) {
            rectangle.draw();
        }

    }
        public void describeEqualSlides(){
            for (Shape shape: shapes) {
                if (shape instanceof Triangle && ((Triangle) shape).isEquilateral()){
                    System.out.println("Triangle is Equilateral");
                }
                if (shape instanceof Rectangle && ((Rectangle) shape).isSquare()){
                    System.out.println("Rectangle is Square");
                }
            }
        }
}
