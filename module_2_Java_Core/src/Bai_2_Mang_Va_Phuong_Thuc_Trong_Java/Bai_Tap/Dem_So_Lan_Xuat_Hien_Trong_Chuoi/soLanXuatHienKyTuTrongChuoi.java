package Bai_2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap.Dem_So_Lan_Xuat_Hien_Trong_Chuoi;

import java.util.Scanner;

public class soLanXuatHienKyTuTrongChuoi {

    public static int  demSoLanXuatHienKyTuTrongChuoi(String str, char c){
        int count=0;
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)==c){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String chuoi;
        char  c;

        System.out.println("Nhập vào 1 chuổi:");
        chuoi = scanner.nextLine();


        System.out.println("Nhập vào ký tự cần đếm trong chuổi:");
        c = scanner.nextLine().charAt(0);

        System.out.println(demSoLanXuatHienKyTuTrongChuoi(chuoi,c));

    }
}
