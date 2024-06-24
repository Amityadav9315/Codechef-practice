import java.util.*;
public class Solubility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+(100-x)*b;
        int d=c*10;
        System.out.println(d);
    }
}
