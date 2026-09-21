import java.util.*;
public class Ascii
 {
    public static void main( String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String a;
        int p,i,j,k, max=0,min=200;
        char ch;
        a=sc.next();
        p=a.length();
        for(i=0;i<p;i++)
{
    ch = a.charAt(i);
     k=(int)ch;
     System.out.println(ch+ " = " +k);
     if(k>max)
     max=k;
     if(k<min)
     min=k;
}
System.out.println("Lowest ascii : "+min);
System.out.println("Highest ascii : " +max);
    }
    
}
