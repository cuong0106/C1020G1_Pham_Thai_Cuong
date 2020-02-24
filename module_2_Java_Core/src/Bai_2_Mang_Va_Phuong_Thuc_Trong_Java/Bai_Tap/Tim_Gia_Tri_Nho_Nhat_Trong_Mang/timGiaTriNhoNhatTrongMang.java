package Bai_2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap.Tim_Gia_Tri_Nho_Nhat_Trong_Mang;

import java.util.Scanner;

public class timGiaTriNhoNhatTrongMang {
    public static int timGiaTriNhoNhatTrongMang1Chieu(int[] array){
        int min=array[0];
        for(int i=0;i< array.length;i++) {
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    public static int[] nhapVaoMangInt(int doDai){
        Scanner scanner=new Scanner(System.in);
        int[] mang=new int[doDai];
        for(int i=0;i<doDai;i++) {
            System.out.println("Nhập vào số nguyên ở vị trí [" + i + "]:");
            mang[i] = scanner.nextInt();
        }
        return mang;
    }

    public static void inRaMangInt(int[] array){
        for(int i=0;i< array.length;i++) {
            System.out.print(array[i]+"\t");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int doDai1=2;

        System.out.println("Nhập vào chiều dài mảng 1:");
        doDai1 = scanner.nextInt();

        int[] mang1;
        mang1=nhapVaoMangInt(doDai1);

        System.out.println("Số nhỏ nhất trong mảng là:"+timGiaTriNhoNhatTrongMang1Chieu(mang1));

    }
}
