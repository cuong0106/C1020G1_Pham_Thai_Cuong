package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap.Hien_Thi_So_Nguyen_To_Nho_Hon_100;

public class KiemTraSoNguyenTo {
    public static boolean isSoNguyenTo(int a){
        if(a<2){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(a);i++){
                if(a%i==0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<101;i++){
            if(isSoNguyenTo(i)){
                System.out.println(i+" là số nguyên tố.");
            }
        }
    }

}
