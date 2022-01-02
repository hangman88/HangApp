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



        //--------------написал свои первые сеттеры и геттеры


        //Геттер Id
        public int getId() {
            return id;
        }

        //Сеттер Id
        public void setId(int id) {
            this.id = id;
        }

        //Геттер name
        public String getName() {
            return name;
        }

        //Сеттер name
        public void setName(String name) {
            this.name = name;
        }

        //Геттер Decription
        public String getDescr() {
            return descr;
        }

        //сеттер Decription
        public void setDescr(String descr) {
            this.descr = descr;
        }

}
