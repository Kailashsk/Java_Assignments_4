import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a + " ");
        System.out.print(b +" ");
        for(int i=1 ; i<=(n-2)/2 ; i++)
        {
            a=a+b;
            b=a+b;
            System.out.print(a+" "+b+" ");
        }
        if(n%2!=0)
        {
            a=a+b;
            System.out.print(a+" ");
        }
    }
}
