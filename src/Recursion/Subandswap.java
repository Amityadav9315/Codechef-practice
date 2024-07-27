import java.util.*;
import java.lang.*;
import java.io.*;

class SubandSwap
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
            int  x=sc.nextInt();
            int y=sc.nextInt();
            int temp=0;
            if(x>y){
                temp=x;
                x=y;
                y=temp;
                int X=100;
                while(X!=0){
                    X=y-x;
                    y=x;
                }
                System.out.println(y);

            }

            else{
                int   X=y-x;
                y=x;
                x=X;
                while(x>y) {
                    temp = x;
                    x = y;
                    y = temp;
                    while (X != 0 && y > x) {
                        X = y - x;
                        y = x;
                        x = X;
                    }
                }
                    System.out.println(y);
                }

            }

        }

        // your code goes here




