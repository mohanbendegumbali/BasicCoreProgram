package com.bridgelabz.day5assignment;
import java.util.*;
public class Power {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a value for N: ");
            int N = scanner.nextInt();
            int i = 0;
            int power = 1;
            while (i <= N) {
                System.out.println("2^" + i + " = " + power);
                power = power * 2;
                i++;
            }
        }
}
