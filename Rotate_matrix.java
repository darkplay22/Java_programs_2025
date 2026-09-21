 import java.util.*;
class Rotate_matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of rows and columns: ");
         int m,n,i,j;
         m=sc.nextInt();
         n=sc.nextInt();
         int a[][]=new int[m][n];
         int b[][]=new int[n][m];
        System.out.println("Enter the matrix; ");
       for(i=0;i<m;i++)
       {
        for(j=0;j<n;j++)
        a[i][j]=sc.nextInt();
       }
       for(i=0;i<n;i++)
       {
        for(j=0;j<m;j++)
         b[n-i-1][j]=a[j][i];
       }

    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        System.out.print(a[i][j]+"\t");
        System.out.println();
    }
System.out.println("\n \n\n");
     for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        System.out.print(b[i][j]+"\t");
        System.out.println();
    }
    }
 {
    
}
}
