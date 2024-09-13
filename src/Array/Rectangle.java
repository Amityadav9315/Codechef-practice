import java.util.*;
import java.lang.*;
import java.io.*;

class Rectangle
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int e=a+b+c+d;
            int p=2*(a+b);
            int r=2*(a+c);
            if(e==p||e==r){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }
        // your code goes here

    }
}
