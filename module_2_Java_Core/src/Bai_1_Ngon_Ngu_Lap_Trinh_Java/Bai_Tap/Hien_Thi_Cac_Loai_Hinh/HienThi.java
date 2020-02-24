package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap.Hien_Thi_Cac_Loai_Hinh;

import java.util.Scanner;

public class HienThi {

    public static void inHinhChuNhat(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chiều dài:");
        int a=scanner.nextInt();
        System.out.println("Nhập vào chiều cao:");
        int b=scanner.nextInt();

        for(int i=0;i<b;i++){
            for (int j=0; j<a; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void inTamGiac(){
        int a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào độ dài tam giác:");
        a=scanner.nextInt();

        for(int i=a;i>0;i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=1;i<=a;i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=a;i>0;i--){
            for (int j=i; j<a; j++){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=a;i>0;i--){
            for (int j=1; j<=a; j++){
                if(j<i)
                System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void inTamGiacCan(){
        Scanner scanner = new Scanner(System.in);
        int a;

        System.out.println("Nhập vào đường cao:");
        a=scanner.nextInt();

        for(int i=0;i<a;i++){
            for (int j=a; j>i; j--){
                System.out.print(" ");
            }
            for (int j=0; j<i*2+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        boolean lapLai=true;

        while (lapLai){
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            menu = scanner.nextInt();

            switch (menu){
                case 1: inHinhChuNhat(); break;
                case 2: inTamGiac(); break;
                case 3: inTamGiacCan(); break;
                case 4: lapLai = false; break;
            }

        }

    }
}
