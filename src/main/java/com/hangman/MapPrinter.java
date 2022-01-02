package main.java.com.hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapPrinter {

    public Game game; //это создали, чтобы окно, создаваемое в Game.java  понимало, с чем работает.

    MapPrinter (Game game) {//создали конструктор, приняли гейм гейм и куда-то надо его сохранить, в ту переменную, что там выше
        this.game = game;
    }



    public void printMap () {

        int i, m;
        for(m=0;m < game.data1.length;m++) {
            for (i = 0; i < game.data1[m].length; i++) {
                System.out.print("|" + game.data1[m][i]);
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.println("---------------------");
    }



}

