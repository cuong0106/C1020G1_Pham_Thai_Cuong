package Bai_3_Lop_Va_Doi_Tuong_Trong_Java.Thuc_Hanh;

import java.util.Scanner;

public  class Lop_Hinh_Chu_Nhat {

    double width, height;

    public Lop_Hinh_Chu_Nhat() {
    }

    public Lop_Hinh_Chu_Nhat(double width, double height) {
        this.width = width;
        this.height = height;
    }
    //code below here
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
    public static void main(String[] args) {
        //code below here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();

        Lop_Hinh_Chu_Nhat rectangle = new Lop_Hinh_Chu_Nhat(width, height);

        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}

