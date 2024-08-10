import java.util.*;
import java.lang.*;
import java.io.*;

class MessivsRonaldo
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int c=a*2+b;
        int f=x*2+y;
        if(c>f){
            System.out.println("Messi");
        }
        else if(c==f){
            System.out.println("Equal");
        }
        else{
            System.out.println("Ronaldo");
        }
        // your code goes here

    }
}
