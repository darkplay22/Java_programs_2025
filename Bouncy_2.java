import java.util.*;
class Bouncy_2
{
    boolean increasing(String st)
    {
        int i;
        System.out.println(st);
        for(i=0;i<st.length()-1;i++)
        {
            if(st.charAt(i)>st.charAt(i+1))
            return false;
        }
        return true;
    }
    
    boolean decreasing(String st)
    {
        int i;
        for(i=0;i<st.length()-1;i++)
        {
            if(st.charAt(i)<st.charAt(i+1))
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a;
        a=sc.nextInt();
        String s= Integer.toString(a);
        Bouncy_2 ob= new Bouncy_2();
        if(ob.increasing(s) == false && ob.decreasing(s)== false)
            System.out.println("Bouncy number!");
        else
            System.out.println("Not a bouncy number!");
    }
}