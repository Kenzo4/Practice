package com.codewars;

public class TimeToString {
    public static String convertTime(int time){
        return String.format("%d %d %d %d", time/86400, (time%86400)/3600, (time % 3600)/60, time % 60);
    }
}
