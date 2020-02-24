package Bai_2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap.Tinh_Tong_Cac_So_O_Mot_Cot_Xac_Dinh;

import java.util.Scanner;

public class tinhTongCot {

    public static int[][] nhapVaoMang2ChieuInt(int hang, int cot){
        Scanner scanner=new Scanner(System.in);
        int[][] mang2Chieu=new int[hang][cot];
        for(int i=0;i<hang;i++){
            for (int j=0; j<cot;j++){
                System.out.println("Nhập vào số nguyên ở vị trí ["+i+"],["+j+"]:");
                mang2Chieu[i][j]=scanner.nextInt();
            }
        }
        return mang2Chieu;
    }

    public static void inRaMangInt(int[][] array){
        for(int i=0;i< array.length;i++) {
            for(int j=0;j< array[0].length;j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mang;
        int cot;
        int cotSum;
        int hang;
        int sum=0;

        System.out.println("Nhập vào số cột:");
        cot=scanner.nextInt();
        System.out.println("Nhập vào số hàng:");
        hang=scanner.nextInt();

        mang=nhapVaoMang2ChieuInt(hang,cot);

        inRaMangInt(mang);

        System.out.println("Nhập vào cột cần tính tổng nằm ở cột thứ:");
        cotSum=scanner.nextInt()-1;

        for (int i = 0; i <hang ; i++) {
            sum+=mang[i][cotSum];
        }

        System.out.println("Tổng của cột "+cotSum+" là: "+sum);


    }

}
