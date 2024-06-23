import java.util.*;
public class Adjacentsumparity {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int sum=0;
                int[] b=new int[n];
                for(int i=0; i<n; i++){
                    b[i]=sc.nextInt();

                }
                for(int i=0; i<n-1; i++){
                    if(b[i]!=0){
                        sum=sum+b[i];
                    }
                }
                if(sum%2==0){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }





