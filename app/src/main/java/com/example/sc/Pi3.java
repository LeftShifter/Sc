package com.example.sc;

import java.util.Scanner;

public class Pi3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 21;
        while (n > 20) {
            System.out.println("Введите число(меньше 20):");
            n = scanner.nextInt();
            scanner.nextLine();
        }
        double pi = Math.PI;
        int[] pil = new int[n];
        System.out.println(pi);
        for(int index= 0;index<pil.length;index++){
            pil[index]=(int)pi;
            pi=(pi%pil[index])*10;
            for(int i= 0;i<index+1;i++){
                System.out.print(pil[i]);
            }
            System.out.println();
        }
    }
}
