
import java.io.*;
import java.util.Scanner;

public class New {
    public static void main(String[] args) throws IOException {
        File file = new File("old.txt");
        FileWriter newfile = new FileWriter("new.txt");
        Scanner sc = new Scanner(file);
        String p="", a="",k="";
        while (sc.hasNext()) {

            a=sc.next();
           p=p+ " "+a;

        }
        //System.out.println(p);
         int l,i;
         char c;
         l=p.length();
         for(i=0;i<l;i++)
         {
           c=p.charAt(i);
           if(Character.isLetter(c) || c==' ' || c==','  )
           k=k+c;
           else
           continue;
         }
         newfile.write(k);
         System.out.println(k);
        newfile.close();
        sc.close();
        


    }
}

