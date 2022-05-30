package ge.ufc.homework2;

public class Rectangle {

    public double length;
    public double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double getPerimeter(){
        return (length + width)*2;
    }

    public int comparePerimeter(Rectangle r1, Rectangle r2){
        if (r1.getPerimeter() > r2.getPerimeter()) {
            return 1;
        }else if (r1.getPerimeter() < r2.getPerimeter()){
            return -1;
        }else
            return 0;
    }

}

