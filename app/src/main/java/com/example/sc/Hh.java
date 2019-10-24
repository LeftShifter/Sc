package com.example.sc;



public class Hh {
    public static void main(String[] args) {
        String[] array = {"ffff", "ff", "ffffff", "fffffffffff", "f", "fffffffffffffffffffffff"};
        String max = array[0];
        for (String v : array) {
            if (v.length() > max.length()) {
                max = v;
            }
        }
        System.out.println(max);
    }
}
