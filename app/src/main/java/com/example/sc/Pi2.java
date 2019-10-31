package com.example.sc;

import java.util.Scanner;

public class Pi2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = 21;
        while (n>20) {
            System.out.println("Введите число(меньше двадцати):");
            n = scanner.nextInt();
            scanner.nextLine();
        }
        double mpi=Math.PI;
        int[] pi = new int[n];
        for(int index= 0;index<pi.length;index++){
            int ipi = (int) mpi;
            System.out.println(ipi);
            mpi =mpi*10;
        }
    }
}
