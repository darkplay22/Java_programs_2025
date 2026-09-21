import java.util.*;
public class Golbatch {
    boolean prime(int k)
    {
        int i,c=0;
        for(i=1;i<=k;i++)
        {
            if( k%i==0)
            ++c;
        }
        if(c==2)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Golbatch ob= new Golbatch();
Scanner sc = new Scanner(System.in);
System.out.println("Enter a positive even number:");
int a,u=0;
a= sc.nextInt();
if( a>9 && a<50)
{
if( a%2==0)
{
    for(int i=1;i<a;i++)
    {
        if(i==2)
        continue;
        if(ob.prime(i) == true)
        for(int j=i;j<a;j++)
        {
            if(j==2)
            continue;
            if( ob.prime(j)== true)
        {if(i+j ==a)
            System.out.println("Prime pairs are:"+ i+" , "+j);
            u= 1;
        }
    }
}
if(u==0)
System.out.println(" Number is not golbatch number.");
}
else
 System.out.println("Invalid Input. Number is odd.");
}
else
System.out.println("Invalid input. Number out of range:");
}
}

    
