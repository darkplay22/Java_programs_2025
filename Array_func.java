public class Array_func 
{
    public static int[] sort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        return (a);
    }
    public static void main(String[] args) 
    {
       int a[]={12,6,3,70,5};
       int arr[]=sort(a);
       for(int i=0;i<arr.length;i++)
       System.out.print(arr[i]+" ");
    }
    
}
