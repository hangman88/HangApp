package main.java.com.hangman;

public class Item {

         int id;
         String name;
         String descr;
         //final String bla; //константа, не будет меняться


         //конструктор класса полный
    Item (int id, String name,String descr){
        this.id = id;
        this.name = name;
        this.descr = descr;

    }

    Item (){} //пустой конструктор

    //конструктор класса огрызок, от которого нужно избавиться. Допускает использование отдельных параметров
    Item (int id,String descr){
        this.id = id;
        this.descr = descr;

    }


}
