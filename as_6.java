import java.io.IOException;
import java.util.Scanner;
// WAP to swap four numbers without using temp variable
public class as_6 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("WAP to swap four numbers without using temp variable");
        System.out.println("Enter values for a, b, c and d");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Initial Values : a = "+a+", b = "+b+", c = "+c+" and d = "+d);
        a = a+b+c+d;
        b = a-b-c-d;
        c = a-b-c-d;
        d = a-b-c-d;
        a = a-b-c-d;
        System.out.println("After swapping : a = "+a+", b = "+b+", c = "+c+" and d = "+d);
    }
}
