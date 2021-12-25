package main.java.com.hangman;

public class MapPrinter {

    public Game game; //это создали, чтобы окно, создаваемое в Game.java  понимало, с чем работает.

    MapPrinter (Game game) {//создали конструктор, приняли гейм гейм и куда-то надо его сохранить, в ту переменную, что там выше
        this.game = game;
    }






   public void printMap () {

    System.out.println("массив карты");
    }
}

