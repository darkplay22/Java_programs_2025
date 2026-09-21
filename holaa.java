import java.util.*;
public class holaa 
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string");
            String a,b="",d;
            a=sc.nextLine();
            a=a.toUpperCase();
            int i,p,j;
            char c;
             p=a.length();
              for(i=0;i<p;i++)
              {
                c=a.charAt(i);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                 {d="( "+Integer.toString(26-((int)c)+65)+" )";
                 b=b+d;}
                 else
                 b=b+Character.toLowerCase(c);
              }
              System.out.println("New String is : "+b);
        }
}
