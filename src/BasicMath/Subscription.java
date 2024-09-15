import java.util.*;
import java.lang.*;
import java.io.*;

class Subscription
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int x=sc.nextInt();
            int d=n/6;
            int e=n%6;
            if(e>0){
                System.out.println((d+1)*x);
            }
            else{
                System.out.println(d*x);


            }
        }
        // your code goes here

    }

