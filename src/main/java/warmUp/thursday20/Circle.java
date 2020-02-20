package warmUp.thursday20;

public class Circle extends Figure {
    private String name = "Circle";
    private double radius;
    private int x;
    private int y;
    public Circle(int x,int y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    private Point p= new Point(x,y);

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void area(){
        double area = 3.14*this.radius*this.radius/2;
        System.out.println("The area of "+this.name+" = "+ area);
    }
}
