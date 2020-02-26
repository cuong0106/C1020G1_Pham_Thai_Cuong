package Bai_5_Advanced_Object_Oriented_Design.Bai_Tap.Trien_Khai_Interface_Resizeable_cho_Cac_Lop_Hinh_Hoc;

import Bai_4_Ke_Thua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc.Square;

public class Square1 extends Square implements Resizeable {
    @Override
    public void resize(double percent) {
        setSide(getSide()*percent);
    }
}
