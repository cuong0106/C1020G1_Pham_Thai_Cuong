package Bai_2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap.Xoa_Phan_Tu_Khoi_Mang;

import java.util.Scanner;

public class xoaPhanTuTrongMang {

    public static int[] xoaPhanTuTrongMang1chieu(int[] array,int x){
        int[] array1=new int[array.length];
        boolean check =false;
        for (int i=0;i<array.length;i++){
            if(array[i]==x){
                array1[i]=array[i+1];
                i++;
                check=true;
            }
            if(check)
                array1[i-1]=array[i];
            else array1[i]=array[i];
        }
        return array1;
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
        int x;

        System.out.println("Nhập vào chiều dài mảng 1:");
        doDai1 = scanner.nextInt();

        int[] mang1;
        int[] mang2;
        mang1=nhapVaoMangInt(doDai1);

        System.out.println("Nhập vào số cần xóa:");
        x = scanner.nextInt();

        mang2=xoaPhanTuTrongMang1chieu(mang1,x);

        System.out.println("Mảng hiện tại là:");
        inRaMangInt(mang2);
    }
}
