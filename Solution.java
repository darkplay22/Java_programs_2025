import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                if(s1.length()<=10 && x<=999 && x>=0)
                {
                  if(x<100 && x>9)
                 System.out.println(s1+"               0"+x);
                  if(x<10)
                  System.out.println(s1+"               00"+x);
                else
                    System.out.println(s1+"               "+x);
                   
                }
            }
            System.out.println("================================");

    }
}



