import java.util.*;
import java.lang.*;
import java.io.*;

class BearandCandies123
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=0,d=0;
            for(int i=1; i<=a; i++){
                if(i%2!=0&&c<a){
                    c=c+i;
                    if(c>a){
                        c=c-i;
                    }
                }
            }
            for(int i=1; i<=b; i++){
                if(i%2==0&&d<b){

                    d=d+i;
                    if(d>b){
                        d=d-i;
                    }
                }

            }
            if(c<=a&&c>d){
                System.out.println("Limak");
            }
            else{
                System.out.println("Bob");
            }
            // your code goes here

        }
    }
}

