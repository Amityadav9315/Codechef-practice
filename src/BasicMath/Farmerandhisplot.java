import java.util.*;
public class Farmerandhisplot {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner n=new Scanner(System.in);
            int t=n.nextInt();
            while(t-->0){
                int a=n.nextInt();
                int  b=n.nextInt();
                for(int i=a;i>0;i--){
                    if(a%i==0&&b%i==0){
                        System.out.println((a/i)*(b/i));
                        break;}
                }
            }

        }
    }


