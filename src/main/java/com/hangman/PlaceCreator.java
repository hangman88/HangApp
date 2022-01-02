package main.java.com.hangman;

import java.util.ArrayList;
import java.util.List;

public class PlaceCreator {


    public Game game; //это создали, чтобы окно, создаваемое в Game.java понимало, с чем работает.
    PlaceCreator(Game game) {//создали конструктор, приняли Гей, гейм и куда-то надо его сохранить, в ту переменную, что там выше
        this.game = game;
    }





        public  void fillPlacesMassive() {

        game.somePlace.add(new Place(0000000,0,0,"логово джигурды","хуй-пизда-джигурда", new ArrayList<>()));
            game.somePlace.get(0).itemOnGround.add( new Item (0, "Предмет-заглушка", "Универсальная затычка на все времена"));
            game.somePlace.get(0).itemOnGround.add( new Item (1, "Флюорография гуся", "ещё один странный предмет на полу"));
            game.somePlace.get(0).itemOnGround.add( new Item (2, "Чемодан без ручки", "странный предмет на полу"));
            game.somePlace.get(0).itemOnGround.add( new Item (3, "Ростки жимолости", "странно, что это лежит тут"));
            game.somePlace.get(0).itemOnGround.add( new Item (4, "Слепок стопы Горбачева", "зачем это здесь?"));

        game.somePlace.add(new Place(111111,1,1,"квартира агузаровой","хуй-пизда-джигурда", new ArrayList<>()));
            game.somePlace.get(1).itemOnGround.add( new Item (0, "Предмет-заглушка", "Универсальная затычка на все времена"));
            game.somePlace.get(1).itemOnGround.add( new Item (1, "Гладковыбритый шишун", "такой гладкий...."));
            game.somePlace.get(1).itemOnGround.add( new Item (2, "Горизонтальный самовар", "применять строго по инструкции"));
        game.somePlace.add(new Place(22222222,2,2,"дом странных детей","хуй-пизда-джигурда", new ArrayList<>()));
            game.somePlace.get(2).itemOnGround.add( new Item (0, "Предмет-заглушка", "Универсальная затычка на все времена"));
            game.somePlace.get(2).itemOnGround.add( new Item (1, "Флюорография гуся", "ещё один странный предмет на полу"));
            game.somePlace.get(2).itemOnGround.add( new Item (2, "Чемодан без ручки", "странный предмет на полу"));
            game.somePlace.get(2).itemOnGround.add( new Item (3, "Ростки жимолости", "странно, что это лежит тут"));
            game.somePlace.get(2).itemOnGround.add( new Item (4, "Слепок стопы Горбачева", "зачем это здесь?"));
        game.somePlace.add(new Place(33333333,3,3,"Ключная лавка","хуй-пизда-джигурда", new ArrayList<>()));
            game.somePlace.get(3).itemOnGround.add( new Item (0, "Предмет-заглушка", "Универсальная затычка на все времена"));
            game.somePlace.get(3).itemOnGround.add( new Item (1, "Флюорография гуся", "ещё один странный предмет на полу"));
            game.somePlace.get(3).itemOnGround.add( new Item (2, "Чемодан без ручки", "странный предмет на полу"));
            game.somePlace.get(3).itemOnGround.add( new Item (3, "Ростки жимолости", "странно, что это лежит тут"));
            game.somePlace.get(3).itemOnGround.add( new Item (4, "Слепок стопы Горбачева", "зачем это здесь?"));
        game.somePlace.add(new Place(44444444,4,4,"подвал сатанистов","хуй-пизда-джигурда", new ArrayList<>()));
            game.somePlace.get(4).itemOnGround.add( new Item (0, "Предмет-заглушка", "Универсальная затычка на все времена"));
            game.somePlace.get(4).itemOnGround.add( new Item (1, "Флюорография гуся", "ещё один странный предмет на полу"));
            game.somePlace.get(4).itemOnGround.add( new Item (2, "Чемодан без ручки", "странный предмет на полу"));
            game.somePlace.get(4).itemOnGround.add( new Item (3, "Ростки жимолости", "странно, что это лежит тут"));
            game.somePlace.get(4).itemOnGround.add( new Item (4, "Слепок стопы Горбачева", "зачем это здесь?"));


            for (int m = 0; m < 4; m++) {
                for (int i = 0; i < 2; i++) {

                    System.out.println("локация называется " + game.somePlace.get(m).name + " и на земле там лежит  " + (game.somePlace.get(m).itemOnGround.size() - 1) + " вещей, и " + game.somePlace.get(m).itemOnGround.get(i + 1).id + " это " + game.somePlace.get(m).itemOnGround.get(i + 1).name + ", " + game.somePlace.get(m).itemOnGround.get(i + 1).descr);

                }
            }


            //game.allPlaces.add(new Place (000000000,0,0,"заглушка нулевого элемента локации", "Специальная заглушка-локация, чтобы занять нулевой элемент массива"));
            //game.allPlaces.add(new Place (001001001,1,1,"первая локация, которую я создаю", "Небольшая тесная комнатка без окон из с единственной дверью. Стены сколочены из грубых широких досок, слабо подогнанных друг к другу. В углу стоит небольшой шкаф, сколоченный из грубых досок. "));


    }



}
