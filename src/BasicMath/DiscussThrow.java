import java.util.*;
import java.lang.*;
import java.io.*;

class DiscussThrow
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of test case);
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("Enter the value of a");
            int a=sc.nextInt();
            System.out.println("Entre the value of b");
            int b=sc.nextInt();
            System.out.println("Enter the value of b");
            int c=sc.nextInt();
            if(a>b&&a>c){
                System.out.println(a);
            }
            else if(b>a&&b>c){
                System.out.println(b);
            }
            else if(a==b&&b==c&&a==c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
            //  System.out.println("Runtime Error: " + e.getMessage());

        }
        // your code goes here

    }
}

