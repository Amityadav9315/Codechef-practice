import java.util.*;
import java.lang.*;
import java.io.*;

class Rule5050
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number of test case");
        int t=sc.nextInt();
        for(int i=1; i<=t; i++){
            System.out.println("Entre the per of attendence");
            int x=sc.nextInt();
            System.out.println("Enter the per of mark");
            int  y=sc.nextInt();
            if(x<50){
                System.out.println("Z");
            }
            else if(y<50&&x>=50){
                System.out.println("F");
            }
            else{
                System.out.println("A");
            }
        }
        // your code goes here

    }
}
