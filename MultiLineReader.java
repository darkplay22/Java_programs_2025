import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MultiLineReader {
    public static void main(String[] args) throws IOException {
        File file=new File("file.txt");
         Scanner sc=new Scanner(file);String s2="", s3="";
        while (sc.hasNextLine())
         {
            String line = sc.nextLine();
            line= line+" ";
            s3="";
            for(int i=0;i<line.length();i++)
            { 
               char c=line.charAt(i);
               if ( c==' ')
               {
                s3=s2+" "+s3;
                s2="";
               }
               else                                                                                                     
               s2=s2+c;
            }
            System.out.println(s3);     
        }

        sc.close();
    }
}







