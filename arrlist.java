import java.util.*;
public class arrlist
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        List <String> list=new ArrayList<>();
        System.out.println("enter the array size");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
        {
            String name=sc.nextLine();
            list.add(name);

        }
        System.out.println("names:");
        for(String i:list)
        {
            System.out.print(i);
        }
        System.out.println(list);
    }
}