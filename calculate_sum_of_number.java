package Practice.Loops.Assignment;

import java.util.Scanner;

public class calculate_sum_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(sc.hasNextInt()){ // check if input exists or not
            int num=sc.nextInt();
            if (num>=0){ // if input is positive or zero add it to the current sum
                sum +=num;
            }
            else {
                sum=-1;
                break;
            }
        }
        System.out.print(sum);
    }
}
