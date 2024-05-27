import java.util.*;
import java.lang.*;
import java.io.*;

class FairShareSettlement
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int c=n/k+1;


            if(n>k){
                System.out.println( n-k*c);
            }
            else{
                System.out.println(n);
            }
        }
        // your code goes here


        // your code goes here

    }
}
