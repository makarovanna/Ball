public class Ball {
    private double x;
    private double y;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
        this.x = 0;
        this.y = 0;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x,double y) {
        this.y = y;
        this.x = x;
    }

    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void move(double xDisp, double yDisp) {
        y+=yDisp;
        x+=xDisp;
    }
    public double getTime(double xEnd,double yEnd,double speed){
        double distance=Math.sqrt((xEnd-x)*(xEnd-x)+(yEnd-y)*(yEnd-y));
        setXY(xEnd,yEnd);
        return distance/speed;

    }
}
