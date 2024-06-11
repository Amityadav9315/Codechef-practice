import java.util.*;
public class TwoRange {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int d=sc.nextInt();
                int max=Math.max(Math.max(a, b), Math.max(c, d));
                int min=Math.min(Math.min(a, b), Math.min(c, d));
                int count=0;
                while(min<=max){
                    if(a<=b){
                        count++;
                        a++;
                    }
                    else if(c<=d){
                        count++;
                        c++;
                    }
                    min++;

                }

                System.out.println(count);
            }
            // your code goes here
        }



