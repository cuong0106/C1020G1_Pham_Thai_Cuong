package Bai_4_Ke_Thua.Bai_Tap.Lop_Circle_Va_Lop_Cylinder;


public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "blue");
        System.out.println(circle);
    }
}
