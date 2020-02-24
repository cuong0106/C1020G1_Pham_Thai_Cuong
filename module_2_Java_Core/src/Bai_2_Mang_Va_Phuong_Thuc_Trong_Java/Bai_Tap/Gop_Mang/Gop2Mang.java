package Bai_2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap.Gop_Mang;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Gop2Mang {


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
        int doDai2=2;

        System.out.println("Nhập vào chiều dài mảng 1:");
        doDai1 = scanner.nextInt();
        System.out.println("Nhập vào chiều dài mảng 2:");
        doDai2 = scanner.nextInt();

        int[] mang1;
        int[] mang2;
        int[] mang3= new int[doDai1+doDai2];


        mang1=nhapVaoMangInt(doDai1);
        mang2=nhapVaoMangInt(doDai2);

        for(int i=0;i<mang1.length;i++){
            mang3[i]=mang1[i];
            }
        for (int i=0;i<mang2.length;i++){
            mang3[i+mang1.length]=mang2[i];
        }

        inRaMangInt(mang3);



    }
}
