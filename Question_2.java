import java.util.*;
class Question_2
{
    static int gcd(int p,int q)
    {
        int min,i,gc=0;
        min=(p<q)?p:q;
        for(i=1;i<=min;i++)
        {
            if(p%i==0 && q%i==0)
            gc=i;
        }
        return gc;
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array limit:");
    int n,i,j,k,max=0;;
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the array elements:");
for(i=0;i<n;i++)
    a[i]=sc.nextInt();
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
         k=gcd(a[i],a[j]);
         if(k>max)
         max=k;
        }
    }
    System.out.println("The answer is : "+ max);
}
}