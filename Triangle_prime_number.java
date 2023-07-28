package Practice.Loops.Assignment;

import java.util.Scanner;

public class Triangle_prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1;
        int x2;
        int x3;
        int number=3;
        int ban=0;
        x1 = sc.nextInt(); //denoting length of pattern
        int d= x1; //number of spaces at each line, equal to line number
        for(x2=1;x2<= x1; x2++){
            for(int e=1;e<=d;e++){
                System.out.print(" ");
            }
            if(x2==1){//1st line
                System.out.println("2");
            }
            else{//other lines
                for(x3=0; x3!= x2;){
                    ban=0;
                    for (int k=2;k<number;k++){ //check if prime or not
                        if((number%k)==0)
                            ban=1; //not prime
                    }
                    if(ban==0){ //prime
                        x3++;
                        System.out.print(number + " ");
                    }
                    number++;
                }
            }
            System.out.println(); //move to next line
            d--;
        }
    }
}
