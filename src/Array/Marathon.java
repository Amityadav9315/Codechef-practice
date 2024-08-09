import java.util.*;
import java.lang.*;
import java.io.*;

class Marathon
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number");
            int D=sc.nextInt();
            int d=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            int maxdist=D*d;
            if(maxdist<10){
                System.out.println("0");
            }
            else if(maxdist>=10&&maxdist<21){
                System.out.println("1");
            }
            else if(maxdist>=21&&maxdist<42){
                System.out.println("2");
            }
            else if(maxdist>=42){
                System.out.println("3");
            }
            // your code goes here

        }
    }

