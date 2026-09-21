import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_write_scanner {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("abc1.txt");

        System.out.print("Enter number of students: ");
        int count = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll: ");
            String roll = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks: ");
            String marks = sc.nextLine();

            fw.write(roll + " " + name + " " + marks + "\n");
        }

        fw.close();
        sc.close();
        System.out.println("Data saved to abc1.txt");
    }
}
