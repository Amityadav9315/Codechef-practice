import java.util.*;
import java.lang.*;
import java.io.*;

class MinimumCarRequired
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the no of test case");
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("entre the no of passengers");
            int n=sc.nextInt();
            int c=n/4;
            System.out.print("No of car =");
            if(n<4){
                System.out.println("1");
            }
            else if(n%4==0){
                System.out.println(c);
            }
            else{
                System.out.println(c+1);


            }
        }
        // your code goes here

    }
}
