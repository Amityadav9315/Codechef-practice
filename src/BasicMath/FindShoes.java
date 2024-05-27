import java.util.*;
import java.lang.*;
import java.io.*;

class FindShoes
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number of test case");
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("Entre the number of person");
            int n=sc.nextInt();
            System.out.println("Entre the number of left shoes");
            int m=sc.nextInt();
            if(m>n){
                System.out.println(n);
            }
            else{
                int c=2*n-m;
                System.out.println(c);

            }
        }
        // your code goes here

    }
}
