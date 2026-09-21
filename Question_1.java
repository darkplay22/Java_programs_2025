import java.util.*;
class Question_1
{
      static boolean prime(int p)
      {
        int i,j,c=0;
        for(i=1;i<p;i++)
        {
           j=p%i;
           if(j==0)
            ++c;
        }
        if(c>1)
        return false;
        else return true;
      }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer");
        int a,i,l=0;
        boolean b;
        a=sc.nextInt();
        for(i=2;i<a;i++)
        {
            b=prime(i);
            System.out.println(b);
            if(b==true)
            ++l;
        }
        System.out.println("No of prime numbers before " + a +" is "+l);

    }
}