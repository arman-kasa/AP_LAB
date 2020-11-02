public class Main {
    public static void main(String[] args) {
       Shape shape1 = new Triangle(2 ,2 , 2 );
        System.out.println(shape1.calculatePerimeter());
        Shape shape = new Rectangle(1 , 1 ,1 , 1);
        Paint paint = new Paint();
        paint.AddShape(shape);
        paint.AddShape(shape1);
        paint.printAll();
        paint.drawAll();
        paint.describeEqualSlides();

        /* Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);

        Rectangle rectangle = new Rectangle(1 , 4 , 1 ,4);
        Rectangle rectangle1  = new Rectangle(8 , 5 , 8 ,5);
        Rectangle rectangle2  = new Rectangle(6 , 6 , 6 ,6);

        Triangle triangle = new Triangle(2, 2 , 2);
        Triangle triangle1 = new Triangle(4 , 4 , 6);

        Paint paint = new Paint();

        paint.addCircle(circle1);
        paint.addCircle(circle2);
        paint.addRectangle(rectangle);
        paint.addRectangle(rectangle1);
        paint.addRectangle(rectangle2);
        paint.addTriangle(triangle);
        paint.addTriangle(triangle1);
        paint.drawAll();
        paint.printAll();*/
    }
}
