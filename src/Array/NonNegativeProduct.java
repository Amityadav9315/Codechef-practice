import java.util.*;
import java.lang.*;
import java.io.*;

class NonNegativeProduct
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number");
            int n=sc.nextInt();

            int[] arr=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();

            }
            int count=arr[0];
            for(int i=0; i<arr.length-1; i++){
                int c=count*arr[i+1];
                count=c;
            }
            if(count>=0){
                System.out.println("0");

            }
            else{
                System.out.println("1");
            }
        }
        // your code goes here

    }

