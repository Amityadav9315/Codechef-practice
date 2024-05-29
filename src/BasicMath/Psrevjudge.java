import java.util.*;
import java.lang.*;
import java.io.*;

class Psrevjudge
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []arr=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();

            }
            int count=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]>4){
                    count++;
                }
            }
            if(count==n){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        // your code goes here

    }
}
