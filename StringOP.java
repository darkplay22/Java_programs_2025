import java.util.*;
class StringOP
{
    String str;
    String msk;
    String nstr;
    StringOP()
    {
      str="";
      msk="";
      nstr="";
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the original string: ");
        str=sc.nextLine();
        System.out.println("Enter the mask string: ");
        msk=sc.nextLine();
    }
    void form()
    {
        char ch,ch2;
        int i,j,p,p2;
        String s= str;
        p=str.length();
        p2=msk.length();
        for(i=0;i<p2;i++)
        {
            nstr="";
            ch2=msk.charAt(i);
            for(j=0;j<s.length();j++)
            {
                ch=s.charAt(j);
                if(ch==ch2)
                    continue;
                else
                    nstr=nstr+ch;
            }
            s=nstr;
            
        }
        
    }
    void display()
    {
        System.out.println("The original string : "+str);
        System.out.println("The newly formed string : "+nstr);
    }
    public static void main(String args[])
    {
        StringOP ob = new StringOP();
        ob.accept();
        ob.form();
        ob.display();
    }
}