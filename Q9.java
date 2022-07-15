import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        double a = 1;
        double b = 1;
        for (int i=1 ; i<=n ; i++)
        {
            a = a* x;
        }
        for (int j=1 ; j<=n ; j++)
        {
            b = b * j;
        }
        double res = a/b;
        System.out.println("Therefore the value of (x^n)/n! is = " + res);
    }
}
