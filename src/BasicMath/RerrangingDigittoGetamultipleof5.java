import java.util.*;
public class RerrangingDigittoGetamultipleof5 {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int count=0;
                int n=sc.nextInt();
                int[] arr=new  int[n];
                for(int i=0; i<n; i++) {
                    arr[i] = sc.nextInt();
                }
                for(int i=0; i<n; i++){
                    if(arr[i]==0||arr[i]==5){
                        count++;
                    }
                }
                if(count>=1){
                    System.out.println("Yes");

                }
                else{
                    System.out.println("No");
                }


            }
            // your code goes here

        }




