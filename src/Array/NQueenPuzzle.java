import java.util.*;
import java.lang.*;
import java.io.*;

class NQueenPuzzle
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int d=0;
        int count=0;


            int n=sc.nextInt();
                double c=(0.143*n);
              double l=  Math.pow(c,n);




            d=(int) l;
            double k=l-d;
            if(k<0.5){
                System.out.println(d);
            }
            else {
                System.out.println(d + 1);
            }

        }
        // your code goes here

    }

