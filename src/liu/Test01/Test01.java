package liu.Test01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String datails = "";
        int balance = 0;
        while (true){
            System.out.println("----------欢迎使用系统----------");

            System.out.println("1.收支明细");
            System.out.println("2.登记收入");
            System.out.println("3.登记支出");
            System.out.println("4.退   出");
            System.out.print("请输入你要选择的功能：");
            int choice = input.nextInt();

            //在选择前面加一个循环，如果选择错误，就一直循环
            while (choice != 1 && choice != 2 && choice != 3 && choice != 4){
                System.out.println("对不起，没有你要选择的功能，请重新选择");
                int newchoice = input.nextInt();
                choice = newchoice;
            }

            switch (choice){
                case 1:
                    System.out.println("记账系统》》》收支明细");
                    //直接输出，如果字符串为空再减1，系统报错，因为字符串下标不能为-1
                    if (datails != ""){
                        //解决输入最后一行加空格问题，字符串名+substring为截取字符串方法，datails.length()-1为减去最后1个字符空格的意思
                        String s = datails.substring(0, datails.length() - 1);
                        System.out.println(s);
                    }else {
                        System.out.print(datails);
                    }
                    break;
                case 2:
                    System.out.println("记账系统》》》登记收入");
                    System.out.println("请输入收入金额：");
                    int income = input.nextInt();
                    System.out.println("请输入收入说明：");
                    String incomedatail = input.next();
                    balance += income;
                    datails = datails + "收入：" + income + "，收入说明:" + incomedatail + ",账户余额：" + balance + "\n";
                    break;
                case 3:
                    System.out.println("记账系统》》》登记支出");
                    System.out.println("请输入支出金额");
                    int expend = input.nextInt();
                    System.out.println("请输入支出说明：");
                    String expenddatalis = input.next();
                    balance -= expend;
                    datails = datails + "支出：" + expend + "，支出明细：" + expenddatalis + "账户余额：" + balance + "\n";
                    break;
                case 4:
                    System.out.println("记账系统》》》退出");
                    System.out.println("确定要退出吗？ Y/N");
                    String isExit = input.next();
                    switch (isExit){
                        case "Y":
                        case "y":
                            System.out.println("退出系统！");
                            return;
                    }
            }
        }
    }
}
