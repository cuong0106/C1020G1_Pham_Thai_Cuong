package Bai_2_Mang_Va_Phuong_Thuc_Trong_Java.Thuc_Hanh;

public class Tim_Gia_Tri_Nho_Nhat_Trong_Mang_Su_Dung_Phuong_Thuc {

    public static int minValue(int []array){

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);

    }
}
