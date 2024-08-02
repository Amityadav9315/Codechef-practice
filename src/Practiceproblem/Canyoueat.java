import java.util.*;
import java.lang.*;
import java.io.*;

class Canyoueat
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
            int n=sc.nextInt();
            int k=sc.nextInt();
            int d=n%k;
            int e=n/k;
            if(n==0){
                System.out.println("0");
            }
            else if(d==0){
                System.out.println(e);
            }
            else{
                System.out.println("-1");
            }
        }
        // your code goes here

    }

