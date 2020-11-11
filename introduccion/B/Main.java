package introduccion.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int f = sc.nextInt();
        int asientos = r * f;
        int b = sc.nextInt();
        if (asientos <= b) {
            System.out.println(asientos + " " + (b - asientos));
        }else{
            System.out.println(b + " " + 0);
        }
    
    }
}
