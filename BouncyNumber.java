import java.util.Scanner;
public class BouncyNumber
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number: ");
 String n = sc.nextLine();
 int inc = 0, dec = 0;
 boolean valid = true;
 for(int i = 0; i < n.length(); i++)
 {
 if(n.charAt(i) < '0' || n.charAt(i) > '9')
 {
 valid = false;
 break;
 }
 }
 if(!valid)
 {
 System.out.println("INVALID INPUT");
 return;
 }
 for(int i = 1; i < n.length(); i++)
 {
 if(n.charAt(i) > n.charAt(i-1))
 inc++;
else if(n.charAt(i) < n.charAt(i-1))
 dec++;
 }
 if(inc > 0 && dec == 0)
 System.out.println(n + " IS AN INCREASING NUMBER");
 else if(dec > 0 && inc == 0)
 System.out.println(n + " IS A DECREASING NUMBER");
 else
 System.out.println(n + " IS A BOUNCY NUMBER");
 }
}