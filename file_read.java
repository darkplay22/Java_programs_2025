import java.io.*;
import java.util.Scanner;

public class file_read {
    public static void main(String[] args) throws IOException
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
          String a[][]=new String[5][3];
        String file ="C:\\file\\xyz.txt"; 
        BufferedReader read = new BufferedReader(new FileReader(file));

        String line;
            // Processing each line in the input file
            while ((line = read.readLine()) != null) 
            {
               System.out.println(line);
               
               
               
            }
          
        
    }
}
