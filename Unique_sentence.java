
import java.util.*;
class Unique_sentence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s,s2="",s3="";
        s=sc.nextLine();
        s=s+" ";
       int i,j,k=0,p,x=0;
       char ch,ch2;
       p=s.length();
       for(i=0;i<p;i++)         
       {
        ch=s.charAt(i);
        if(ch==' ')
        {
            for(j=i+1;j<p;j++)
            {                                                                 ##   not running due to excessive loops
                ch2=s.charAt(j);
                if(ch2==' ')
                {
                if(s2.compareTo(s3)==0)
               {k=1;x++;}s3="";
            }
            else
            s3=s3+ch2;
            }if(x>1)System.out.println(s2);s2="";
        }
        else s2=s2+ch;
       }
       if(k==0)
       System.out.println("Unique sentence");
       else 
       System.out.println(" Not a Unique Sentence");
    }
    
    
}


