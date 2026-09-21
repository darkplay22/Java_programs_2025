import java.util.*;
class recu_deci
{
    String num;
        public String deciToBin(int n)
        {
            if(n==0)
            return " ";
          else
          num=deciToBin(n/2) + Integer.toString(n%2); 
          return num;
        }
        
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        recu_deci ob= new recu_deci();
        System.out.println("Enter a decimal number:");
        int a;
        a=sc.nextInt();
         System.out.println(ob.deciToBin(a));
    }
}