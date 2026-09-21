import java.util.*;
class emirp
{
    boolean prime(int a)
    {
      int i,k=0,j;
      for(i=1;i<=a;i++)
        if(a%i==0)
            k++;
        if(k==2)
            return true;
        else
            return false;
    }

    boolean pal_prime(int a)
    {
      int r=0,d,n=a;
      while(n>0)
      {
        d=n%10;
        r=r*10+d;
        n=n/10;
      }
      if(r==a && prime(a)==true)
        return true;
    else 
        return false;
    }

    public static void main(String args[])
    {
        int low,up,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower limit:");
        low=sc.nextInt();
        System.out.println("Enter the upper limit:");
        up=sc.nextInt();
        emirp ob=new emirp();
        for(i=low;i<=up;i++)
        {
            if(i>9 && ob.pal_prime(i)==false && ob.prime(i)==true )
            {
                int r=0,d,n=i;
             while(n>0)
             {
               d=n%10;
               r=r*10+d;
               n=n/10;
             }
             if(ob.prime(r)==true)
                System.out.println(i +" and "+ r);
            } 
            
        }
    }
}