package Bai_2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap;

import java.util.Scanner;

public class Su_Dung_Lop_Illegal_Triangle_Exception {
    public static boolean IllegalTriangleException(float a,float b,float c){
        if(a>0&&b>0&&c>0)
            if(a+b>c&&a+c>b&&b+c>a)
                return true;
            return false;
    }

    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        System.out.print("Nhập Vào cạnh thứ nhất của tam giác:");
        float a=scaner.nextFloat();
        System.out.print("Nhập Vào cạnh thứ hai của tam giác:");
        float b=scaner.nextFloat();
        System.out.print("Nhập Vào cạnh thứ ba của tam giác:");
        float c=scaner.nextFloat();

        if(IllegalTriangleException(a,b,c)){
            System.out.print("Điều kiện đúng, thực hiện chương trình:");
        } else{
            System.out.print("Điều kiện sai, thực hiện chương trình phụ:");
        }
    }
}
