import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,fibtop=0,fib0=0,fib1=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç Adet Fibonacci Sayısı Bulunsun: ");
        sayi=input.nextInt();
        for (int i=1;i<=sayi;i++)
        {
            if((i-1) == 0 || (i-1) == 1)
            {
                System.out.print((i-1) + " ");
                continue;
            }
            fibtop=fib0 + fib1;
            fib0=fib1;
            fib1=fibtop;
            System.out.print(fibtop + " ");
        }
    }
}