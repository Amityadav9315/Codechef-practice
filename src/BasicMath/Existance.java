import java.util.*;
public class Existance {

        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                long x=sc.nextLong();
                long y=sc.nextLong();
                long a=(x*x*x*x)+(4*(y*y));
                long b=(4*x*x*y);
                // if((x*x*x*x)+(4*(y*y))==(4*x*x*y)){
                if(a==b){
                    System.out.println("Yes");

                }
                else{
                    System.out.println("No");
                }
                // your code goes here

            }
        }



