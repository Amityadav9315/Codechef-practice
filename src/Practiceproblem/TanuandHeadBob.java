import java.util.*;
import java.lang.*;
import java.io.*;

class TanuandHeadBob
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str=sc.next();


            if(str.contains("I")){
                System.out.println("INDIAN");
            }
            else if(str.contains("Y")){
                System.out.println("NOT INDIAN");
            }
            else{
                System.out.println("NOT SURE");
            }
        }

        // your code goes here

    }
}

