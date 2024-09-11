public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius; // Radius of the circle

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method from GeometricObject
    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Area = πr²
    }

    // Implementing the abstract method from GeometricObject
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; // Perimeter = 2πr
    }

    // Overriding the equals method from Object class
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }

    // Implementing the compareTo method from Comparable interface
    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }

    // Overriding toString method to display circle information
    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}
