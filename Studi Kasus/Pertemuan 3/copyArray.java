import java.util.*;

public class copyArray {
    public static void main(String[] args) {
        int a[] = new int[] { 10, 11, 12 };

        int b[] = Arrays.copyOf(a, a.length);
        b[0] = 100;
        a[1] = 7;

        for (int x = 0; x < a.length; x++) {
            System.out.print("a : " + a[x] + " | ");
            System.out.print("b : " + b[x] + " | ");
        }
    }
}