import java.util.*;
public class Smith
 {
    int sum(int z)
    {int d,s=0;
         while(z>0)
        {
            d= z%10;
            s=s+d;
            z=z/10;
        }
        return(z);
    }
   
    boolean check(int b)
    {
       
        int i=2,j,f,g=1,s=0,k=0,x=0;
       
            while(b>0 )
            {
             f=b%i;
             if(f==0) 
              {

                b=b/i;k=0;
                for(j=1;j<=i;j++)
                {if(i%j == 0)
                k++;
                 }

              if(k==2)
                {
                    g=i;
                x=sum(g);
            }
        }if(b%i!=0)
        i++;

            }

        s=sum(g);
        if(s==x)
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
        Smith ob= new Smith();
        r=ob.check(a);
        if(r==true)
        System.out.println("Smith number!!");
        else 
        System.out.println("Not a Smith number");
    }

}
