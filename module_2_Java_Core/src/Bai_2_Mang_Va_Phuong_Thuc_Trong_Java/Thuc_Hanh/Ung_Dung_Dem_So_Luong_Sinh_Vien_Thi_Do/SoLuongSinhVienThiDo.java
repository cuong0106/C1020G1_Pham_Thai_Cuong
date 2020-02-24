package Bai_2_Mang_Va_Phuong_Thuc_Trong_Java.Thuc_Hanh.Ung_Dung_Dem_So_Luong_Sinh_Vien_Thi_Do;

import java.util.Scanner;

public class SoLuongSinhVienThiDo {


    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);


        array = new int[size];
        int i = 0;
        while (i < array.length) {
            do {
                System.out.print("Enter a mark for student " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }
            while (array[i]>10||array[i]<0);

            i++;
        }

        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
