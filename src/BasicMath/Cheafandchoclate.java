import java.util.Scanner;

public class Cheafandchoclate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of test case");
        int t = scanner.nextInt();

        while (t-- > 0) {
             System.out.println("Enter the value of x,y,z");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            System.out.println(((x*5)+(y*10))/z);
            // Your code goes here
        }
    }
}
