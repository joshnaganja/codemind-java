import java.util.Scanner;
public class MySolution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=a*a+b*b;
        double d=Math.sqrt(c);
        System.out.printf("%.2f",d);
    }
}