import java.util.Arrays;
import java.util.Scanner;

public class recorded_power_of_two {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        recorded_power_of_two obj = new recorded_power_of_two();
        System.out.println(obj.reorderedPowerOf2(n));
    }

    public int[] count(int n) {
        int[] ans = new int[10];
        while (n > 0) {
            ans[n % 10]++;
            n = n / 10;
        }
        return ans;
    }

    public boolean reorderedPowerOf2(int n) {
        int power = 1;
        int a[] = count(n);
        for (int i = 0; i < 31; i++) {
            if (Arrays.equals(a, count(power)))
                return true;
            power *= 2;

        }
        return false;
    }
}
