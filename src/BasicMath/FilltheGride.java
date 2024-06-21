import java.util.*;
public class FilltheGride {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int m=sc.nextInt();
                int  d=((n%2)*m+(m%2)*n)-1;
                int  e=((n%2)*m+(m%2)*n);
                if(n%2==0&&m%2==0){
                    System.out.println("0");
                }
                else if(n%2!=0&&m%2!=0){

                    System.out.println(d);
                }
                else{
                    if(n%2==0||m%2==0){
                        System.out.println(e);
                    }
                }

            }
        }
        // your code goes here


