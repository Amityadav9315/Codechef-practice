import java.util.*;
import java.lang.*;
import java.io.*;

class MeltGold
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            int c=0;
            int count=0;
            for(int i=1; i<100; i++){
                c=y+i;
                y=c;
                if(c>=x){
                    count=i;
                    break;
                }
    }
        System.out.println(count);

        }
        // your code goes here

    }

