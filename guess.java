import java.util.*;
class guess
{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a word with even number of alphabets:");
      String s,a,s2="",s3="";
      s=sc.next();
      System.out.println("Enter another word of same length");
      a=sc.next();
      char ch;
      int p,i,j;
      p=s.length();
      j=p;
      for(i=j/2 ;i>=1;i--)
      {
        ch=s.charAt(p-1);
        s2=ch+s2;
        p--;
      }
      // System.out.println(s2);
      s3=s2+s.substring(0,j/2);
      //System.out.println(s3);
      if(s3.compareTo(a)==0)
    System.out.println("Success !!");
else
    System.out.println("Not success !!");
    }
}