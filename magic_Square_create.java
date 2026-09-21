import java.util.*;

//n(n*n +1)/2
//int rand = (int)(Math.random() * 100) + 1;

class magic_Square_create
{
    private static Object label;

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter matrix size");
        int n,i,j,s2=0;
        n=sc.nextInt();
        int a[][]= new int[n][n];
        int s=n*(n*n+1)/2;
        for (i = 0; i < n; i++) {
    innerLoop:
    for (j = 0; j < n; j++) {
        a[i][j] = (int)(Math.random() * 9) + 1;
        s2 = s2 + a[i][j];
        if (s2 == s) {
            break innerLoop; 
        }
    }
}
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(a[i][j]);
            System.out.println();
        }
        }
    }
