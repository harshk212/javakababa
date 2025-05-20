import java.util.Scanner;

public class compound {
    public static void main(String[]args){

        //compound interest calculator
        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        double amount;  //*
        int year;
        int timescompound;

        System.out.println("enter the principle amount : ");
        principal = scanner.nextDouble();

        System.out.println("enter the rate : ");
        rate = scanner.nextDouble();

        System.out.println("enter the time in year : ");
        year = scanner.nextInt();

        System.out.println("enter the times compound : ");
        timescompound = scanner.nextInt();

        amount = principal * Math.pow(1+rate/timescompound , timescompound * year);
        System.out.println(" your compound interest of " + year + " is : " + amount);

        scanner.close();
    }
}
