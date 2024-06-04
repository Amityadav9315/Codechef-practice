import java.util.*;

public class AorB {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int x=sc.nextInt();
                int y=sc.nextInt();
                //a-b
                int a=((2*x)+((x+y)*4));
                //b-a
                int b=((4*y)+((x+y)*2));
                if(a==b){
                    System.out.println(1500-a);
                }
                else if(a<b){
                    System.out.println(1500-a);
                }
                else{
                    System.out.println(1500-b);
                }
                // your code goes here

            }
        }



