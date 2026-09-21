import java.util.*;
class No_duplicate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s,a="";
        s=sc.nextLine();
       int i,j,t=0;
       char ch,ch2;

       for(i=0;i<s.length();i++)
       {
         ch=s.charAt(i);t=0;
         ch2='0';
         for(j=0;j<a.length();j++)
         {
            ch2=a.charAt(j);
if(ch==ch2)
{
break;
}

         }
         if(ch!=ch2)
         a=a+ch;


        

       }
       System.out.println(a);
    
        }
}