
import java.util.*;

class Second_Min_Second_Max
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++)
        {
            // Odd index → second minimum
            if (i % 2 != 0)
            {
                if (a[i] < min1)
                {
                    min2 = min1;
                    min1 = a[i];
                }
                else if (a[i] < min2 && a[i] != min1)
                {
                    min2 = a[i];
                }
            }

            // Even index → second maximum
            else
            {
                if (a[i] > max1)
                {
                    max2 = max1;
                    max1 = a[i];
                }
                else if (a[i] > max2 && a[i] != max1)
                {
                    max2 = a[i];
                }
            }
        }

        System.out.println("Second Minimum at odd index = " + min2);
        System.out.println("Second Maximum at even index = " + max2);
    }
}







