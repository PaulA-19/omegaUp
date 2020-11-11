package introduccion.C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a = n / m;
        int b = n % m;

        if (b != 0) {
            System.out.format("%d %d/%d\n", a, b, m);
        }else{
            System.out.println(a);
        }
    }
}
