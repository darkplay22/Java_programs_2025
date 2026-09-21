import java.util.*;
class Bouncy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number :");
        int a;
        a=sc.nextInt();
        int l1,l2,l3;;
         l1=Integer.toString(a).length();
        int b[]= new int[l1];
        int y= l1/2;
        int i,j,k=0;
        if(l1%2==0)
        {
            l2=y;
            l3=y;
        }
        else
          {
            l2=y+1;
            l3=y;
          }
          int nodd[]=new int[l2];
          int neven[]= new int [l3];
        for(i=0;i<l2;i++)
        {
          nodd[i]=b[k];
          k=k+2;
        }
        k=1;
        for(i=0;i<l3;i++)
        {
            neven[i]=b[k];
            k=k+2;
        }
        int r=0;
        if(b[0]<b[1])
        {
           for(i=0;i<l3;i++)
           {
            if( nodd[i] >neven[i] || neven[i]<nodd[i+1])
           {
            r=0;
            break;
           }
           else
            {
            r=1;
           }
           }
        }
        else
            {
              for(i=0;i<l3;i++)
           {
            if( nodd[i] <neven[i])
            {
               
           
            r=0;
            break;
           
        }
        else if( i!=l3-1 && neven[i]>nodd[i+1])
             {
             
            r=0;
            break;
           
        }
           else
            {
            r=1;
           }
           }
        }
        if(r==1)
            System.out.println("Bouncy !!");
        else
            System.out.println("Not Bouncy !!");
        }
       
    }
