import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int s=0;
        int a=0;
        int b=0;
        int i;
        for (i=1 ; i<=n ; i++)
        {
            a = a + i;
            b = b + (i*i);
        }
        System.out.println("Sum of squares of first 10 natural numbers = " + b);
        System.out.println("Square of sum of first 10 natural numbers = " + (a*a));
        System.out.println("The difference between the sum of the squares of the sum of the first 10 natural numbers and the square of the sum is = " + ((a*a)-b));
    }
}
