import java.util.*;
class prime_recursion
{
    static int c=0;
    static int prime(int a,int i)
    {
    
        if(a==0)
        return 0;
       if(a%i==0)
       {
        c++;
       }
       if(i>a)
        {
        return c;
        }
        else
       return prime(a,i+1);
       
      /* if(c==2)
        return 1;
       else
        return 0;*/
        
        
    }
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(prime(n,1)==2)
            System.out.println("prime");
        else
            System.out.println("not a prime");


        
    }
}