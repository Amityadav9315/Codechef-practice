import java.util.*;
import java.lang.*;
import java.io.*;

class ThelastLevel
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test case");

        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int c=x/3;
            if(x<=3){
                System.out.println(x*y);
            }
            else if(x%3==0){
                System.out.println((x*y)+(z*(c-1)));
            }
            else {
                System.out.println((x*y)+(z*c));
            }
        }

        // your code goes here

    }
}
