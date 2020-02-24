package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap;

import java.util.Scanner;

public class Ung_Dung_Doc_So_Thanh_Chu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int so=20;
        String docSo="";
        System.out.print("điền vào số bạn muốn đọc: ");
        int soDienVao = scanner.nextInt();
            int xuLySoDienVao=soDienVao;
            int soHangTram = xuLySoDienVao / 100;
            switch (soHangTram) {
                case 9:
                    docSo = "night hundred";
                    break;
                case 8:
                    docSo = "eight hundred";
                    break;
                case 7:
                    docSo = "seven hundred";
                    break;
                case 6:
                    docSo = "six hundred";
                    break;
                case 5:
                    docSo = "five hundred";
                    break;
                case 4:
                    docSo = "four hundred";
                    break;
                case 3:
                    docSo = "three hundred";
                    break;
                case 2:
                    docSo = "two hundred";
                    break;
                case 1:
                    docSo = " one hundred";
                    break;
                case 0:
                    docSo = "";
                    break;
            }
            xuLySoDienVao = xuLySoDienVao - soHangTram*100;
            if(xuLySoDienVao<20){
                if(xuLySoDienVao==0) {
                    docSo += "";
                }
                else{
                    if(soHangTram>0)
                    docSo+=" and";
                    switch (xuLySoDienVao) {
                        case 1:
                            docSo += " one";
                            break;
                        case 2:
                            docSo += " two";
                            break;
                        case 3:
                            docSo += " three";
                            break;
                        case 4:
                            docSo += " four";
                            break;
                        case 5:
                            docSo += " five";
                            break;
                        case 6:
                            docSo += " six";
                            break;
                        case 7:
                            docSo += " seven";
                            break;
                        case 8:
                            docSo += " eight";
                            break;
                        case 9:
                            docSo += " night";
                            break;
                        case 10:
                            docSo += " ten";
                            break;
                        case 11:
                            docSo += " eleven";
                            break;
                        case 12:
                            docSo += " twelve";
                            break;
                        case 13:
                            docSo += " thirteen";
                            break;
                        case 14:
                            docSo += " fourteen";
                            break;
                        case 15:
                            docSo += " fifteen";
                            break;
                        case 16:
                            docSo += " sixteen";
                            break;
                        case 17:
                            docSo += " seventeen";
                            break;
                        case 18:
                            docSo += " eighteen";
                            break;
                        case 19:
                            docSo += " nineteen";
                            break;
                    }
                }
            }
            else {
                if(soHangTram>0)
                    docSo+=" and";
                int soHangChuc = xuLySoDienVao / 10;
                switch (soHangChuc) {
                    case 9:
                        docSo += " ninety";
                        break;
                    case 8:
                        docSo += " eighty";
                        break;
                    case 7:
                        docSo += " seventy";
                        break;
                    case 6:
                        docSo += " sixty";
                        break;
                    case 5:
                        docSo += " fifty";
                        break;
                    case 4:
                        docSo += " fourty";
                        break;
                    case 3:
                        docSo += " thirty";
                        break;
                    case 2:
                        docSo += " twenty";
                        break;
                }
                xuLySoDienVao=xuLySoDienVao-soHangChuc*10;
                switch (xuLySoDienVao) {
                    case 1:
                        docSo += " one";
                        break;
                    case 2:
                        docSo += " two";
                        break;
                    case 3:
                        docSo += " three";
                        break;
                    case 4:
                        docSo += " four";
                        break;
                    case 5:
                        docSo += " five";
                        break;
                    case 6:
                        docSo += " six";
                        break;
                    case 7:
                        docSo += " seven";
                        break;
                    case 8:
                        docSo += " eight";
                        break;
                    case 9:
                        docSo += " night";
                        break;
                }
            }
            System.out.println("số " + soDienVao +" đọc là:"+ docSo);
    }
}
