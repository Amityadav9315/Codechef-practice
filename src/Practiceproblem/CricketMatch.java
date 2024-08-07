import java.util.*;
import java.lang.*;
import java.io.*;

class CricketMatch
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number");
            int n=sc.nextInt();
            int m=sc.nextInt();
            int c=6*6*m;
            if(c>=n){
                System.out.println("Yes");

            }
            else{
                System.out.println("No");
            }
        }
        // your code goes here

    }

