public class Notun2 {
    public int fact(int n,int r)
    {
      if (r>n)
      {
      return 1;
      }
      else if(n%r==0)
      System.out.print(r+" ");
      return fact(n,r+1);
        
      
    }
    public static void main(String args[])
    {
         int r=1;
        int ar[]= { 12,54,67};
        Notun2 ob=new Notun2();
        for(int i=0;i<5;i++)
        {
         ob.fact(ar[i],r);
         
        }
    }
    
}
