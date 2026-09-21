import java.io.*;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String file ="xyz.txt"; 
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        sc.nextLine();  

        String[] array = new String[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextLine();
        }

        System.out.println("The elements of the array are: ");
        for (int i = 0; i < size; i++) {
            writer.write(array[i]); 
            writer.newLine();
            System.out.print(array[i] + "\n");
        }
        writer.close();
        
    }
}
