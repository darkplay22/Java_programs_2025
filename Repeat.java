import java.util.*;
import java.io.*;
class Repeat {
   public static boolean check(String st)
   {
    int i,j;
    char ch,ch2;
    for(i=0;i<st.length();i++)
    {
        ch=st.charAt(i);
for(j=i+1;j<st.length();j++)
{
    ch2=st.charAt(j);
if(ch==ch2){
return(false);

}
    }
   }
   return true;
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s;
        s=sc.nextLine();
        String st[]=s.split(" ");
        int i,j;
        for(i=0;i<st.length;i++)
        {
        boolean flag=check(st[i]);
        if(flag)
        System.out.println(st[i]);
        }
        //System.out.println(st[i])

    }
    
}
