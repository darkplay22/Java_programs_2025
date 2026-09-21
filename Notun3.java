public class Notun3 {
    public int fact(int n,int i,int f)
    {
    
      if (i>n)
      {
      return f;
      }
      else
      {
     f=f*i;
     return fact(n,i+1,f);
      }
      
    }
    public static void main(String args[])
    {
         int r=1,h,f=1;
        int ar[]= { 5,6,3};
        Notun3 ob=new Notun3();
        for(int i=0;i<3;i++)
        {
         h=ob.fact(ar[i],1,f);
         System.out.println(h);
        }
    }
    
}
