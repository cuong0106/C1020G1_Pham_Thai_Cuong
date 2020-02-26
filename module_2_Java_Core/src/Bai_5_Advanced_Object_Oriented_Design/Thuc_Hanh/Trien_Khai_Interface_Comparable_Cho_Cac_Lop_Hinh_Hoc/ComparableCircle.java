package Bai_5_Advanced_Object_Oriented_Design.Thuc_Hanh.Trien_Khai_Interface_Comparable_Cho_Cac_Lop_Hinh_Hoc;

import Bai_4_Ke_Thua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc.Circle;

//import java.util.Comparator;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {

    public ComparableCircle() {
        }

    public ComparableCircle(double radius) {
            super(radius);
        }

    public ComparableCircle(double radius, String color, boolean filled) {
            super(radius, color, filled);
        }


    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
    else if (getRadius() < o.getRadius()) return -1;
    else return 1;
    }
}

