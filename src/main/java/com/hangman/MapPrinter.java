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

//--------------------------------------------------


            game.storeCell = Arrays.copyOf(game.mapTest, game.mapTest.length);
            game.storeCell[game.playerPositionY][game.playerPositionX] = ".x.";
            System.out.print("X: "+game.playerPositionX+" ");
            System.out.println("Y: "+game.playerPositionY);
            //String storeCell = game.data1[y][x];
            //game.data1[y][x] = storeCell;
            //game.data1[y][x] = ".x.";



//--------------------------------------------------

            int i, m;
            for (m = 0; m < game.storeCell.length; m++) {
            for (i = 0; i < game.storeCell[m].length; i++) {
                System.out.print("|" + game.storeCell[m][i]);
            }
            System.out.print("|");
            System.out.println();
            }
/*
            for (m = 0; m < game.mapTest.length; m++) {
                for (i = 0; i < game.mapTest[m].length; i++) {
                    System.out.print("|" + game.mapTest[m][i]);
                }
                System.out.print("|");
                System.out.println();
            }
*/
            System.out.println("---------------------");





    }



}

