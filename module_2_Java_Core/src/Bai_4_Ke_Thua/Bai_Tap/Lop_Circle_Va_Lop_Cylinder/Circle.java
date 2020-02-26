package Bai_4_Ke_Thua.Bai_Tap.Lop_Circle_Va_Lop_Cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius=1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color) {
        this.color=color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                +this.radius+", color="
                +this.color;
    }
}
