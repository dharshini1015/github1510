import java.util.Scanner;
public class arith
{
    public static void main(String args[])
    {
        int a=15;
        int b=25;
        Scanner scan=new Scanner(System.in);
        System.out.println("the addition value is:" + (a+b));
        System.out.println("the subraction value is:" + (a-b));
        System.out.println("the multiplication value is:" + (a*b));
        System.out.println("the modulus value is:" + (a%b));
        System.out.println("the division value is:" + (a/b));
    }
}