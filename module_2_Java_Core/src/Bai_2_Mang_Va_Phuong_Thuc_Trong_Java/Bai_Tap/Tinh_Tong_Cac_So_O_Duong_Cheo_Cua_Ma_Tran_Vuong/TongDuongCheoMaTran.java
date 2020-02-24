package Bai_2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap.Tinh_Tong_Cac_So_O_Duong_Cheo_Cua_Ma_Tran_Vuong;

import java.util.Scanner;

public class TongDuongCheoMaTran {
    public static int[][] nhapVaoMang2ChieuInt(int cot, int hang){
        Scanner scanner=new Scanner(System.in);
        int[][] mang2Chieu=new int[cot][hang];
        for(int i=0;i<cot;i++){
            for (int j=0; j<hang;j++){
                System.out.println("Nhập vào số nguyên ở vị trí ["+i+"],["+j+"]:");
                mang2Chieu[i][j]=scanner.nextInt();
            }
        }
        return mang2Chieu;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mang;
        int kichthuoc;
        int sum=0;

        System.out.println("nhập vào chiều kích thước cạnh của mảng vuông:");
        kichthuoc=scanner.nextInt();

        mang=nhapVaoMang2ChieuInt(kichthuoc,kichthuoc);

        for(int i=0;i<kichthuoc;i++){
            sum+=mang[i][i];
        }

        System.out.println("tổng của đường chéo là:"+sum);

    }
}
