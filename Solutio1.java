import java.util.Scanner;

public class Solutio1 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int i,j,p;
        largest="AAA";
        smallest="zzz";
        String y="";
        p=s.length();
        for(i=0;i<p;i++)
        {
            for(j=i+1;j<=p;j++)
            {
                y=s.substring(i,j);
                //System.out.println(y);
                if(y.length()==k)
                {
                    if(y.compareTo(largest)>0)
                     largest=y;
                     if(y.compareTo(smallest)<0)
                     smallest=y;
            
                }
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}