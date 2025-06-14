import java.io.IOException;
import java.util.*;

// WAP to swap three numbers using temp variable
public class as_3 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("WAP to swap three numbers using temp variable");
        System.out.println("Enter values for a, b and c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Initial Values : a = "+a+", b = "+b+" and c = "+c);
        int temp = 0;
        temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println("After Swapping : a = "+a+", b = "+b+" and c = "+c);
    }
}
