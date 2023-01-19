package Assignment.Loops;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0; i<=n; i++){
            int temp=i;
            int sum=0;
            while (temp!=0){
                int rem=temp%10;
                sum+=rem*rem*rem;
                temp/=10;
            }
            if (sum==i) System.out.println(sum);
        }
    }
}
