public class Notun4 {
    public int sum(int[] a,int s,int i)
    {
    
      if (i>a.length-1)
      return s;
      else
       {
        s=s+a[i];
       }
      return sum(a,s,i++);
    
    
      }
    
    public static void main(String args[])
    {
         int r=0,sum=0,s=0;
        int ar[]= { 12,54,67};
        Notun4 ob=new Notun4();
        int s1=ob.sum(ar,s,r);
        System.out.println(s1);
    }
    
}

    

