package String;

import java.util.*;
import java.lang.*;
import java.io.*;

class Groupassignment
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();
            int[] arr=new int [n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();

            }
            int count1=0;
            for(int i=0;i<n;i++){
                int count=0;
                for(int j=0;j<n;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                if(count%arr[i]!=0){
                    System.out.println("NO");
                    count1=1;
                    break;
                }
            }
            if(count1==0){
                System.out.println("YES");
            }


        }

    }

