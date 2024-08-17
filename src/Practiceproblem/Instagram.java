import java.util.*;
import java.lang.*;
import java.io.*;

class    Instagram
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number");
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int c=x*10;
            if(c>10){
                System.out.println("Yes");

            }
            else{
                System.out.println("N0");
            }
        }
        // your code goes here

    }
}
