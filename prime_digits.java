 import java.util.*;
class  prime_digits
 {
    public boolean prime(int a)
    {
        int i,k=0;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                k++;
            }
        }
            if(k==2)
                return true;
            else
                return false;
    }
    public boolean repeat(int a)
    {
        int i,j,k=1;
        String s= String.valueOf(a);
        
        for(i=0;i<s.length();i++)
        { 
          for(j=i+1;j<s.length();j++)
          {
            if(s.charAt(i)==s.charAt(j))
                {
                    return false;
                }
        }
    }
        
            return true;
    }
    
       
    

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        prime_digits ob= new prime_digits();
        System.out.println("Enter the upper limit");
        int m,i,n,no,k=0;
        n=sc.nextInt();
         System.out.println("Enter the lower limit");
         m=sc.nextInt();
        for(i=m;i<=n;i++)
        {

            no=i;
            while(no>0)
            {
                int d=no%10;
                k=0;
                if(ob.prime(d)==false)
                {
                k=1;
                break;
                }
                no=no/10;
            }
          if(k==0 && ob.repeat(i))
          {
            System.out.println(i);
          }
        }
    }
}
