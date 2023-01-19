package Assignment.Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=1;
       int n=sc.nextInt();
       for (int i=1; i<=n; i++){
           ans*=i;
       }
        System.out.println(ans);
    }
}
