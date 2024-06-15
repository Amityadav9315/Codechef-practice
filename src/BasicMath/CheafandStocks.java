import java.util.*;
public class CheafandStocks {
        public static void main (String[] args) throws java.lang.Exception {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0,min=0;
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(i==0){
                    min=arr[i];
                }
                if (min>arr[i]) {
                    min=arr[i];

                }
                sum = sum + arr[i];
            }
            System.out.println(sum-min);
            // your code goes here

        }
        }



