import java.util.*;
import java.lang.*;
import java.io.*;

class FillCandies
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Entre the number of test case");
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("Entre the number of candies");
            int n=sc.nextInt();
            System.out.println("No of pocket in bag");
            int k=sc.nextInt();
            System.out.println("No of candy carry each pocket of bag");
            int m=sc.nextInt();
            int c=k*m;
            if(n%c==0){
                System.out.println(n/c);
            }
            else{
                System.out.println((n/c)+1);
            }
        }
        // your code goes here

    }
}
