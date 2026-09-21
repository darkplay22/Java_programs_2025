import java.util.*;
class split_sample
{
    public static void main(String args[])
    {
        String s="This is,a cat.";
        String ar[]=s.split("[ ,.]");
        for(int i= 0;i<ar.length;i++)
            System.out.println(ar[i]);
    }
}