import java.util.*;

public class FloorDifferProblem {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int  x=sc.nextInt();
                int  y=sc.nextInt();
                int  c=x%10;
                int  d=y%10;
                if(c==0){
                    c=x/10;
                }
                else{
                    c=(x/10)+1;

                }
                if(d==0){
                    c=y/10;
                }
                else{
                    d=(y/10)+1;
                }
                if(c>d){
                    System.out.println(c-d);
                }
                else{
                    System.out.println(d-c);

                }
            }
            // your code goes here

        }
    }


