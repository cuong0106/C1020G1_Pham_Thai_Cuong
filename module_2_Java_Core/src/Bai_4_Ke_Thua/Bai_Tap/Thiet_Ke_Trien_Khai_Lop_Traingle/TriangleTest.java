package Bai_4_Ke_Thua.Bai_Tap.Thiet_Ke_Trien_Khai_Lop_Traingle;

import Bai_4_Ke_Thua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc.Circle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(3,4,5, "blue");
        System.out.println(triangle);
    }

}
