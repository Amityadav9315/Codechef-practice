import java.util.*;

class Parliament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the test case");
        int t = sc.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            System.out.println("Enter the total no of candidate");
            int n = sc.nextInt();
            System.out.println("Enter the candidate who vote in favor");
            int x = sc.nextInt();

            float c = (float) n/2;
            if (c<= x) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
