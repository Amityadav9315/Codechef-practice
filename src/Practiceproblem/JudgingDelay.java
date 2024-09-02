import java.util.*;
import java.lang.*;
import java.io.*;

class JudgingDelay
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int count=0;
            for(int i=0; i<n; i++){
                int s=sc.nextInt();
                int j=sc.nextInt();
                if(j-s>5){
                    count++;
                }

            }
            System.out.println(count);

            // your code goes here

        }
    }
}
