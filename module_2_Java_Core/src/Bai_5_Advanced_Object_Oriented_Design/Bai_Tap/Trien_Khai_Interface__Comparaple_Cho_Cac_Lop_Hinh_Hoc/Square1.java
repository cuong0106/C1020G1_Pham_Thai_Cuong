package Bai_5_Advanced_Object_Oriented_Design.Bai_Tap.Trien_Khai_Interface__Comparaple_Cho_Cac_Lop_Hinh_Hoc;

import Bai_4_Ke_Thua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc.Square;
import Bai_5_Advanced_Object_Oriented_Design.Bai_Tap.Trien_Khai_Interface_Cororable_Cho_Cac_Lop_Hinh_Hoc.Colorable;

public class Square1 extends Square implements Colorable {

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
