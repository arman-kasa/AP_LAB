public class Circle implements Shape {
    private int radius;

    public Circle (int radius){
        super();
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius ;
        return perimeter;

    }

    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius ;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Type : Circle         " + "Perimeter : " + calculatePerimeter() + "         Area : " + calculateArea());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int getRadius() {
        return radius;
    }
/*

    public double calculatePerimeter(){
        double perimeter = 2 * Math.PI * radius ;
        return perimeter;

    }

    public double calculateArea(){
        double area = Math.PI * radius * radius ;
        return area;
    }

    public void draw (){
        System.out.println("Type : Circle         " + "Perimeter : " + calculatePerimeter() + "         Area : " + calculateArea());
    }

    @Override
    public boolean equals() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        return getRadius() == circle.getRadius();
    }

    @Override
    public int hashCode() {
        return getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + "}";
    }*/
}
