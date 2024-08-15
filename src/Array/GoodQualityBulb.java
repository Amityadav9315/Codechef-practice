import java.util.*;
import java.lang.*;
import java.io.*;

class GoodQualityBulb
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int  t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int sum=0;
            int[] arr=new int[n];
            for(int i=0; i<n-1; i++){
                arr[i]=sc.nextInt();
                int y=arr[i]+sum;
                sum=y;
            }
        }
        // your code goes here

    }
}
