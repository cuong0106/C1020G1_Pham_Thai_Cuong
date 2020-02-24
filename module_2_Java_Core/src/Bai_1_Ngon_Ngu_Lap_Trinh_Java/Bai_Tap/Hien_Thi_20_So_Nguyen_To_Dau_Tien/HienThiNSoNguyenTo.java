package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap.Hien_Thi_20_So_Nguyen_To_Dau_Tien;

import java.util.Scanner;
import Bai_1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap.Hien_Thi_So_Nguyen_To_Nho_Hon_100.KiemTraSoNguyenTo;

public class HienThiNSoNguyenTo {
    public static void main(String[] args) {
        KiemTraSoNguyenTo kiemTraSoNguyenTo =new KiemTraSoNguyenTo();
        int n;
        int i=1;
        int count=0;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập vào số lượng số nguyên tố cần in ra:");
        n=scanner.nextInt();

        while (count<n){
            while (true){
                i++;
                if(kiemTraSoNguyenTo.isSoNguyenTo(i)){
                    count++;
                    System.out.println(i+" là số nguyên tố.");
                    break;
                }

            }
        }
    }
}
