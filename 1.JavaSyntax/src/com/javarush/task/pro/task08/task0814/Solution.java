package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        //напишите тут ваш код
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {

        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        if ((number & (1 << flagPos)) != 0) {
            return true;
        }
        return false;
    }
}
