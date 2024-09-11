public class Main {
    public static void main(String[] args) {
        // Create Circle objects
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(7.0);

        // Test get methods
        System.out.println("circle1 radius: " + circle1.getRadius());
        System.out.println("circle2 radius: " + circle2.getRadius());
        System.out.println("circle3 radius: " + circle3.getRadius());

        // Test area and perimeter calculation
        System.out.println("circle1 area: " + circle1.getArea());
        System.out.println("circle1 perimeter: " + circle1.getPerimeter());

        // Test equals method
        System.out.println("circle1 equals circle2: " + circle1.equals(circle2));  // true
        System.out.println("circle1 equals circle3: " + circle1.equals(circle3));  // false

        // Test compareTo method
        System.out.println("circle1 compareTo circle2: " + circle1.compareTo(circle2)); // 0 (equal)
        System.out.println("circle1 compareTo circle3: " + circle1.compareTo(circle3)); // -1 (circle1 is smaller)
        System.out.println("circle3 compareTo circle1: " + circle3.compareTo(circle1)); // 1 (circle3 is larger)

        // Test toString method
        System.out.println(circle1.toString()); // Circle with radius: 5.0
    }
}
