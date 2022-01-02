package main.java.com.hangman;

public class ItemCreator {

    public Game game; //это создали, чтобы окно, создаваемое в Game.java понимало, с чем работает.
    ItemCreator(Game game) {//создали конструктор, приняли Гей, гейм и куда-то надо его сохранить, в ту переменную, что там выше
        this.game = game;
    }




        public  void fillItemMassive() {

            game.allItems.add(new Item (0, "Предмет-заглушка", "Универсальная затычка на все времена"));
            game.allItems.add(new Item (1, "Ключ", "Ржавый ключ на большом кольце. Такой может открывать что угодно."));
            game.allItems.add(new Item (2, "Ведро", "Новое блестящее ведро"));
            game.allItems.add(new Item (3, "Карта", "Бумажная карта с пометками, что где лежит"));
            game.allItems.add(new Item (4, "Кирка", "Ржавая кирка"));
            game.allItems.add(new Item (5, "Топор", "Крепкий топор для рубки деревьев"));
            game.allItems.add(new Item (6, "Ножик", "Ножик-хуёжик"));
            game.allItems.add(new Item (7, "Отмычка", "Несколько связанных вместе крючков для открытия дверей"));
            game.allItems.add(new Item (8, "Зеркальце", "Блестящая безделушка"));
            game.allItems.add(new Keys(9, "Ключ-карта", "Магнитная ключ карта открывает электронный замок", "Дверь в лабораторию"));

        }




}
