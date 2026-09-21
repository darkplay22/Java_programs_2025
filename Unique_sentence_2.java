import java.util.*;
class Unique_sentence_2
{
    static boolean unq(String a)
    {
      int i,j,p=0;
      int l=a.length();
      char ch,ch2;
      outer:
      for(i=0;i<l;i++)
      {
        //p=0;
        ch=a.charAt(i);
        for(j=i+1;j<l;j++)
        {
          ch2=a.charAt(j);
          if(ch==ch2)
          {
            p=0;
            break outer;
          }
          else
          {
          p=1;
           }
      }
      }
      if (p==0)
      return(false);
      else
      return(true);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s;
        boolean k;
        int m=0;
        s=sc.nextLine();
        String sr[]=s.split(" ");
        for(int i=0;i<sr.length;i++)
        {
            k=unq(sr[i]);
    if(k==true)
    m=1 ;
    else 
    m=0;       
    }
    if(m==1)
    System.out.println("Unique sentence");
    else
     System.out.println("Not a Unique sentence");
}
}

