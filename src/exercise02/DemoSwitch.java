package exercise02;

import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = sc.nextInt();
        switch (week){
            case 1:
                System.out.println("工作日");
                break;
            case 2:
                System.out.println("工作日");
                break;
            case 3:
                System.out.println("工作日");
                break;
            case 4:
                System.out.println("工作日");
                break;
            case 5:
                System.out.println("工作日");
                break;
            case 6:
                System.out.println("休息日");
                break;
            case 7:
                System.out.println("休息日");
                break;
            default:
                 System.out.println("您的输入有误");
            break;
        }


    }
}
