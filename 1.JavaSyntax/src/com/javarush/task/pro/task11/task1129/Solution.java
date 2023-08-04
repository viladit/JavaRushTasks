package com.javarush.task.pro.task11.task1129;

/* 
Био-Нано-Боты
*/

public class Solution {

    public static Human sysadmin = new Human();

    public static void main(String[] args) {
        Class[] list=new Class[15];
        list[0]=DoomMetal.class;
        list[1]= HeavyMetal.class;
        list[2]= GlamMetal.class;
        list[3]= ThrashMetal.class;
        list[4]= SpeedMetal.class;
        list[5]= PowerMetal.class;
        list[6]= DeathMetal.class;
        list[7]= BlackMetal.class;
        list[8]= ProgressiveMetal.class;
        list[9]= GothicMetal.class;
        list[10]= SymphonicMetal.class;
        list[11]= FolkMetal.class;
        list[12]= AlternativeMetal.class;
        list[13]= IndustrialMetal.class;
        list[14]= Metalcore.class;

        sysadmin.load(list);

    }
}
