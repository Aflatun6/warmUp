package warmUp.thursday20;

public class Rectangle extends Figure {
    private String name = "Rectangle";
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    private Point p1 = new Point(x1, y1);
    private Point p2 = new Point(x2, y2);

    public void area() {
        double area = ((this.p1.getX() - this.p2.getX()) * (this.p1.getY() - this.p2.getY()));
        System.out.println(this.p1.getX());
        System.out.println(this.p2.getX());
        System.out.println(this.p1.getY());
        System.out.println(this.p2.getY());
        System.out.println("The area of " + this.name + " = " + area);
    }
}
