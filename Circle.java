package SevenModuleAnother;

public class Circle extends Shape {
    private final String SHAPE_NAME = "Circle";

    public void drawCircle(int xStart, int yStart, int xEnd, int yEnd) {
        //draw the circle based on given coordinates
    }

    @Override
    public String getShapeName() {
        return SHAPE_NAME;
    }

}
