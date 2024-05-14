import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double radius = scanner.nextDouble();
        String circleColor = scanner.next();

        double rectangleLength = scanner.nextDouble();
        double rectangleWidth = scanner.nextDouble();
        String rectangleColor = scanner.next();

        // Create Circle instance
        Shape circle = new Circle(radius, circleColor);
        // Create Rectangle instance
        Shape rectangle = new Rectangle(rectangleLength, rectangleWidth, rectangleColor);
        // Print the area and color of each shape
        System.out.println(circle.getArea());
        System.out.println(circle.getColor());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getColor());

        scanner.close();
    }
}