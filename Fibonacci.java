package Assignment.Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t1=1,t2=1,t3;
        System.out.print(t1+" "+t2+" ");
        for (int i=3; i<=n; i++){
            t3=t1+t2;
            System.out.print(t3+" ");
            t1=t2;
            t2=t3;
        }
    }
}
