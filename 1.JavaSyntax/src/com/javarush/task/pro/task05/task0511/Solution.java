package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nLines = input.nextInt();
        multiArray = new int[nLines][];

        for (int i = 0; i < nLines; i++) {
            int nArrays = input.nextInt();
                multiArray[i] = new int[nArrays];
        }



    }
}
