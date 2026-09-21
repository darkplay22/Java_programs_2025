public class Frequency {
    public static void main( String args[])
    {
        int i;
        int arr[]={2,3,2,4,2};
        int fr[]=new int[43];
        for(i=0;i<arr.length;i++)
        fr[arr[i]]++;
        for(i=0;i<fr.length;i++)
        if(fr[i]>0)
        System.out.println(i+" : "+fr[i]);

/*int i,j,a,b,k=0;
for(i=0;i<arr.length;i++)
{
a=arr[i];
for(j=0;j<arr.length;j++)
{
    b=arr[j];
    if(a==b)
    k++;
}
System.out.println(a+" : "+k);
k=0;
}/* */
    }
    
}
