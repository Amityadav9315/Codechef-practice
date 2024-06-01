import java.util.*;

public class SelfDefencetraining {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int[]arr=new int[n];
                for(int i=0;i<n; i++){
                    arr[i]=sc.nextInt();

                }
                int count=0;
                for(int i=0; i<n; i++){
                    if(arr[i]>=10&&arr[i]<=60){
                        count++;
                    }
                }
                System.out.println(count);


            }
            // your code goes here

        }



