package main.java.com.hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapPrinter {

    public Game game; //это создали, чтобы окно, создаваемое в Game.java  понимало, с чем работает.

    MapPrinter (Game game) {//создали конструктор, приняли гейм гейм и куда-то надо его сохранить, в ту переменную, что там выше
        this.game = game;
    }




    //game.inventoryItems.get(lisi).name

    public void printMap () {
        String[][] data1={
                {"...","...","...","...","...","...","..."},
                {"...","...","...","...","...","..╕","..╕"},
                {"...","...",".◘.","...","...","...","..╕"},
                {"...","...","...","...","...","..╕","..╕"},
                {"...","...","...","...","...","..╕","..."},
                {"...","...","..Æ","...","...","...","..."}};
        int i, m;
        for(m=0;m < data1.length;m++) {
            for (i = 0; i < data1[m].length; i++) {
                System.out.print("|" + data1[m][i]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------------------");
    }




       public void printoldMap () {
           String[][] data1={
                   {"1.1","1.2","1.3","...",".1."},
                   {"2.1","2.2","...","...","..."},
                   {"3.1","3.2","...","..."},
                   {"4.1","4.2","...","...","...","...","..."}};
           int i, m;
           for(m=0;m < data1.length;m++) {
                   for (i = 0; i < data1[m].length; i++) {
                       System.out.print("|" + data1[m][i]);
                   }
               System.out.print("|");
               System.out.println();
           }
           System.out.println("---------------------");
       }
}

