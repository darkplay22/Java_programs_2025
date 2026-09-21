public class Notun {
    public String DeciToBin(int n,String r)
    {
      if (n==0)
      return r;
      else
      {
        r=Integer.toString(n%2)+r;
        return DeciToBin(n/2,r);
      }
    }
    public static void main(String args[])
    {
        String g; String r="";
        int ar[]= { 12,54,67,33,24};
        Notun ob=new Notun();
        for(int i=0;i<5;i++)
        {
         g= ob.DeciToBin(ar[i],r);
         System.out.println(g);
        }
    }
    
}
