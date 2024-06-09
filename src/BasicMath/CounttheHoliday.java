import java.util.*;
public class CounttheHoliday {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);

                int n=sc.nextInt();
                int[] arr=new int[n];
                int count=8;
                for(int i=0; i<n; i++){
                    arr[i]=sc.nextInt();
                    if(arr[i]==6||arr[i]==7||arr[i]==13||arr[i]==14||arr[i]==20||arr[i]==21||arr[i]==27||arr[i]==28){

                    }
                    else{
                        count++;

                    }
                }
                System.out.println(count);
            }

            // your code goes here

        }


