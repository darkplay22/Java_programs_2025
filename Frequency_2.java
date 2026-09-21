public class Frequency_2 {
    public static int getid(char ch)
    {
        return ch-'a';
    }
    public static void main( String args[])
    {
        int i;
        String st="aabcbacgfjhtipylotkujyhtg";
        char arr[]=st.toCharArray();
        int fr[]=new int[26];
        for(i=0;i<arr.length;i++)
        fr[getid(arr[i])]++;
        for(i=0;i<fr.length;i++)
        if(fr[i]>0)
        System.out.println((char)(i+65)+" : "+fr[i]);
    
}}
