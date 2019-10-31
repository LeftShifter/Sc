package com.example.sc;

import java.util.Scanner;

public class Pi4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 21;
        while (n > 20) {
            System.out.println("Введите число(меньше 20):");
            n = scanner.nextInt();
            scanner.nextLine();
        }
        String pi = Math.PI+"";
        for (int index = 0; index < n; index++) {
            System.out.println(pi.substring(0,index+1).replace(".",""));
        }
    }
}