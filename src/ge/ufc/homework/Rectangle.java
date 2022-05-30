package ge.ufc.homework;

public class Rectangle {

    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length){
        this.length=length;
    }

    public double getLength() {
        return length;
    }

    double getPerimeter(){
        return (length + width)*2;
    }

    double getArea(){
        return length * width;
    }

     public int compareArea(Rectangle r1){
        if (r1.getArea() == this.getArea()){
            return 0;
        }else if (r1.getArea() > this.getArea()){
            return -1;
        }else
            return 1;
    }

}