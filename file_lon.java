import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class file_lon
{
    public static void main(String args[]) throws IOException
    { String sentence="";

           File file=new File("new.txt");
           Scanner sc=new Scanner(file);
            while (sc.hasNext()) {
                
               String name = sc.next();
               sentence= sentence + name+" ";
            }
              //System.out.println(sentence);
              int k,max=0;String g="";
              String a[]=sentence.split(" ");
              for(int i=0;i<a.length;i++)
              {
               k=a[i].length();
               if(k>max)
               {
                 max=k;g=a[i];
               }
              }
              System.out.println("The longest word is: "+g);
            sc.close();
        }
    }

