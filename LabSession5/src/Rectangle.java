public class Rectangle implements Shape ,Polygon {
    int[] slide = new int[4];
    @Override
    public int[] getSlide() {
        return slide;
    }

    public Rectangle ( int... slides){
        super();
        int i = 0;
        for (int a : slides) {
            slide[i] = a ;
            i++;
        }
    }
    @Override
    public double calculatePerimeter() {
        double perimeter = slide[0] + slide[1] + slide[2] + slide[3] ;
        return perimeter;

    }

    @Override
    public double calculateArea() {
        double area = slide[0]*slide[1];
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Type : Rectangle         " + "Perimeter :" + calculatePerimeter() + "         Area :" + calculateArea());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "''Rectangle::" + "side1:" + slide[0] + ", side2:" + slide[1] + ", side3:" + slide[2] + ", side4:" + slide[3] + "''";
    }

    public boolean isSquare(){
        if ((this.slide[0] == this.slide[1])&& (this.slide[0] == this.slide[2])&& (this.slide[0] == this.slide[3])&& (this.slide[1] == this.slide[2]) && (this.slide[1] == this.slide[3])&& (this.slide[2] == this.slide[3]))
            return true;
        else return false;
    }
    /*int a ;
    int b;
    int c ;
    int d ;
    public Rectangle (int a , int b , int c , int d){
        this.a = a;
        this.b = b;
        this.c = c ;
        this.d = d ;
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

    public int getD() {
        return d;
    }

    public double calculatePerimeter(){
        double perimeter = a + b + c + d ;
        return perimeter;

    }

    public double calculateArea(){
        double area = a*b;
        return area;
    }

    public void draw (){
        System.out.println("Type : Rectangle         " + "Perimeter :" + calculatePerimeter() + "         Area :" + calculateArea());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (getA() != rectangle.getA()) return false;
        if (getB() != rectangle.getB()) return false;
        if (getC() != rectangle.getC()) return false;
        return getD() == rectangle.getD();
    }

    @Override
    public int hashCode() {
        int result = getA();
        result = 31 * result + getB();
        result = 31 * result + getC();
        result = 31 * result + getD();
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "}";
    }
*/}
