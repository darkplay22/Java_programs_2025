
import java.util.*;

public class solution2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       s=s+" ";
        int i,j=0, l=0;
        long p = s.length();
        String d="",e="";
        char ch;
        p=s.length();
        if(p<400000)
        {
        for(i=0;i<p;i++)
        {
           ch= s.charAt(i);
           if(ch=='!' ||ch==','||ch=='?'||ch=='.'||ch=='_'||ch=='\''||ch=='@'||ch==' ')
           {
           if(j>0)
           {
            
           e="";
           j=0;
           l++;
           }
          
           }
        else
        {
            if(ch!= ' ')
            {
        e=e+ch;
        
        j++;

            }
        }
        
        }
        System.out.println(l);
        for(i=0;i<p;i++)
        {
           ch= s.charAt(i);
           if(ch=='!' ||ch==','||ch=='?'||ch=='.'||ch=='_'||ch=='\''||ch=='@'||ch==' ')
           {
           if(j>0)
           {
            System.out.println(e);
           e="";
           j=0;
           l++;
           }
          
           }
        else
        {
            if(ch!= ' ')
            {
        e=e+ch;
        
        j++;

            }
        }
    }
        
    }
    }
}

