package com.javarush.task.pro.task09.task0921;

/* 
Пиратский разворот
*/

import java.util.Arrays;

public class NimrodAi {
    
    public static void main(String[] args) {
        PastryLoader[] pastryLoaders = new PastryLoader[]{new PastryLoader(), new PastryLoader(), new PastryLoader()};

        scanMemory(pastryLoaders);
        replaceTarget(pastryLoaders);
        scanMemory(pastryLoaders);

    }

    public static void scanMemory(PastryLoader[] pastryLoaders) {
        System.out.println();
        for (PastryLoader pastryLoader : pastryLoaders) {
            System.out.println(Arrays.deepToString(pastryLoader.memory));
        }
    }

    public static void replaceTarget(PastryLoader[] pastryLoaders) {
        /*for (int i = 0; i < pastryLoaders.length; i++) {
            for (int j = 0; j < pastryLoaders[i].length; j++) {
                for (int k = 0; k < pastryLoaders[i][j].length; k++) {
                    System.out.println(pastryLoaders[i][j][k]);
                }
            }
        }*/

        System.out.println(pastryLoaders.length);
        System.out.println(pastryLoaders.length);

    }
}
