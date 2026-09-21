import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
class yay
{
    public boolean palindrome(String a)
    {
        int p,i;
        String b="";
        char ch;
        p=a.length();
        for(i=0;i<p;i++)
        {
            ch=a.charAt(i);
            b=ch+b;
        }
        //System.out.println(b);
        if(a.compareTo(b)==0)
            return true;
        else
            return false;
    }
    public static void main(String args[]) throws IOException
    { String sentence="";

           File file=new File("new.txt");
           Scanner sc=new Scanner(file);
            while (sc.hasNext()) {
                
                String name = sc.next();
               sentence= sentence + name+" ";
            }
            StringTokenizer tokenizer = new StringTokenizer(sentence, " ");
int n = tokenizer.countTokens();
String[] a = new String[n];

for (int i = 0; i < n; i++) {
    a[i] = tokenizer.nextToken();
}

              //System.out.println(sentence);
              int k,max=0;String g="";
              yay ob= new yay();
              //String a[]=sentence.split(" ");
              for(int i=0;i<a.length;i++)
              {
                if(ob.palindrome(a[i]))
                {
               k=a[i].length();
               if(k>max)
               {
                 max=k;g=a[i];
               }
              }
            }
              System.out.println("The longest word is: "+g);
            sc.close();
        }
    }

