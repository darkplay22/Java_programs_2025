import java.util.*;
class Tokenizer_sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str;
        str=sc.nextLine();
        StringTokenizer st= new StringTokenizer(str,",");
        int c= st.countTokens();
        for(int i=1;i<=c;i++)
        {
            String wd= st.nextToken();
            System.out.println(wd+"\t"+wd.length());
        }
    }
}