package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh;

import java.util.Scanner;

public class Tinh_Chi_So_Can_Nang_Co_The {
    Scanner input = new Scanner(System.in);

    public double inputDouble(String hienthi){
        System.out.println(hienthi);
        return  input.nextDouble();
    };

    public int inputInt(String hienthi){
        System.out.println(hienthi);
        return  input.nextInt();
    };

    public String inputLine(String hienthi){
        System.out.println(hienthi);
        return  input.nextLine();
    };

    public static void main(String[] args) {
        Tinh_Chi_So_Can_Nang_Co_The tinhChiSoCanNangCoThe = new Tinh_Chi_So_Can_Nang_Co_The();
        double weight, height, bmi;

        weight=tinhChiSoCanNangCoThe.inputDouble("Your weight (in kilogram):");
        height = tinhChiSoCanNangCoThe.inputDouble("Your height (in meter):");

        bmi=weight/(height*height);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");

    }
}
