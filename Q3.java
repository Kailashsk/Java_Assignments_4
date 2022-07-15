import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=0;
        for(int i=0;i<=1000;i++)
        {
            if(i%3==0 || i%5==0)
            {
                System.out.println(i);
                s=s+i;
            }
        }
        System.out.println("Sum of Above number is "+s);
    }
}
