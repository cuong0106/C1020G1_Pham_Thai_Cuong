package Bai_5_Advanced_Object_Oriented_Design.Bai_Tap.Trien_Khai_Interface_Resizeable_cho_Cac_Lop_Hinh_Hoc;

import Bai_4_Ke_Thua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc.Shape;

public class TestMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0]=new Circle1();
        shapes[1]=new Rectangle1();
        shapes[2]=new Square1();

        for(Shape shape:shapes){
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
            shape.resize(Math.random()*101);

            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());

        }

    }
}
