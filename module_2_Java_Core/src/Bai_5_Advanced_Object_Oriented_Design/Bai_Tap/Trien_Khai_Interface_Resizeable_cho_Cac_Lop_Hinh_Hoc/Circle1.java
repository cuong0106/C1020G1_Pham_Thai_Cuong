package Bai_5_Advanced_Object_Oriented_Design.Bai_Tap.Trien_Khai_Interface_Resizeable_cho_Cac_Lop_Hinh_Hoc;

import Bai_4_Ke_Thua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc.Circle;

public class Circle1 extends Circle implements Resizeable {

    @Override
    public void resize(double percent) {
        setRadius(getRadius()*percent);
    }
}
