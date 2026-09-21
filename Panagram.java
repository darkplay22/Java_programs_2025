import java.util.Scanner;

public class Panagram {
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String m,a;
        char sch;
        int i,j,l,k=0;
    
        m=sc.nextLine();
        a=m.toUpperCase();
        l=a.length();          
         for(i=65;i<=90;i++)
        {
           sch=(char)i;
           k=0;
            for(j=0;j<l;j++)
            {
                if(sch==a.charAt(j))
                {
                    k++;
            }
        }
    }
    if(k>0)
    System.out.println("Panagram !");
    else
    System.out.println("Not an Panagram!");
}
    
}
