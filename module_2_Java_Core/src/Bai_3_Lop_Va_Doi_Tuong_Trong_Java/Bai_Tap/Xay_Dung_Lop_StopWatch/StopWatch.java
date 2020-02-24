package Bai_3_Lop_Va_Doi_Tuong_Trong_Java.Bai_Tap.Xay_Dung_Lop_StopWatch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    StopWatch(){
        this.startTime=new Date();
    }

    public Date getStartTime(){
        return this.startTime;
    }

    public Date getEndTime(){
        return this.endTime;
    }

    public void start(){
        this.startTime=new Date();
    }

    public void stop(){
        this.endTime=new Date();
    }

    public long getElapsedTime(){
        Date hientai=new Date();
        return hientai.getTime()-this.startTime.getTime();
    }

    public static int[] tuDongTaoMang1ChieuInt(int chieu1){
        Scanner scanner=new Scanner(System.in);
        int[] mang=new int[chieu1];
        for(int i=0;i<chieu1;i++){
            Random random = new Random();
            mang[i]= random.nextInt(10);
        }
        return mang;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] mangCanSapXep;
         mangCanSapXep=tuDongTaoMang1ChieuInt(100000);
        stopWatch.start();
        Arrays.sort(mangCanSapXep);
        System.out.println(stopWatch.getElapsedTime());
    }


}
