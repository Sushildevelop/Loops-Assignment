package Practice.Loops.Assignment;

import java.util.Scanner;

public class bulbs_problems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i*i<=n;i++){
            System.out.print(i*i+" ");
        }
    }
}
