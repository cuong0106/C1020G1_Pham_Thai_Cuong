package Bai_2_Mang_Va_Phuong_Thuc_Trong_Java.Thuc_Hanh.Dao_Nguoc_Phan_Tu_Cua_Mang;

import java.util.Scanner;

public class DaoNguocPhanTuMang {

    public static int[] nhapVaoMang(){
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        return array;
    }

    public static void inMang(int[] array){
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

    }

    public static void main(String[] args) {
        int[] array;

        array=nhapVaoMang();

        inMang(array);

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;
        }

        inMang(array);
    }
}
