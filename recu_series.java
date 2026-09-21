import java.util.*;
class recu_series
{
    int s;
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int a;
        a= sc.nextInt();
        recu_series ob= new recu_series();
        System.out.println(ob.sum(a));
    }
    public int sum(int n)
    {
        if (n==0)
        return 0;
        else 
        s= n+ sum(n-1);
        return s;
    }
}