package ge.ufc.homework3;

public class Main {

    public static void main(String[] args) {
        ge.ufc.homework.Rectangle r11 = new  ge.ufc.homework.Rectangle();
        ge.ufc.homework.Rectangle r12 = new  ge.ufc.homework.Rectangle();
        r11.setLength(45);
        r11.setWidth(24);
        r12.setLength(41);
        r12.setWidth(54);

        ge.ufc.homework2.Rectangle r21 = new ge.ufc.homework2.Rectangle();
        ge.ufc.homework2.Rectangle r22 = new ge.ufc.homework2.Rectangle();
        r21.setLength(65);
        r21.setWidth(34);
        r22.setLength(45);
        r22.setWidth(24);

        System.out.println(r11.compareArea(r12));
        System.out.println(r21.comparePerimeter(r21,r22));

    }
}

