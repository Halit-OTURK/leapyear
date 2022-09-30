package blanks;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner leap=new Scanner(System.in);
        System.out.println("please enter year:");
        int year= leap.nextInt();
       String leapyear= (year%4==0)?"leap year":"entered year is not leap year";
        System.out.println(leapyear);
    }
}
