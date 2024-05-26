import java.util.*;
import java.lang.*;
import java.io.*;

class BathinWinter
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entert he no of test case");
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("Enter the value of x");
            int x=sc.nextInt();
            System.out.println("Entre the value of y");
            int y=sc.nextInt();

            int c=x/(2*y);
            System.out.println("Number of person bath="+c);
            //System.out.println(c);
        }
        // your code goes here

    }
}
