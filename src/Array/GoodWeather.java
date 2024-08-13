import java.sql.SQLOutput;
import java.util.*;
public class GoodWeather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int count1 = 0;
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count1++;
            }


        }
        if (count > count1) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
