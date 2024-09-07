import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        char c=sc.next().charAt(0);
        switch(c){
            case'+':
                System.out.println(a+b);
                break;
            case'-':
                System.out.println(a-b);
                break;
            case'*':
                System.out.println(a*b);
                break;
            case'/':
                if(b!=0)
                System.out.println(a/b);
                break;
        }

    }
}