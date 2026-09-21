import java.util.*;
class hi2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter length");
         int p,max=0,min,max1=0,min1,m=0,n=0,i;
         p=sc.nextInt();
        System.out.println("Enter a number array");
        
        int a[]= new int[p];
        for(i=0;i<p;i++)
        {
          a[i]=sc.nextInt();
        }
        min=a[0];
        m=a[0];
         for(i=0;i<p;i++)
         {
            if(i%2!=0)
            {
                
                if(a[i]<min)
                { m=min;
                    min=a[i];
                }
            }
            else
            {
                
                if(a[i]>max1)
                { n=max1;
                    max1=a[i];
                }
               
            }
         }
         System.out.println(m +"       "+n);

    }
}