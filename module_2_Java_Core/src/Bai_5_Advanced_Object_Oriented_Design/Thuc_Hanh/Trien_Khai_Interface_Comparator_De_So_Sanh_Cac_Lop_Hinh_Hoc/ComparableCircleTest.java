package Bai_5_Advanced_Object_Oriented_Design.Thuc_Hanh.Trien_Khai_Interface_Comparator_De_So_Sanh_Cac_Lop_Hinh_Hoc;

import Bai_4_Ke_Thua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc.Circle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        ComparableCircle comparatorCircle = new ComparableCircle(); //Comparator
        Arrays.sort(circles,comparatorCircle);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
