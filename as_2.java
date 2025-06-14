import java.io.IOException;
import java.util.*;

// WAP to swap two numbers without using temp variable
public class as_2 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("WAP to swap two numbers without using temp variable");
        System.out.println("Enter values for a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Initial Values : a = "+a+", b = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping : a = "+a+", b = "+b);
    }
}
