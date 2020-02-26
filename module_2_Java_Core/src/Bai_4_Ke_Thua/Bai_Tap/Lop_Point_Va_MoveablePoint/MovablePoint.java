package Bai_4_Ke_Thua.Bai_Tap.Lop_Point_Va_MoveablePoint;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(){

    }

    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(float xSpeed,float ySpeed,float x, float y){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }


    public void setXYSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getXYSpeed() {
        float[] array = new float[2];
        array[0]=getX();
        array[1]=getY();
        return array;
    }

    @Override
    public String toString() {
        return super.toString()+"speed=("+ xSpeed +
                "," + ySpeed +
                ')';
    }

    public MovablePoint  move(){
        MovablePoint movablePoint = new  MovablePoint();
        movablePoint.setX(super.getX()+this.xSpeed);
        movablePoint.setY(super.getY()+this.ySpeed);
        movablePoint.setXYSpeed(this.xSpeed,this.ySpeed);
        return movablePoint;
    }
//    public MovablePoint  move(MovablePoint movablePoint){
//        MovablePoint movablePoint1 = new  MovablePoint();
//        movablePoint1=movablePoint;
//        movablePoint1.setX(movablePoint.getX()+this.xSpeed);
//        movablePoint1.setY(movablePoint.getY()+this.ySpeed);
//        return movablePoint1;
//    }

}
