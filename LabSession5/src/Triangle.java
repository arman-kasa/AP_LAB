import java.awt.Paint;
import java.io.PipedOutputStream;
import java.util.ArrayList;

public class Triangle implements Polygon, Shape {
    int[] slide = new int[3];
    @Override
    public int[] getSlide() {
        return slide;
    }

    public Triangle(int... slides){
        super();
        int i = 0;
        for (int a : slides) {
            slide[i] = a ;
            i++;
        }
    }
    @Override
    public double calculatePerimeter() {
        double perimeter = slide[0] + slide[1] + slide[2];

        return perimeter;
    }

    @Override
    public double calculateArea() {
        double p =( this.calculatePerimeter()/ 2) ;
        double area = Math.sqrt((p) * ( p -slide[0] ) * (p- slide[2]) * ( p - slide[1])) ;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Type : Triangle         " + "Perimeter :" + calculatePerimeter() + "         Area :" + calculateArea());
    }

    @Override
    public boolean equals(Object object) {
        return false;
    }

    @Override
    public String toString() {
        return "''Triangle::" + "side1:" + slide[0] + ", side2:" + slide[1] + ", side3:" + slide[2] + "''";
    }

    public boolean isEquilateral(){
        if ((this.slide[0] == this.slide[2] ) && (this.slide[0] == this.slide[2]) &&(this.slide[1] == this.slide[2]))
            return true;
        else
            return false;
    }

    /* int a ;
    int b;
    int c ;
    public Triangle (int a , int b , int c){
        this.a = a;
        this.b = b;
        this.c = c ;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double calculatePerimeter(){
        double perimeter = a + b + c ;
        return perimeter;

    }

    public double calculateArea(){
        double p =( this.calculatePerimeter()/ 2) ;
        double area = Math.sqrt((p) * ( p -a ) * (p- b) * ( p - c)) ;
        return area;
    }

    public void draw (){
        System.out.println("Type : Triangle         " + "Perimeter :" + calculatePerimeter() + "         Area :" + calculateArea());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (getA() != triangle.getA()) return false;
        if (getB() != triangle.getB()) return false;
        return getC() == triangle.getC();
    }

    @Override
    public int hashCode() {
        int result = getA();
        result = 31 * result + getB();
        result = 31 * result + getC();
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + "}";
    }*/
}
