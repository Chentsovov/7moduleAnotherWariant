package SevenModuleAnother;
//Продумай иерархию классов. Здесь должны быть как минимум:
//
//базовый класс для фигуры Shape. Этот класс должен иметь метод для
// вывода имени фигуры.
//классы-наследники - Circle, Quad и т.д. - не меньше 5 вариантов;
//должен быть класс, который принимает фигуру, и выводит ее название.
// Класс должен работать именно с базовым классов Shape.
//Обрати внимание на использование интерфейсов, абстрактных классов,
// модификаторов доступа.
//
//Нет единого правильного способа решения этой задачи. Попытайся
// спроектировать гибкую архитектуру, задавая себе вопросы вида "А
// что будет, если этот класс нужно будет менять? Что еще поменяется,
// если здесь нужно будет расширить?".



public abstract class Shape {
    private int xStart;
    private int yStart;
    private int xEnd;
    private int yEnd;

    public abstract String getShapeName();

    public int getxStart() {
        return xStart;
    }

    public void setxStart(int xStart) {
        this.xStart = xStart;
    }

    public int getyStart() {
        return yStart;
    }

    public void setyStart(int yStart) {
        this.yStart = yStart;
    }

    public int getxEnd() {
        return xEnd;
    }

    public void setxEnd(int xEnd) {
        this.xEnd = xEnd;
    }

    public int getyEnd() {
        return yEnd;
    }

    public void setyEnd(int yEnd) {
        this.yEnd = yEnd;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "xStart=" + xStart +
                ", yStart=" + yStart +
                ", xEnd=" + xEnd +
                ", yEnd=" + yEnd +
                '}';
    }


}


