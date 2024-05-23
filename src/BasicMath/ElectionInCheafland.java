import java.util.*;
import java.lang.*;
import java.io.*;

class ElectionInCheafland
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number of test case");
        int t=sc.nextInt();
        while(t-->0){
            int count =0;
            System.out.println("Enter the no of voter");
            int n=sc.nextInt();
            System.out.println("Enter the age which is eligible for vote");

            int x=sc.nextInt();
            System.out.println("Entre the voter age");
            int []arr=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0; i<arr.length; i++){
                if(arr[i]>=x){
                    count++;
                }

            }
            System.out.println("No of voter eligible="+count);
        }


    }
}
