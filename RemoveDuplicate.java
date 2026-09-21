import java.util.Scanner; 

public class RemoveDuplicate 

{ 

    public static void main(String args[]) 

    { 

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter a word :"); 

        String s = sc.next(); 

        String result=""; 

        for(int i = 0; i< s.length(); i++) 

        { 

            char ch = s.charAt(i); 

            boolean found = false; 

            for(int j = 0; j < result.length(); j++) 

            { 

                if(result.charAt(j) == ch) 

                { 

                    found = true; 

                    break; 

                } 

            } 

            if(!found) 

                result = result + ch; 

        } 

        System.out.println("Output: " + result); 

    } 

} 