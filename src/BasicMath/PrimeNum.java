import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the no of test case");

        int t=sc.nextInt();

        while(t-->0){
            int count=0;
            System.out.println("Enter the value of a");
            int a=sc.nextInt();
            System.out.println("Enter the value of b");
            int b=sc.nextInt();
            int c=a+b;
            for(int i=2; i<c; i++){
                if(c%i==0){
                    System.out.println("Not prime no");
                    count=1;
                    break;
                }
            }
            if(count==0){
                System.out.println("Prime no");
            }

        }
        // your code goes here

    }
}
