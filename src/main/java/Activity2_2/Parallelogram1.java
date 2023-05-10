package Activity2_2;

public class Parallelogram1 implements Shapes{
    private double base;
    private double height;

    public Parallelogram1(double base, double height){this.base = base; this.height = height;}

    public double getBase() {return base;}

    public double getHeight() {return height;}

    public void setBase(double base) {this.base = base;}

    public void setHeight(double height) {this.height = height;}

    @Override
    public void draw() {System.out.println("Drawing parallelogram");}
}
