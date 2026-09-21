import java.util.*;
public class Smith2
 {
   public int fun(int n)
   {
    int sum=0;
    while(n!=0)
    {
        sum=sum+n%10;
        n=n/10;
    }
    return sum;
   }
    public boolean check(int b)
    {
       
        int i=2,s=0,n=b,n1=b;
       
        for(i=2;i<=n;i++)
        {
            while(b%i==0)
            {
            String str = Integer.toString(i);  
            if(str.length()<=1)
            {
            s+=i;}
            else
            {
                s+=fun(i);
            }

            b=b/i;

            }
        }
        
        //System.out.println(s+" "+sum);
        if(s==fun(n1))
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a;boolean r;
        a=sc.nextInt();
        Smith2 ob= new Smith2();
        r=ob.check(a);
        if(r==true)
        System.out.println("Smith number!!");
        else 
        System.out.println("Not a Smith number");
    }

}
