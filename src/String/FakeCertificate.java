package String;
import java.util.*;
public class FakeCertificate {

        public static void main(String[] args){

            Scanner sc=new Scanner(System.in);
            System.out.println();
                int n=sc.nextInt();
                int count=0;
                int count1=0;
                int[] arr=new int[n];
                for(int i=0; i<n; i++){
                    arr[i]=sc.nextInt();
                    if(arr[i]==0){
                        count++;
                    }
                    else{
                        count1++;
                    }
                }
                if(count>count1){
                    System.out.println(count);
                }
                else{
                    System.out.println(count1);
                }
            }
            // your code goes here

        }



