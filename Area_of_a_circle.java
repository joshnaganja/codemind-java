import java.util.Scanner;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();
        float pi=3.14f;
        float a;
        a=pi*r*r;
        System.out.printf("%.2f",a);
    }
}