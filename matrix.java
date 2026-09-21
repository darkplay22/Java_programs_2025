import java.util.*;
class matrix
{
     int prime(int a)
     {
       int i,k=0;
       for(i=1;i<=a;i++)
        if(a%i==0)
            k++;
        if(k==2)
            return a;
    else 
        return 0;
     }   
    public static void main(String args[])
    {
        matrix ob=new matrix();
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter m and n: ");
        int n,m,i,j,k=0;
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
    System.out.println("Enter the elements:");

for(i=0;i<m;i++)
{
    for(j=0;j<n;j++)
        a[i][j]=sc.nextInt();
}

   for(i=0;i<m;i++)
{
    for(j=0;j<n;j++)
        System.out.print(a[i][j]+"  ");
    System.out.println();
}

int max=0,max2=0,srow=0,scol=0;
for(i=0;i<m;i++)
{
    srow=0;
    for(j=0;j<n;j++)
    {
    k=ob.prime(a[i][j]);
    srow=srow+k;
    }
    if(srow>max)
        {
            max=srow;
            k=i;
        }
}
System.out.println("Row with max prime sum: "+ i +" ( sum : "+max+")");
for(j=0;j<n;j++)
{ 
    scol=0;
    for(i=0;i<m;i++)
    {
    k=ob.prime(a[i][j]);
    scol=scol+k;
    }
    if(scol>max2)
        {
            max2=scol;
            k=j;
        }
}
System.out.println("Column with max prime sum: "+ j +" ( sum : "+max2+")");


    }
}