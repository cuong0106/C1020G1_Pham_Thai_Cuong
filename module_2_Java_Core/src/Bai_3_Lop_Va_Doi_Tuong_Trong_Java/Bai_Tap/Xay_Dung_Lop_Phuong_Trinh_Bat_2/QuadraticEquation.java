package Bai_3_Lop_Va_Doi_Tuong_Trong_Java.Bai_Tap.Xay_Dung_Lop_Phuong_Trinh_Bat_2;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    QuadraticEquation(){

    }
    QuadraticEquation(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void setABC(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return this.b*this.b - 4*this.a*this.c;
    }
    public double getRoot1(){
        if(getDiscriminant()>=0)
        return  (Math.sqrt(getDiscriminant())-this.b)/(2*this.a);
        else return 0;
    }
    public double getRoot2(){
        if(getDiscriminant()>=0)
        return  (-Math.sqrt(getDiscriminant())-this.b)/(2*this.a);
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Nhập vào a:");
        double a=scanner.nextDouble();
        System.out.print("Nhập vào b:");
        double b=scanner.nextDouble();
        System.out.print("Nhập vào c:");
        double c=scanner.nextDouble();

        //QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setABC(a,b,c);

        if(quadraticEquation.getDiscriminant()>0){
            System.out.print("Phương trình có 2 nghiệm: "+quadraticEquation.getRoot1()+" và "+quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.print("Phương trình có 1 nghiệm: "+quadraticEquation.getRoot1());
        }else{
            System.out.print("The equation has no roots");
        }

    }
}
