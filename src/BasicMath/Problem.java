import java.util.*;
public class Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n-1==m+1||m-1==n+3){
            System.out.println("Yes");
        }
        else if(n==m){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
