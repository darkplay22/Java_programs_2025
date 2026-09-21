import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class file_read_scanner {
    public static void main(String[] args) throws IOException {
        File file = new File("abc1.txt");
        Scanner sc = new Scanner(file);
        int max=0;
        String maxx="";

        while (sc.hasNext()) {

            int a,c;
            String b;
            a=Integer.valueOf(sc.next());
            b=sc.next();
            c=Integer.valueOf(sc.next());
            System.out.println(a+" "+b+" "+c+"");
            if(c>max)
            {
              max=c;
               maxx=b;
            }
           

        }
        System.out.println(maxx+" "+max);

        sc.close();
    }
}
