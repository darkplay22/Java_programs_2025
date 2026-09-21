import java.util.*;
public class happy {

    static boolean isvowel(String st)
    {

        String vowels="aeiouAEIOU";
    for(int k=0;k<st.length();k++)
    {
        char ch= st.charAt(k);
        if(vowels.indexOf(ch)==-1)
        return false;
        }
        return true;

    }
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String a,b="",c="";

a=sc.nextLine();
int i,p,j,k,l=0;
p= a.length();
for(i=0;i<p;i++)
{
    for(j=i+1;j<=p;j++)
{
    b=a.substring(i,j);
    if(b.length()>2 && isvowel(b))
        System.out.println(b);

    }
}
    }
    
}
