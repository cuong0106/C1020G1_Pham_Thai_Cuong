package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap.Ung_Dung_Chuyen_Doi_Tien_Te;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    int rate = 23000;

    public int getRate(){
        return this.rate;
    }

    public static void main(String[] args) {
        ChuyenDoiTienTe usdSangVnd = new ChuyenDoiTienTe();
        Scanner scanner =new Scanner(System.in);
        int usd;

        System.out.print("Nhập vào số lượng USD cần chuyển đổi:");
        usd=scanner.nextInt();

        System.out.println(usd+ " USD = "+usd*usdSangVnd.getRate()+" VNĐ");
    }
}
