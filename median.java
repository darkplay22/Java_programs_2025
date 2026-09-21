class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int a,b,i,j,t=0,m,n,d;
        m=nums1.length;
        n=nums2.length;
        int c[]=new int[m+n];
          for(i=0;i<m+n-1;i++)
          {
            for(j=0;j<(m+n-1)-i;j++)
            {
                if (c[j]<c[j+1])
                {
                    t=c[j];
                    c[j]=c[j+1];
                    c[j+1]=t;
                }
            }
          }
        for(i=0;i<m;i++)
        {
            c[i]=nums1[i];
        }
        for(i=0;i<n;i++)
        {
            c[m-1+i]=nums2[i];
        }
        d=c.length/2;
        if(d%2==0)
            System.out.println((c[d]+c[d-1])/2);
        
        else
            System.out.println(c[d]);
    }
}