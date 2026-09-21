import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_read_lines {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
             String sentence="";
            int maxMarks = Integer.MIN_VALUE;
            String topStudent = "";

            while (scanner.hasNext()) {
                
                String name = scanner.next();
               sentence= sentence + name+" ";
            }
              System.out.println(sentence);
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the filename or path.");
        }
    }
} 
    

