import java.util.*;

public class SpeedTestdevice {

        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                double a=sc.nextDouble();
                double x=sc.nextDouble();
                double b=sc.nextDouble();
                double y=sc.nextDouble();
                double d=a/x;
                double e=b/y;
                if(d==e){
                    System.out.println("EQUAL");
                }

                else if(d>e){
                    System.out.println("ALICE");

                }
                else{
                    System.out.println("BOB");
                }

            }
            // your code goes here

        }



