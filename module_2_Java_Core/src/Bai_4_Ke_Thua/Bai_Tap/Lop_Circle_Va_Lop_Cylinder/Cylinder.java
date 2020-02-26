package Bai_4_Ke_Thua.Bai_Tap.Lop_Circle_Va_Lop_Cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        this.height=1.0;
    }

    public Cylinder(double height){
        this.height=height;
    }

    public Cylinder(double height, double radius,String color){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "height="
                +this.height+", "
                +super.toString();
    }

}
