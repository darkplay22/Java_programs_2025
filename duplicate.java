import java.util.*;
public class duplicate 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one/ more strings");
        String a;
        
        a=sc.nextLine();
        String b[]=a.split(" ");
        int p,i,j,c=0;
        p=b.length;
        String v[]= new String [p];
        boolean flag=true;
         for(i=0;i<p;i++)
         {
            flag=true;
            for(j=0;j<c;j++)
            {
                if(b[i].compareTo(v[j])== 0)
                {
                    flag=false;
                    break;
                }
            
            }
          if(flag==true)
          {
          v[c]=b[i];
          c++;
          }
         
    }
    for(i=0;i<c;i++)
   System.out.print(v[i]+" "); 
}
}
