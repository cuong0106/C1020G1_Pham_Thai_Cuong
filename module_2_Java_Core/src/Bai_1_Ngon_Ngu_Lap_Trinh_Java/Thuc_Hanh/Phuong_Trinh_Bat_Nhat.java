package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh;
import java.util.Scanner;   //import thư viện Scanner
public class Phuong_Trinh_Bat_Nhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);       //gọi thư viện Scanner
        System.out.print("a: ");
        double a = scanner.nextDouble();                //gán a từ scanner

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        }

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
