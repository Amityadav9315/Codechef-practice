import java.util.*;
import java.lang.*;
import java.io.*;

class CheafandTabletennis
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        System.out.println("Entre the number");

        while(t-->0){
            int count=0,count1=0;
            String str=sc.next();
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)=='1'){
                    count++;
                }
                else{
                    count1++;
                }
            }
            if(count>count1){
                System.out.println("WIN");
            }
            else{
                System.out.println("LOSE");

            }

            // your code goes here

        }
    }
}
