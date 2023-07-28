package Practice.Loops.Assignment;

import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (isPrime(n) && isPrime(n-2)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public static boolean isPrime(int n){
        if (n<=1)
            return false;
        for (int i=2;i*i<=n;i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
}
