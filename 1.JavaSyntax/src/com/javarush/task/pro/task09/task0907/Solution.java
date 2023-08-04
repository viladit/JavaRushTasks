package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hex = "";
        while(decimalNumber > 0) {
            if (decimalNumber%16 >= 10) {
                switch (decimalNumber % 16) {
                    case 10 -> hex =  "A" + hex;
                    case 11 -> hex =  "B" + hex;
                    case 12 -> hex =  "C" + hex;
                    case 13 -> hex =  "D" + hex;
                    case 14 -> hex =  "E" + hex;
                    case 15 -> hex =  "F" + hex;
                }
            }else {
                hex =  decimalNumber % 16 + hex;
            }
            decimalNumber = decimalNumber / 16;
        }
        return hex;
    }

    public static int toDecimal(String hexNumber) {
        int decimal = 0;
        if (hexNumber == null || hexNumber.equals(""))
        {
            return 0;
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            decimal = 16 * decimal + HEX.indexOf(hexNumber.charAt(i));
        }
        return decimal;
    }
}
