package Bai_2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap;

import java.util.Scanner;

public class Su_Dung_Lop_Illegal_Triangle_Exception {

    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        System.out.print("Nhập Vào cạnh thứ nhất của tam giác:");
        float a=scaner.nextFloat();
        System.out.print("Nhập Vào cạnh thứ hai của tam giác:");
        float b=scaner.nextFloat();
        System.out.print("Nhập Vào cạnh thứ ba của tam giác:");
        float c=scaner.nextFloat();
        try {
            IllegalTriangleException.isTriang(a,b,c);
                System.out.print("Điều kiện đúng, thực hiện chương trình:");
        } catch (IllegalTriangleException e){
            System.out.print("Điều kiện sai, thực hiện chương trình phụ:");
        }
    }
}
