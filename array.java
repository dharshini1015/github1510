import java.util.*;
public class array
{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value");
        int n=sc.nextInt();
        int []arr =new int[n];
        
        for(int i=0;i<size;i++)
        {
           arr [i]=sc.netInt();
           
        }
        int searchElement = sc.netInt();
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==searchElement)
            {
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println(searchElement +"is present in the array");
        }
        else
        {
            System.out.println(searchElement +"is not present in the array");
        }
    } 
}