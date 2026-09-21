import java.util.*;
class Items___
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string:");
        String a,b,s2="",s3="";
        a=sc.nextLine();
         System.out.println("Enter a word:");
         b=sc.next();
         int i,j,p,l,k=0,d,q=0,w;
         p=a.length();
         l=b.length();
         char ch,ch2,ch3,ch4;
         for(i=0;i<l;i++)
         {
             ch=b.charAt(i);q=0;
             for(d=0;d<l;d++)
             {
                 ch3=b.charAt(d);
                 if(ch3==ch)
                 q++;
             }
             for(j=0;j<p;j++)
             {
                 ch2=a.charAt(j);k=0;
                 if(ch==' ')
                 {
                     for(w=0;w<s2.length();w++)
                     {
                         ch4=a.charAt(w);
                         if(ch4==ch){
                             s3=s2;
                         k++;
                        }
                         s2="";
                     }
                }
                else
                s2=s2+ch2;
             }
             if(k==q)
             System.out.println(s3);
             
         }
    }
}