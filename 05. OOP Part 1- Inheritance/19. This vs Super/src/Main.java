public class Main {
    public static void main(String[] args) {

        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        Shape shape1 = new Shape(2,3);
        System.out.println(shape1);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");

        Rectangle rectangle1 = new Rectangle(4,5);
        System.out.println(rectangle1);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");

        Rectangle rectangle2 = new Rectangle(6,7, 8, 9);
        System.out.println(rectangle2);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
    }
}