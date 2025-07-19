package class_interface.tag_class;

public class Figure {
    enum Shape { RECTANGLE, CIRCLE }

    final Shape shape;

    // 모양이 사각형일때만 사용
    double length;
    double width;

    // 모양이 원일때만 사용
    double radius;

    public Figure(double radius){
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    public Figure(double length, double width){
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area(){
        switch (shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }
}
