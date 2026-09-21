import java.util.*;
class Caesar_Cipher
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String s,s2="";;
        char ch,c;
        s=sc.nextLine();
      
        int i,j,p;
        p=s.length();
        for(i=0;i<p;i++)
        {
        c=s.charAt(i);
        if(Character.isLetter(c)==true)
        {
         
            if(((int)c>=65 && (int)c<=77)||(((int)c<=109 && (int)c>=97)))
           {
             c=(char)((int)c+13);
            s2=s2+c;
        }
        else
           {
             c=(char)((int)c-13);
        s2=s2+c;
    }
}
else
    s2=s2+c;
        }
        System.out.println("The cipher text is : \n"+s2);
        }
    }
