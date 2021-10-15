package Chapter6_OC.problem_04.app;
import Chapter6_OC.problem_04.base.Shape;
import Chapter6_OC.problem_04.derived.Circle;
public class GraphicEditor {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
