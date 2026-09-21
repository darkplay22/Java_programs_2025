import java.io.*;

public class RemoveDuplicate1 {

    public static void main(String[] args) {
        try {
            // Input and output file paths
            String inputFilePath = "input.txt";
            String outputFilePath = "output.txt";

            // Reading from the input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

            String line;
            // Processing each line in the input file
            while ((line = reader.readLine()) != null) {
                writer.write(removeDuplicateWords(line));  // Remove duplicate words from each line
                writer.newLine();
            }

            // Closing resources
            reader.close();
            writer.close();
            System.out.println("Processing completed. Check the output file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to remove duplicate words without using HashSet
    private static String removeDuplicateWords(String line) {
        String[] words = line.split(" ");
         
            
// Create an empty array to store unique words
String[] uniqueWords = new String[words.length];
int uniqueWordCount = 0;  // Counter to track the number of unique words

// Iterate over each word
for (int i = 0; i < words.length; i++) {
    boolean isDuplicate = false;

    // Check if the word is already in the uniqueWords array
    for (int j = 0; j < uniqueWordCount; j++) {
        if (words[i].equalsIgnoreCase(uniqueWords[j])) {
            isDuplicate = true;
            break;
        }
    }
    if (!isDuplicate) {
        uniqueWords[uniqueWordCount] = words[i];
        uniqueWordCount++;
    }
}
    String result = "";
    for (int i = 0; i < uniqueWordCount; i++) {
        if (i == 0) {
            result = uniqueWords[i];  // First word, no need for a space
        } else {
            result += " " + uniqueWords[i];  // Add space before each word
        }
    }

    return result;
    }
}
