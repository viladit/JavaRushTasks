package com.javarush.task.pro.task08.task0819;

import java.util.Random;

/* 
Амиголятор и Био-диего
*/

import static com.javarush.task.pro.task08.task0819.CosmicAnomaly.*;

public class Solution {

    public static void main(String[] args) {
        int counter = 0;
        while (counter < 1) {
            int x = (upperBound + lowerBound)/2;
            if (nextAttempt(x) == x) {
                counter++;
            }
        }

    }
}
