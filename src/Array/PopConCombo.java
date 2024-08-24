import java.util.*;
import java.lang.*;
import java.io.*;

class PopConCombo
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the numbre");
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int b1=sc.nextInt();
            int b2=sc.nextInt();
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            int d=a1+a2;
            int e=b1+b2;
            int f=c1+c2;
            int max=0;
            if(d>e&&d>f){
                max=d;
            }
            else if(e>d&&e>f){
                max=e;
            }
            else{
                max=f;
            }
            System.out.println(max);
        }
        // your code goes here

    }

