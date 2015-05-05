public class TestBall {
    public static void main(String[] args) {
        Ball ball=new Ball();
        ball.setXY(1,1);
        System.out.println(ball.toString());
        System.out.println("t="+ball.getTime(10,10,2));
        System.out.println(ball.toString());

    }

}