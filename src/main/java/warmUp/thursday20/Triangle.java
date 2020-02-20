package warmUp.thursday20;

public class Triangle extends  Figure{
    private String name = "Triangle";
    private int x1;
    private int x2;
    private int x3;
    private int y1;
    private int y2;
    private int y3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    private Point p1 = new Point(x1,y1);
    private Point p2 = new Point(x2,y2);
    private Point p3 = new Point(x3,y3);

    //    @Override
    public void area(){
        double side1 = Math.sqrt((p1.getX()-p2.getX())^2+(p1.getY()-p2.getY())^2);
        double side2 = Math.sqrt((p1.getX()-p3.getX())^2+(p1.getY()-p3.getY())^2);
        double area = side1*side2/2;
        System.out.println("The area of "+this.name+" = "+area);
    }
}
