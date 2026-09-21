import java.util.*;
class amigo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s,s2="",s3="";
        char ch;
        s=sc.nextLine();
        int p,i,j;
        p=s.length();
        for(i=0;i<p;i++)
        {
          ch=s.charAt(i);
          if(Character.isLetter(ch))
           s2=s2+ch;
        else if (Character.isDigit(ch))
            s2=s2+ch;
        else
              continue;
        }
        s2=s2.toUpperCase();
        for(i=0;i<s2.length();i++)
        {
            ch= s2.charAt(i);
            s3=ch+s3;
        }
        if(s2.compareTo(s3)==0)
            System.out.println("Palindrome string !");
          else
            System.out.println("Not a palindrome String !");
    }
}