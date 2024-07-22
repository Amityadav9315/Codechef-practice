import java.util.*;
import java.lang.*;
import java.io.*;

class CheafandCookoff
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
            int[] arr =new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                if(arr[i]==1){
                    count++;
                }

            }
            if(count==0){
                System.out.println("begineer");

            }
            else if(count==1){
                System.out.println("junior developer");
            }
            else if(count==2){
                System.out.println("middle developer");
            }
            else if(count==3){
                System.out.println("senior developer");

            }
            else if(count==4){
                System.out.println("hacker");

            }
            else{
                System.out.println("Jeff Dean");
            }
        }
    }


