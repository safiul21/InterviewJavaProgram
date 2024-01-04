package interview;

import java.util.Scanner;

public class FibonacciSeries {

    //0 1 1 2
    public static void main(String[] args) {
       int n1=0, n2=1, sum=0;
        System.out.println("Enter how many numbers need to print:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(+n1+ " " +n2);

        for (int i=2; i<n; i++){
            sum= n1+n2;
            System.out.println(" "+sum);
            n1=n2;
            n2=sum;


        }

    }
}
