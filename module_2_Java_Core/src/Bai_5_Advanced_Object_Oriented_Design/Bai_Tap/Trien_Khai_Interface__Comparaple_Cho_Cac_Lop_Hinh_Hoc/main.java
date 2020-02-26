package Bai_5_Advanced_Object_Oriented_Design.Bai_Tap.Trien_Khai_Interface__Comparaple_Cho_Cac_Lop_Hinh_Hoc;
//lam chua xong
import Bai_4_Ke_Thua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc.Circle;
import Bai_4_Ke_Thua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc.Rectangle;
import Bai_4_Ke_Thua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc.Shape;
import Bai_4_Ke_Thua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc.Square;

public class main {
    public static void main(String[] args) {
        Shape[] shapes =new Shape[5];
        shapes[0]=new Circle();
        shapes[1]=new Circle();
        shapes[2]=new Rectangle();
        shapes[3]=new Square1();
        shapes[4]=new Square();

        for (Shape shape:shapes) {
            //if(Colorable)
              //  else
            System.out.println(shape.getArea());

        }
    }
}
