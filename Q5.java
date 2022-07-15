import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=10;i++)
        {
            System.out.print("*");
            for(int k=2;k<=10;k++)
            {
                if((k%i==0)||(i%k==0))
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print(i);
            System.out.println(); 
        }
    }
}
