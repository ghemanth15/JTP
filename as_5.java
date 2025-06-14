import java.io.IOException;
import java.util.Scanner;
// WAP to swap four numbers using temp variable
public class as_5 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("WAP to swap four numbers using temp variable");
        System.out.println("Enter values for a, b, c and d");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Initial Values : a = "+a+", b = "+b+", c = "+c+" and d = "+d);
        int temp = 0;
        temp = a;
        a = b;
        b = c;
        c = d;
        d = temp;
        System.out.println("After swapping : a = "+a+", b = "+b+", c = "+c+" and d = "+d);
    }
}
