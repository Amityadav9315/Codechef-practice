import java.util.*;
import java.lang.*;
import java.io.*;

class NiveClass
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            float d=0;
            float e=0;
            int[] arr=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                if(arr[i]==a){
                    d++;
                }
                if(arr[i]==b){
                    e++;
                }





            }
            float s=(d/n)*(e/n);
            System.out.println(s);
        }



    }
    // your code goes here

}

