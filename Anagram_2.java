public class Anagram_2 {
     public static int getid(char ch)
    {
        return ch-'a';
    }
    public static int[] fre( String st)
    {
        int i;
        char arr[]=st.toCharArray();
        int fr[]=new int[26];
        for(i=0;i<arr.length;i++)
        fr[getid(arr[i])]++;
    return fr;
    }
    public static void main(String args[])
    {  
         int k=0;
        System.out.println("Enter two words:");
        String a="geeks",b="kseeg";
    int y[]=fre(a);
    int z[]=fre(b);
    for(int i=0;i<y.length;i++)
    {
        if(y[i]==z[i])
        k=1;
        else k=0;
        if(k==0)
        break;
    }
if(k==1)
    System.out.println("Both are anagrams!");
    else
    System.out.println("They are not anagrams!");
 }
}

