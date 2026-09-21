import java.util.*;
public class Pal_sub{
    static int palin(String s)
    {
        int i;
        String v="";
        for(i=0;i<s.length();i++)
        v=s.charAt(i) +v;
        if(v.compareTo(s)==0)
        return(1);
        else
        return 0;

    }
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String a,b="",c="";
a=sc.nextLine();
int i,p,j,max=0,k=0;
p= a.length();
String arr[]=new String[1100];
for(i=0;i<p;i++)
{
    for(j=i+1;j<=p;j++)
{
b=a.substring(i,j);
    //System.out.println(b);
    if(b.length()!=p)
    {
     arr[k]=b;
     k++; 
    }
    }
}
int w;
//max=arr[0].length();
for(i=0;i<k;i++)
{w=palin(arr[i]);
    if(w>0){
if(arr[i].length()>=max){
max=arr[i].length();
    c=arr[i];}}
}
//System.out.println(arr[i]);

System.out.println("The longest palindrome word is: "+c);
    }
    
}
