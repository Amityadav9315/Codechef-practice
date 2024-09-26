package String;
import java.util.*;

public class AccessControl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int c=0;
        int d=0;
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        if(arr[0]==0) {
            d=1;
        }

        for(int i=0; i<n; i++){

             if(arr[i]==1){
                 c=1*x;

                }

            else{
                c=c-1;
            }

        }
        if(d==1){
            System.out.println("No");
        }
        else if(c>=0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }



    }
}
