import java.io.File;
impostrt java.io.FileNotFoundException;
import java.util.Scanner;

public class MaxMarksFinder {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");
            Scanner scanner = new Scanner(file);

            int maxMarks = Integer.MIN_VALUE;
            String topStudent = "";

            while (scanner.hasNext()) {
                int rollNo = scanner.nextInt();
                String name = scanner.next();
                int marks = scanner.nextInt();

                if (marks > maxMarks) {
                    maxMarks = marks;
                    topStudent = name;
                }
            }

            scanner.close();

            System.out.println("Top student: " + topStudent);
            System.out.println("Maximum marks: " + maxMarks);

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the filename or path.");
        }
    }
} 
    

