package Lab02.CSE110_LAB08;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double E, I, R, L, C, f;
        E = sc.nextDouble();
        R = sc.nextDouble();
        L = sc.nextDouble();
        C = sc.nextDouble();
        f = sc.nextDouble();
        
        I = E / Math.sqrt(R*R + Math.pow((2 * Math.PI * f * L - 1/2 * Math.PI* f * C), 2));
        System.out.println(I);
    }
}
