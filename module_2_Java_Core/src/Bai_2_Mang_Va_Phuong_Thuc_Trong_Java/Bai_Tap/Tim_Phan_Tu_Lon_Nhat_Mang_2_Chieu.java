package Bai_2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap;


import java.util.Scanner;

public class Tim_Phan_Tu_Lon_Nhat_Mang_2_Chieu {

    public static float[][] nhapVaoMang2ChieuInt(int chieu1, int chieu2){
        Scanner scanner=new Scanner(System.in);
        float[][] mang2Chieu=new float[chieu1][chieu2];
        for(int i=0;i<chieu1;i++){
            for (int j=0; j<chieu2;j++){
                System.out.println("Nhập vào số nguyên ở vị trí ["+i+"],["+j+"]:");
                mang2Chieu[i][j]=scanner.nextFloat();
            }
        }
        return mang2Chieu;
    }

    public static void main(String[] args) {
        int chieu1;
        int chieu2;
        float[][] mang2Chieu;
        int viTriChieu1;
        int viTriChieu2;
        float max;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhập vào độ dài chiều 1:");
        chieu1=scanner.nextInt();
        System.out.println("Nhập vào độ dài chiều 2:");
        chieu2=scanner.nextInt();
        mang2Chieu=nhapVaoMang2ChieuInt(chieu1,chieu2);

        viTriChieu1=0;
        viTriChieu2=0;
        for (int i=0;i<mang2Chieu.length;i++){
            for (int j=0; j<mang2Chieu[0].length;j++){
                if(mang2Chieu[i][j]>mang2Chieu[viTriChieu1][viTriChieu2]){
                    viTriChieu1=i;
                    viTriChieu2=j;
                }
            }
        }

        max=mang2Chieu[viTriChieu1][viTriChieu2];
        System.out.println("Số lớn nhất trong mảng là: "+max+" nằm ở vị trí:["+viTriChieu1+"]["+viTriChieu2+"]");
    }
}
