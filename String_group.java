import java.util.*;
class String_group
{
    public static int getid(char ch)
    {
        return ch-'a';
    }
    static boolean ana(String a,String b)
    {
        //System.out.println(a+" "+b);
        int i,j;
         boolean k=true;
        char arr[]=a.toCharArray();
        int fr[]=new int[26];
        for(i=0;i<arr.length;i++)
        fr[getid(arr[i])]++;

        char arr2[]=b.toCharArray();
        int fr2[]=new int[26];
        for(i=0;i<arr.length;i++)
        fr2[getid(arr[i])]++;

    /*for(i=0;i<26;i++)
    {
        for(j=0;j<26;j++)
        {
            if(fr[i]==fr2[i])
            k=true;
            else
            k=false;
            
        }
    }*/
    if(fr.length!=fr2.length)
    return false;
    for(i=0;i<fr.length;i++)
    {
    if(fr[i]<=fr2[i])
    {
        return false;
    }
    }
    return true;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of words to be input");
        int p,i,j;
        String s="";
        boolean anagram;
        p=sc.nextInt();
        System.out.println("Enter an array of strings");
        String ar[]= new String[p];
        for(i=0;i<p;i++)
        {
          ar[i]=sc.next();
        }
        for(i=0;i<p;i++)
        {    
            s=ar[i];
            for(j=i+1;j<p;j++)
            {
          anagram= ana(ar[i],ar[j]);
          if(anagram==true)
          s= s+" "+ ar[j]+"  ";
            }
            System.out.print(s);
            System.out.println();
        }

    }
}