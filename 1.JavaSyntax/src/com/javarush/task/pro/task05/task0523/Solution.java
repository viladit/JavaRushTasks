package com.javarush.task.pro.task05.task0523;

/* 
Охота на Кибердракона
*/

public class Solution {
    public static int[] coordinates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for (int a = 0; a < coordinates.length; a++) {
            if (a % 2 == 0) {
                x += coordinates[a];
            } else {
                y += coordinates[a];
            }
        }
        System.out.println(x);
        System.out.println(y);
    }
}
