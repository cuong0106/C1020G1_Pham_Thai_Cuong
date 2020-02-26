package Bai_5_Advanced_Object_Oriented_Design.Thuc_Hanh.Trien_Khai_Interface_Comparator_De_So_Sanh_Cac_Lop_Hinh_Hoc;

import Bai_4_Ke_Thua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc.Circle;

import java.util.Comparator;

public class ComparableCircle extends Circle
        implements Comparator<Circle> {

//    public ComparableCircle() {
//        }
//
//    public ComparableCircle(double radius) {
//            super(radius);
//        }
//
//    public ComparableCircle(double radius, String color, boolean filled) {
//            super(radius, color, filled);
//        }



    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }
}

