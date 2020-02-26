package Bai_4_Ke_Thua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc;

import Bai_5_Advanced_Object_Oriented_Design.Bai_Tap.Trien_Khai_Interface_Resizeable_cho_Cac_Lop_Hinh_Hoc.Resizeable;

public class Shape implements Resizeable {
    private String color;
    private boolean filled;

    public Shape(){
        this.color="green";
        this.filled=true;
    }

    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        if(this.filled)
        return "A Shape with color of "+this.color+" and filled";
        else return "A Shape with color of "+this.color+" and not filled";
    }

    @Override
    public void resize(double percent) {

    }
}
