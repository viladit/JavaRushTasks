package com.javarush.task.pro.task05.task0524;

/* 
Взлом Кибердракона
*/

public class Solution {
    public static int[] coordinates;

    public static void main(String[] args) {
        coordinates = new int[200];
        int q = 0;
        for (int i = 0; i < 100; i++){
            for (int j = 0; j <2; j++) {
                coordinates[q] = i * 10 + j;
                q += 1;
            }
        }
        for (int i = 0; i < 200; i++) {
            System.out.print(coordinates[i] + ",");

        }
            System.out.println();
            System.out.print(q);
    }
}