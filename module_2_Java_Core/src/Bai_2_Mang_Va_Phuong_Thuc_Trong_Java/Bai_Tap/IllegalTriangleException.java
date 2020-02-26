package Bai_2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap;

public class  IllegalTriangleException extends Throwable {

        public static void isTriang (float a,float b,float c) throws IllegalTriangleException{
            boolean canhNhoHonHoacBang0 =(a<=0||b<=0||c<+0);
            boolean tong2CanhNhoHonHoacBangCanhConLai = (a+b<=c||a+c<=b||b+c<=a);
            if(canhNhoHonHoacBang0||tong2CanhNhoHonHoacBangCanhConLai)
            throw new IllegalTriangleException();

        }
}
