import java.util.*;
class Unique
{
    public static void main( String args)
    {
        Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a, n, b=0, d, k=1, e, f;
    a= sc.nextInt();
    n=a;
    while(n>0)
    {
        d= n%10;
        if(d==b)
        {
            k=0;break;
        }
        else
        {
            b=d;
            n=n/10;
            f=n;
            while(f>0)
            {
                e= f%10;
                if(e==b)
                {
                    k=0; break;
                }
                f=f/10;
            }
            n=n/10;
        }
    }
    if(k==1)
System.out.println(a+" is an Unique number");
else
System.out.println(a+" is not an Unique number");
}
}