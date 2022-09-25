/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21_chinagoroskop;

import java.util.Scanner;
/** @author Юлия */
public class JKTV21_ChinaGoroskop {
    static enum ChinaYear {
        RAT, BULL, TIGER, RABBIT, DRAGON, SNAPE, HORSE, GOAT, MONKEY, ROOSTER, DOG, PIG
    }
    static enum ChinaColor {
        GREEN, RED, YELLOW, GREY, BLUE
    }
    public static void main(String[] args) {
        ChinaYear firstY=ChinaYear.RAT;
        ChinaColor firstC=ChinaColor.GREEN;
        System.out.printf("1984 it is a "+ firstC, firstC.ordinal());
        System.out.printf(" "+firstY, firstY.ordinal());
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Напиши свой год: ");
        int yourYear = scanner.nextInt();
        int indexY = yourYear - 1984;
        if (indexY >= 12){
            indexY = indexY%12;
        }
            
        System.out.print(" "+ChinaYear.values()[indexY]+" china year - ");
    }
}
