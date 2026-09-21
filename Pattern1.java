public class Pattern1 {
    public static void main(String[] args) {
        
    
    int i,j,k,c=4;
    for(i=1;i<=5;i++)
    {
        for(k=1;k<=c;k++)
        {
            System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
            System.out.print(i+" ");
        }
        c--;
        System.out.println();
    }
    c=1; 
    for(i=4;i>=1;i--)
    {
        for(k=1;k<=c;k++)
        {
            System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
            System.out.print(i+" ");
        }
        c++;
        System.out.println();
    }

    }    
}
