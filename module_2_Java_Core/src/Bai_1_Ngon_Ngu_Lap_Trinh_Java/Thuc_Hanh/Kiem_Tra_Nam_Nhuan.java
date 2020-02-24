package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh;

import java.util.Scanner;

public class Kiem_Tra_Nam_Nhuan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("điền vào năm cần kiểm tra năm nhuận: ");
        int namNhapVao = scanner.nextInt();
        boolean check=false;
        if(namNhapVao%400==0){
            check=true;
        }else{
            if(namNhapVao%100==0){
                check=false;
            }else if(namNhapVao%4==0)
                check=true;
        }
        if(check) {
            System.out.print("năm " + namNhapVao + " là năm nhuận");
        }else{
            System.out.print("năm " + namNhapVao + " Không là năm nhuận");
        }
    }

}
