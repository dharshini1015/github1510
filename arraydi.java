import java.util.*;
public class arraydi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
//         int row=sc.nextInt();
//         int col=sc.nextInt();
//         int tree=sc.nextInt();
//         int[][] matrix = new int[row][col];
//         if(tree>=1 && tree<=row||tree % row==1||tree % row==0)
//         {
//             System.out.println("yes");
//         }
//         else
//         {
//             System.out.println("no");
//         }
    //    int m=sc.nextInt();
    //    int n=sc.nextInt();
    //    int sum=0;
    //    int[][] a=new int[m][n];
    //    for(int i=0;i<m;i++)
    //    {
    //     for(int j=0;j<n;j++)
    //     {
    //         a[i][j]=sc.nextInt();
    //     }
    //    }
    //    for(int i=0;i<m;i++){
    //     for(int j=0;j<n;j++)
    //     {
    //         sum+=a[i][j];
    //     }
    //    }
    //     System.out.println(sum);



     int m=sc.nextInt();
       int n=sc.nextInt();
       int[][] a=new int[m][n];
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            a[i][j]=sc.nextInt();
        }
       }
       for(int i=0;i<m;i++){
        int rowSum=0;
        for(int j=0;j<n;j++)
        {
            rowSum+=a[i][j];
        }
       }
        System.out.println("sum of row"+(i+1)+rowSum);
 }
 }
    

    