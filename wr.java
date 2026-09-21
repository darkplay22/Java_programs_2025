import java.util.*;
class wr
{
    int pastry(int z)
    {
       if(z==0)
        return 0;
       else
        return (z%10+pastry(z/10));
        
    }
    boolean prime(int a)
    {
        int i,j=0;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
                j++;
        }
        if(j==2)
            return true;
        else 
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        wr ob= new wr();
        System.out.println("ENter a binary number");
        int a,b;
        a=sc.nextInt();
        b=ob.pastry(a);
        System.out.println(b);
        if (ob.prime(b)==true)
        System.out.println("Pastry number!");
        else
            System.out.println("Not a pastry number!");
    }
}