package com.javarush.task.pro.task05.task0519;

import javax.security.auth.login.AccountExpiredException;
import java.util.Arrays;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] copyOfArray = Arrays.copyOfRange(array,0, array.length);
        Arrays.sort(copyOfArray);
        if (Arrays.binarySearch(copyOfArray, element) >= 0) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
