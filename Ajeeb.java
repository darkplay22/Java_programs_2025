import java.util.*;
public class Ajeeb
 {
    public static void main(String args[])
    {
        String a[]= new String[4];
        String b[]= new String [4];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array elements");
        int i,j;
        String s="";
        for(i=0;i<4;i++)
            a[i]=sc.next();
        for(i=0;i<3;i++)
        { 
            char k= a[i].charAt(a[i].length()-1);
            for(j=0;j<4;j++)
            {
                char y= a[j].charAt(0);
                if(k==y)
                {
                    s=s+a[j];
                     //System.out.println(s);
                     //s="";
                }
            }
        }
        System.out.println(a[0]+s);
    }
}
