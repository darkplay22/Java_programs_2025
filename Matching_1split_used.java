import java.util.*;
class Matching_1split_used
{
    static boolean hehe(String p, String q)
    {
        int i,j,k=0;
        boolean c=true;
        char ch;
        for(i=0;i<p.length();i++)
        {
           ch= p.charAt(i);
           k=0;
           for(j=0;j<p.length();j++)
           {
           if(ch==q.charAt(j))
           k++;
           }
           if(k>0)
           c=true;
           else
           { c=false;
        break;}
        }
        if(c==true)
        return true;
        else 
        return false;  
      }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String a,b;
        boolean d=true;
        int i,l;
        a=sc.nextLine();
        System.out.println("Enter a word:");
        b=sc.next();
        l=b.length();
         String s[]=a.split(" ");
         for(i=0;i<s.length;i++)
         {
            if(s[i].length()==l)
            {
            d=hehe(b,s[i]);
            if(d==true)
            System.out.println(s[i]);
         }
        }
    }
}