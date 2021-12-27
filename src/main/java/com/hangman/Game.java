package main.java.com.hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {


     List<Item> allItems = new ArrayList<>();
     List<Item> inventoryItems = new ArrayList<>();
    List<Item> onGroungLoc = new ArrayList<>();


    static String wkonsol;


    public  void fillMassive() {

        allItems.add(new Item (0, "Предмет-заглушка", "Универсальная затычка на все времена"));
        allItems.add(new Item (1, "Ключ", "Ржавый ключ на большом кольце. Такой может открывать что угодно."));
        allItems.add(new Item (2, "Ведро", "Новое блестящее ведро"));
        allItems.add(new Item (3, "Карта", "Бумажная карта с пометками, что где лежит"));
        allItems.add(new Item (4, "Кирка", "Ржавая кирка"));
        allItems.add(new Item (5, "Топор", "Крепкий топор для рубки деревьев"));
        allItems.add(new Item (6, "Ножик", "Ножик-хуёжик"));
        allItems.add(new Item (7, "Отмычка", "Несколько связанных вместе крючков для открытия дверей"));
        allItems.add(new Item (8, "Зеркальце", "Блестящая безделушка"));
        allItems.add(new Keys(9, "Ключ-карта", "Магнитная ключ карта открывает электронный замок", "Дверь в лабораторию"));

        inventoryItems.add(allItems.get(1)); //0 а размер массива 1
       // inventoryItems.add(allItems.get(2)); //1 а размер массива 2
        //inventoryItems.add(allItems.get(3)); //2 а размер массива 3
       // inventoryItems.add(allItems.get(4)); //3 а размер массива 4
       // inventoryItems.add(allItems.get(5)); //4 а размер массива 5
        //inventoryItems.add(allItems.get(6)); //5 а размер массива 6
        //inventoryItems.add(allItems.get(7)); //6 а размер массива 7
        //inventoryItems.add(allItems.get(8)); //7 а размер массива 8

    }




    public void startGame() {

        fillMassive(); //наполнит массив
        Window window = new Window(this);
        window.makeWindow();//создали окно, пока тестовая фича для проб гуя с ней чуть позже разберемся.

        //MapPrinter maptest = new MapPrinter(this);
        //maptest.printMap();


        enum testenum {
            Dirt,
            Grass,
            Water;
        }




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




    }




}
