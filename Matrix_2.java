import java.util.*;

public class Matrix_2 
{
public static void main(String[] args)
 {
    Scanner sc= new Scanner(System.in);
   
     int a[]={1,2,3,4,5,6};
     int k,i,j,g=0;
     System.out.println("Enter k:");
     k=sc.nextInt();
     int b[]=new int[6];
     if(k<5)
     {
       i=k+1;
       for(j=0;j<6;j++)
       {
        if(i<6){
       
       b[j]=a[i];
       i++;
       }
    }
    
    for(j=5-k;j<6;j++)
    { 
      //System.out.println(j);
        if(g<=k)
        {
        b[j]=a[g];
        g++;}
    }

     }
     else if(k==5)
     {
        for(i=0;i<6;i++)
        b[i]=a[i];
     }
     for(i=0;i<6;i++)
     System.out.println(b[i]);

}
}
