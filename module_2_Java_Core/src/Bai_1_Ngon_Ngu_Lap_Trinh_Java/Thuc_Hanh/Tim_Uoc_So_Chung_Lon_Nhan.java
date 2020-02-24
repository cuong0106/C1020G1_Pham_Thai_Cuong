package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh;

import java.util.Scanner;

public class Tim_Uoc_So_Chung_Lon_Nhan {
    public static void main(String[] args) {
        int a, b;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = nhap.nextInt();
        System.out.println("Enter b: ");
        b = nhap.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if(a==0 && b==0){
            System.out.println("No greatest common factor");
        } else {
            if (a != 0 && b != 0) {
                while (a != b) {
                    if (a > b)
                        a = a - b;
                    else
                        b = b - a;
                }
                System.out.println("Ước Chung Lớn Nhất Của 2 Số Là:" + a);
            } else{
                if (a == 0)
                    System.out.println("Ước Chung Lớn Nhất Của 2 Số Là:"+b);
                if (b == 0)
                    System.out.println("Ước Chung Lớn Nhất Của 2 Số Là:"+a);
            }
        }
    }

}
