package Bai_4_Ke_Thua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}