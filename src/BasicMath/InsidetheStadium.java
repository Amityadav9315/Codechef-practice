import java.util.*;
import java.lang.*;
import java.io.*;

class InsidetheStadium
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int  t=sc.nextInt();
        while(t-->0){
            double run=0;
            int count=0;
            double ball=0;
            int n=sc.nextInt();

            int[] a=new int[n];
            for(int i=0; i<n; i++){
                a[i]=sc.nextInt();
            }

            for(int i=0; i<a.length; i++){

                run=run+a[i];
                ball+=1;
                double d=(run/ball)*100;
                if(d==100){
                    count++;

                }
            }
            System.out.println(count);






        }
        // your code goes here

    }
}
