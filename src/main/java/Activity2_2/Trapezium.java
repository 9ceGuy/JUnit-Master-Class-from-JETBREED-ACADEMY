package Activity2_2;

public class Trapezium implements Shapes{

    private double altitude;
    private double baseOne;
    private double baseTwo;

    public Trapezium(double baseOne, double baseTwo, double altitude) {
        this.altitude = altitude;
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
    }

    public double getAltitude() {return altitude;}

    public void setAltitude(double altitude) {this.altitude = altitude;}

    public double getBaseOne() {return baseOne;}

    public void setBaseOne(double baseOne) {this.baseOne = baseOne;}

    public double getBaseTwo() {return baseTwo;}

    public void setBaseTwo(double baseTwo) {this.baseTwo = baseTwo;}

    @Override
    public void draw() {System.out.println("Drawing Trapezium");}
}
