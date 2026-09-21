import java.util.*;
public class Missing {
    public static int[] sort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        return (a);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter number of elements in the array:");
       int p,i;
       p=sc.nextInt();
        int b[]= new int[p];
         System.out.println("Enter the number array:");
        for(i=0;i<p;i++)
        b[i]=sc.nextInt();
         int c[]=sort(b);
         for(i=0;i<p-1;i++)
         {
            if(c[i+1]-c[i]>1 && c[i]>0 && c[i+1]>0)
            {
            System.out.println(c[i]+1);
            break;
            }
         }
        }
    }
