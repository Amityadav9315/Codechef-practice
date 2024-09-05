import java.util.*;
import java.lang.*;
import java.io.*;

class CompressTheVideo
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int count=1;
            int[] arr=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();


            }
            for(int i=0; i<n-1; i++){
                if(arr[i]>0){
                    count++;
                }
                if(arr[i]==arr[i+1]){
                    count--;
                }
            }
            System.out.println(count);
            // your code goes here

        }
    }

