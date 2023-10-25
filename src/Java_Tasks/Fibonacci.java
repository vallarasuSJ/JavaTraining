package Java_Tasks;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int N=sc.nextInt();
        int f1=0;
        int f2=1;
        System.out.println("Fibonacci series: ");
        System.out.println(f1);
        System.out.println(f2);
        int f3=f1+f2;
        for(int i=2;i<N;i++){
            System.out.println(f3);
            f1=f2;
            f2=f3;
            f3=f1+f2;
        }

    }
}
