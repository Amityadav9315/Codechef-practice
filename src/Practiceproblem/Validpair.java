import java.util.*;
import java.lang.*;
import java.io.*;

class Validpair

{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b||b==c||c==a){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        // your code goes here

    }
}
