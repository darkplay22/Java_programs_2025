import java.util.*;
class Sep
{
    static String a;
    String s2;
    Sep()
    {
        a="";
        s2="";
    }
   static void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string :");
        a=sc.nextLine();
        
    }
    public void work()
    {
        input();
        a=a+" ";
        int p= a.length();
        int i,j,k=0,l;
        char ch,ch2;
        for(i=0;i<p;i++)
        {
            ch=a.charAt(i);
            if (ch==' ')
            {
                l=s2.length();
                k=vowel(s2);
                System.out.println(s2+"\t "+k);
                s2="";
            }
            else 
           {s2=s2+ch;
            }
        }
    
    }
    static int vowel(String st)
    {
        int l=st.length();
        int k=0;
        for(int j=0;j<l;j++)
        {
            char ch2=st.charAt(j);
            if( ch2=='a' || ch2=='e'||ch2=='o' || ch2=='i'||ch2=='u' || ch2=='A'||ch2=='E' || ch2=='O'||ch2=='I' || ch2=='U')
            {k++;}

    }
    return k;
}
    public static void main(String args[])
    {
        Sep ob= new Sep();
        
        ob.work();
    }
    }
