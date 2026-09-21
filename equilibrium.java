import java.util.*;
class equilibrium
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number of array elements: ");
        int n,i,j,k=0,s=0,s2=0;
        n=sc.nextInt();
        if(n>=3 && n<=50)
        {
            System.out.println("Enter the array elements:");
        int a[]=new int[n];
        for(i=0;i<n;i++)
           {
            a[i]=sc.nextInt();
           }

           for(i=0;i<n;i++)
           {
           System.out.print(a[i]+"  ");
           }

           for(i=0;i<n;i++)
           {
            s=0;s2=0;
            for(j=0;j<i;j++)
            {
                s=s+a[j];
            }
            if(i!=n-1)
            {
             for(j=i+1;j<n;j++)
            {
                s2=s2+a[j];
            }
        }
            System.out.println(s+" "+s2);
            if(s==s2)
            {
                k=1;
              System.out.println("Equilibrium indices :"+i+"  ");
            }
           }
           if(k==0)
            System.out.println("Equilibrium indices :NIL");

        }
        else System.out.println("Invalid input !!");
    }
}