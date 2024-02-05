import java.util.Scanner;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int area=a*a;
        int peri=4*a;
        System.out.println(area+" "+peri);
    }
}