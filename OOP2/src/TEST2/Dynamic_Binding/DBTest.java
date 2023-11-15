package TEST2.Dynamic_Binding;

public class DBTest {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle();
        shape.draw();

        shape = new Square();
        shape.draw();

    }
}
