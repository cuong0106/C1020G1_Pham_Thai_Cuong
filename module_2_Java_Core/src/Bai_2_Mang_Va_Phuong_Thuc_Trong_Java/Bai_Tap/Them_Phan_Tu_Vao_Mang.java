package Bai_2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap;

import java.util.Scanner;

public class Them_Phan_Tu_Vao_Mang {

    public static int[] chenPhanTuVaoMang(int[] arr, int a, int b){
        int j=0;
        int[] arrNew =new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            if(i==b-1) {
                arrNew[j]=a;
                j++;
            }
            arrNew[j]=arr[i];
            j++;
        }
        return arrNew;

    }
    public static void main(String[] args) {
        int size;
        int[] array;
        int soCanChen;
        int viTriCanChen;
        int[] mangMoi;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Điền vào số cần chèn:");
        soCanChen = scanner.nextInt();
        do {
            System.out.println("Điền vào vị trí cần chèn:");
            viTriCanChen = scanner.nextInt();
        } while (!(viTriCanChen>0 && viTriCanChen<=array.length));

        mangMoi=new int[array.length+1];
        mangMoi = chenPhanTuVaoMang(array,soCanChen,viTriCanChen);


        System.out.print("Danh sách củ: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        System.out.print("\nDanh sách mới: ");
        for (int j = 0; j < mangMoi.length; j++) {
            System.out.print(mangMoi[j] + "\t");
        }

   //     System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }

}



