import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Count From:");
        int a=sc.nextInt();
        System.out.println("Count To:");
        int b=sc.nextInt();
        System.out.println("Count By:");
        int c=sc.nextInt();

        for(a=4;a<=b;)
        {
            System.out.println(a+" ");
            a=a+c;
        }
    }
}
