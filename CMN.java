import java.util.*;
class CMN
{
    boolean composite(int q)
    {
        int a,b=0;
        for(int i=1;i<=q;i++)
        {
            a=q%i;
            if(a==0)
            b++;
        }
        if(b==2)
        return false;
        else
        return true;
    }
    boolean magic(int p)
{
        int a,d,s=0;
        a=p;
        while(a>9)
        {
            s=0;
        while(a>0)
        {
            d=a%10;
            s=s+d;
            a=a/10;
        }
        a=s;
    }
    //System.out.println(s);
    if(s==1)
    return(true);
    else
    return(false);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a the upper and lower limits: ");
        int m,n,i;
        boolean a, b;
        CMN ob=new CMN();
        m=sc.nextInt();
        n=sc.nextInt();
        while(m>n)
        { 
            b=ob.composite(m);
            a=ob.magic(m);
            if(b && a)
            System.out.println(m);
            m--;
    }
}
}