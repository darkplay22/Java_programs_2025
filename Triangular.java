import java.util.*;
class Triangular
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int a=0,n,i=1,j,s=0;
        n=sc.nextInt();
        while (s<n)
        {
          s=s+i;
          if(s>1)
          System.out.println(s);
          i++;
        }
    }

}
