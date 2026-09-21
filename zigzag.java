import java.util.*;
class zigzag
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array elements: ");
        int n,i,j,k=0;
        n=sc.nextInt();
        if(n>2 && n<10)
        {
            System.out.println("Enter the array elements:");
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]<0)
            {
                System.out.println("Invalid input !!");
                System.exit(0);
            }
        }
        int t=0;
        for(i=0;i<n-1;i++)
        {
            int g=i;
            if(g%2==0)
            {
                if(a[i]<=a[i+1])
                    k=1;
                else{
                    t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;

                }
            }
            else
            {
                if(a[i]>=a[i+1])
                    k=1;
                else
                    {
                       t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }

        }
        for(i=0;i<n;i++)
            System.out.print (a[i]+"  ");
        }
        else 
            System.out.println("Invalid input !!");
    }
}