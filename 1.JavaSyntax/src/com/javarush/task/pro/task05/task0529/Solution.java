package com.javarush.task.pro.task05.task0529;

import java.util.Arrays;

/* 
Галаксианские роботанки (1)
*/

public class Solution {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static String[][] field = new String[height][width];
    public static int[][] bombs = new int[height][width];
    public static int[] robotankPlace = new int[height];

    public static int amoutOfTanks = 10;


    public static void main(String[] args) {
        for (int i = 0; i < height; i++) {
            Arrays.fill(field[i], empty);
        }
        for (int i = 0; i < height; i++) {
            int x = (int) (Math.random() * width);
            field[i][x] = robotank;
            robotankPlace[i] = x;
        }
        while (amoutOfTanks > 0) {
            for (int i = 0; i < height; i++) {
                Arrays.fill(bombs[i], 0);
                for (int j = 0; j < 10; j++) {
                    int x = (int) (Math.random() * width);
                    if (bombs[i][x] == 1) {
                        j = j - 1;
                    } else {
                        bombs[i][x] = 1;
                    }
                }
            }
            for (int i = 0; i < height; i++) {
                if (robotankPlace[i] != -1) {
                    if (bombs[i][robotankPlace[i]] == 1) {
                        field[i][robotankPlace[i]] = hit;
                        robotankPlace[i] = -1;
                        amoutOfTanks = amoutOfTanks - 1;
                    }
                }
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
