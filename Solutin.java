class Solutin
{
    public boolean isAnagram(String s, String t)
    {
        int p,q,i,j,c=0,k=0;
        char ch,ch2,ch3;
        p=s.length();
        if(p==t.length())
        {
            for(i=0;i<p;i++)
            {
                ch=s.charAt(i);
                for(j=0;j<p;j++)
                {   
                    ch3=s.charAt(j);
                    if(ch3==ch)
                     c++; 
                    ch2=t.charAt(j);
                    if(ch==ch2)
                    k++;

                }
                if(c!=k)
                return false;
            }
            return true;
        }
        else return false;
        
    }
}