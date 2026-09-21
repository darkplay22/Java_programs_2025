import java.util.*;
class magic_square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements");
        int a[][]=new int[3][3];
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
                a[i][j]=sc.nextInt();
        }
        int s=0,s2=0,k=1 ,s3=0,s4=0;
        for(j=0;j<3;j++)
        {
          s=s+a[0][j];
        }
        for(i=0;i<3;i++)
        {
            s2=0;
            for(j=0;j<3;j++)
            {
               s2=s2+a[i][j];
            }
            
            if(s2!=s)
            {
                k=0;
                break;
            }
        }
        int l=2;
        for(j=0;j<3;j++)
            {
                s3=s3+a[j][j];
            }
            
            for(j=0;j<3;j++)
            {
                s4=s4+a[j][l];
                l--;
            }
          if(s3!=s || s4!=s)
          {
            k=0;
          }
        if(k==1)
            System.out.println("Magic square !!");
        else
            System.out.println("Not magic square !!");
    }
}