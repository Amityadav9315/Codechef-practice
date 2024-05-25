import java.util.*;
import java.lang.*;
import java.io.*;

class TestScore
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test case");
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("Enter the number of problem");
            int n=sc.nextInt();
            System.out.println("Max score for each problem");
            int x=sc.nextInt();
            System.out.println("Total score");
            int y=sc.nextInt();
            if(y%x==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        // your code goes here

    }
}
