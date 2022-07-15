import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int n = sc.nextInt();
        int a=0;
        while(n>0)
        {
            int r = n % 10;
            a = (a * 10) + r;
            n = n / 10;
        }
        System.out.println("Therefore the reversed number is = " + a);
    }
}
