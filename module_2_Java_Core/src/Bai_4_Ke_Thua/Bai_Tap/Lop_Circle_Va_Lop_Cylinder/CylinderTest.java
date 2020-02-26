package Bai_4_Ke_Thua.Bai_Tap.Lop_Circle_Va_Lop_Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3.5);
        System.out.println(cylinder);

        cylinder = new Cylinder(3.5,1.5, "blue");
        System.out.println(cylinder);
    }
}
