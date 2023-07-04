package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        for (int i = 0; i < 6; i++) {
            strings[i] = input.nextLine();
        }

        for (int i = 0; i < strings.length - 1;  i++) {
            for (int j = i+1; j < strings.length; j++) {
                if (strings[i] != null && strings[j] != null) {
                    if (strings[i].equals(strings[j])) {
                        strings[j] = null;
                        flag = true;
                    }
                }
            }
            if (flag) {
                strings[i] = null;
                flag = false;
            }
        }


        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
