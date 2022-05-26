package SevenModuleAnother;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setxStart(10);
        circle.setyStart(10);
        circle.setxEnd(20);
        circle.setyEnd(20);

        System.out.println(circle);
        System.out.println("Shape name is " + circle.getShapeName());


    }
}
