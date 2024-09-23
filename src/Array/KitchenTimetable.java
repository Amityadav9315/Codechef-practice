/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class KitchenTimetable
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n=sc.nextInt();
            int[] a=new int[n+1];
            int[] b=new int[n+1];
            for(int i=1;i<n+1;i++)
                a[i]=sc.nextInt();
            for(int i=1;i<n+1;i++)
                b[i]=sc.nextInt();
            int count=0;
            for(int i=1;i<n+1;i++){
                if(a[i]-a[i-1]>=b[i])
                    count++;

            }
            System.out.println(count);

            t--;

        }
    }
}
