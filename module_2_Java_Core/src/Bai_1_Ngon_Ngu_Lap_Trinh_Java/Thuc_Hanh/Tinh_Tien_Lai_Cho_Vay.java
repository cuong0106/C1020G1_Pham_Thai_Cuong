package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh;

import java.util.Scanner;

public class Tinh_Tien_Lai_Cho_Vay {
    Scanner input = new Scanner(System.in);
    public double input(String hienthi){
        System.out.println(hienthi);
        return  input.nextDouble();
    };
    public static void main(String[] args) {
        Tinh_Tien_Lai_Cho_Vay tinhTienLaiChoVay = new Tinh_Tien_Lai_Cho_Vay();
        double money = 1.0;
        double month = 1;
        double interset_rate = 1.0;
        money= tinhTienLaiChoVay.input("Enter investment amount: ");
        month = tinhTienLaiChoVay.input("Enter number of months: ");
        interset_rate = tinhTienLaiChoVay.input("Enter annual interest rate in percentage: ");
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset += money * (interset_rate/100)/12;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}
