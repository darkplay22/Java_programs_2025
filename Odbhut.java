import java.util.*;
class Odbhut
{
    int heterogram( String k)
    {
        int p= k.length();
        int i,j,f=0;
        char ch1,ch;
        for(i=0;i<p;i++)
        {
            ch1= k.charAt(i);
            for(j=i+1;j<p;j++)
            {
                ch= k.charAt(j);
                if ( ch==ch1)
                {
                    f=1;
                    break;
                }
                
            }
        }
        return( f);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String :");
        String s,q1,q2;
        s= sc.next();
        int p, mid;
        p= s.length();
        
        Odbhut ob= new Odbhut();
        int d= ob.heterogram(s);
        if (d==1)
        {
         if (p% 2!=0)
         {
             mid= p/2;
             q1=  s.substring(mid+1)+s.substring(mid,mid+1) +  s.substring(0,mid);
             System.out.println(q1);
         }
         else
         {
             mid= p/2;
             q2= s.substring(mid)+s.substring(0,mid);
             System.out.println(q2);
         }
        }
        else
        System.out.println(" Heterogram string");
    }
}