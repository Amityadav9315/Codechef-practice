import java.util.*;
import java.lang.*;
import java.io.*;

class BlackJack
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
       // System.out.println("Entre the number of test case");
      //  int t=sc.nextInt();
      //  while(t-->0){
            System.out.println("Entre the value of A");
            int a=sc.nextInt();
            System.out.println("Enter the value of B");
            int b=sc.nextInt();
            int c=21-(a+b);
            if(c>=1&&c<=10){
                System.out.println(c);
            }
            else{
                System.out.println("-1");
            }
        }

        // your code goes here

    }

