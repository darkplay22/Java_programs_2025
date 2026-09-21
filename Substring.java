import java.util.*;
public class Substring {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String a,b="";
a=sc.nextLine();
int i,p,j;
p= a.length();
for(i=0;i<p;i++)
{
    for(j=i+1;j<=p;j++)
{
    b=a.substring(i,j);
    System.out.println(b);
}
}
    }
    
}
