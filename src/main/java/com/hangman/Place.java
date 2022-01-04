package main.java.com.hangman;

import java.util.ArrayList;
import java.util.List;

public class
Place {

    int locId;  // локации Id нумеруются от 000 000 000 000, где каждая пара - привязка к области/региону/месту
    int x;
    int y;
    String name;
    String content;


    enum testenum {
        Dirt,
        Grass,
        Water;
    }


    List<Item> itemOnGround = new ArrayList<>();



    Place(int locId, int x, int y, String name, String content, List<Item> itemOnGround){

        this.locId = locId;
        this.x = x;
        this.y = y;
        this.name = name;
        this.content = content;
        this.itemOnGround = itemOnGround;


    }

    Place (){} //пустой конструктор

//геттер и сеттер созданные программой
/*
    public List<Item> getItemOnGround() {
        return itemOnGround;
    }


    public void setItemOnGround(List<Item> itemOnGround) {
        this.itemOnGround = itemOnGround;
    }
*/

}
