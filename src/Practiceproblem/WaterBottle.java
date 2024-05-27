import java.util.*;
import java.lang.*;
import java.io.*;

class WaterBottle
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int k=sc.nextInt();
            if(k<x){
                System.out.println("0");
            }
            else if(k>x&&n*x>k){
                System.out.println(k/x);
            }
            else{
                System.out.println(n);
            }
        }
        // your code goes here

    }
}
