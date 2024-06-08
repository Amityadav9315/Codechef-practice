import java.util.*;
public class Avoidcontact {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int x=sc.nextInt();
                int y=sc.nextInt();
                try{

                    if(y==0){
                        System.out.println(x);
                    }
                    else{
                        int  c=(2*x);
                        int d=c/y;
                        System.out.println(x+d);
                    }
                    // System.out.println(x+d);
                }
                catch(Exception e){
                    System.out.println("something went wrong");
                }


            }


        }

        // your code goes here





