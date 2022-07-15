import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Scanner sc = new Scanner(System.in);
        for(int a=1000;a<=2000;a++)
        {
            System.out.print(a+" ");
            if(a%5==4)
            {
                System.out.println("\n");
            }
        }
    }
}
