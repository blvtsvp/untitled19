package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in. nextInt();
        int[] a = new int[n];
        int k0 = 0; // нулевые
        int kp = 0; // положижительные
        int kn = 0; // отрицательные
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
            if(a[i] > 0) kp++;
            else if (a[i] < 0) kn++;
            else k0++;
        }
        System.out.println("Количество положительных чисел " + kp);
        System.out.println("Количество отрицательных чисел " + kn);
        System.out.println("Количество нулей " + k0);
    }
}
