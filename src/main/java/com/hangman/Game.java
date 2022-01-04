package main.java.com.hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Game {

    int playerPositionX=0;
    int playerPositionY=0;

    public MapPrinter mapPrinter;

     public List<Item> allItems = new ArrayList<>(); //массив Все предметы



    public List<Place> somePlace = new ArrayList<>();
    //List<List<Place>> allPlaces = new ArrayList<>(); //массив Все локации

     public List<Item> inventoryItems = new ArrayList<>(); //массив предметы инвентаря
     public List<Item> onGroungLoc = new ArrayList<>();// ВРЕМЕННЫЙ массив предметы на земле локации (будет перенесён и привязан к конкретной локации)

    static String wkonsol;


     String[][] mapTest={
            {"...","...",".Æ.","...","...","...","..."},
            {"...","...","...","...","...","..╕","..╕"},
            {"...","...",".◘.","...",".Æ.","...","..╕"},
            {".Æ.","...","...","...","...","..╕","..╕"},
            {"...","...","...","...","...","..╕","..."},
            {"...","...","..Æ","...","...","...","..."}};
    String[][] storeCell;



    public void startGame() {


        // ----------Создаем все предметы и заполняем ними массив "все предметы"
         // ItemCreator itemCreator = new ItemCreator((this));
        new ItemCreator(this).fillItemMassive();

        // ----------Создаем все локации и заполняем ними массив "все локации"
        PlaceCreator placeCreator = new PlaceCreator((this));
        placeCreator.fillPlacesMassive();

        // ----------Создаем основное окно игры, в котором всё происходит
        Window window = new Window(this);
        window.makeWindow();

        // ----------Создаем тестовую карту в консоли
        mapPrinter = new MapPrinter(this);
        mapPrinter.printMap();







            // тут бесконечный цикл, которым я "слушаю" введенное в консоль и реагирую в зависимости от того, что было введено.
              /*
            while (true) {

                Scanner consola = new Scanner(System.in); // тут считываем содержимое строки консоли
                //int numa = consola.nextInt(); // тут закомментил считывание инт с консоли
                 String texa = consola.nextLine(); //считываем следующую строку и решаем, преобразуемая она в инт или не



                try {
                    // именно здесь String прочитанный в строке преобразуется в int
                    int numa = Integer.parseInt(texa.trim());

                    // Если предмет есть в списке, то выведет его параметры
                    if (allItems.size() >= (numa + 1)) {
                        System.out.println("У вас в руках " + allItems.get(numa).name + " и это  " + allItems.get(numa).descr);
                         wkonsol =  ("У вас в руках " + allItems.get(numa).name + " и это  " + allItems.get(numa).descr);


                    } else { // если предмета нет, то сообщит о том, что его нет.
                        System.out.println("Такой предмет ещё не существует");
                    }

                } catch (NumberFormatException nfe) { // если ты ввёл не цифры а текст, программа поругается
                    System.out.println("я ожидал цифры, а ты ввёл " + nfe.getMessage());
                }
            }
            */



    }




}
