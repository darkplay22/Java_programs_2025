import java.util.*;
class hi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String s1,s2="";
        s1=sc.nextLine();
        char c,ch,h=' ',max1=' ',min1=' ';
        int i,j,p,k=0,t=0,max=0,min=1110,n=0,n1=0;
        p=s1.length();
         String st="";
         for(i=0;i<p;i++)
        {
            c=s1.charAt(i);
            if(st.indexOf(c)==-1)
                st=st+c;
        }
        char b[]=st.toCharArray();
            

        for(i=0;i<b.length;i++)
        {
            c=st.charAt(i);
            n=0;
              for(j=0;j<p;j++)
              {
               ch=s1.charAt(j);
                if(c==ch)
                    n++;
            }
                 if(max<n)
                 {
                    max=n;
                    max1=c;
                 }
                 if(min>n)
                 {
                    min=n;
                    min1=c;
                 }
            System.out.println(c+" "+n);
        
              }
        System.out.println("The maximum is "+max1+"  : "+max);
        System.out.println("The minimum is "+min1+"  : "+min);
    }

}