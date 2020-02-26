package Bai_4_Ke_Thua.Bai_Tap.Lop_Point_Va_MoveablePoint;

public class MoveblePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setXY(1.3f,1.6f);
        movablePoint.setXYSpeed(2f,3f);

        //movablePoint.move(movablePoint);
        System.out.println(movablePoint.move());

        movablePoint = new MovablePoint(2.0f,1.5f);
        System.out.println(movablePoint);
    }
}
