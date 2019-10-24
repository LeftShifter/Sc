package com.example.sc;


import android.provider.Settings;

import java.util.Scanner;

public class Cc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=Integer.parseInt(sc.nextLine());
        int[][] ar=new int [c][c];
        for (int i=0;i<ar.length;i++){
            String l=sc.nextLine();
            String[] tempar=l.split("\\s");
            for(int j=0;j<tempar.length;j++){
               ar[i][j]=Integer.parseInt(tempar[j]);
            }
        }
        int sum=0;
        for (int i=0;i < ar.length;i++){
            for(int j=0;j < ar[i].length;j++){
                sum+=ar[i][j];
            }
        }
        System.out.println(sum);
    }
}