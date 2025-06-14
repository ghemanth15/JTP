import java.io.IOException;
import java.util.Scanner;
// WAP to swap three numbers without using temp variable
public class as_4 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("WAP to swap three numbers without using temp variable");
        System.out.println("Enter values for a, b and c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Initial Values : a = "+a+", b = "+b+" and c = "+c);
        a = a+b+c;
        b = a-b-c;
        c = a-b-c;
        a = a-b-c;
        System.out.println("After Swapping : a = "+a+", b = "+b+" and c = "+c);
    }
}
