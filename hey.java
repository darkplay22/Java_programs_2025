import java.util.*;
public class hey {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s;
        s=sc.nextLine();
        int p,i,j,d=0;
        p=s.length();
        String a="0123456789";
        char c=' ',ch;
        for(i=0;i<10;i++)
        {
          ch=a.charAt(i);
        for(j=0;j<s.length();j++)
        {
          c=s.charAt(j);
          if(c==ch)
          d++;
        }
          System.out.println(ch+"\t"+d);
          d=0;
          s=s.replace(c,' ');
          }
        }
    }
    
    

