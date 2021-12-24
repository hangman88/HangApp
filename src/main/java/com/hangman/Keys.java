package main.java.com.hangman;



// тут больше пример, чем необходимость. Это наследование всех параметров основного предмета для класса Ключи.
public class Keys extends Item {
    public String openDoor;


    Keys(int id, String name, String descr, String opendoor) {
        super(id, name, descr);
        this.openDoor = opendoor;
    }


}
