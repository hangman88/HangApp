package main.java.com.hangman;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Inventory extends JFrame{

    public Window window; //это создали, чтобы окно, создаваемое в Game.java  понимало, с чем работает.

    Inventory (Window window) {//создали конструктор, приняли гейм гейм и куда-то надо его сохранить, в ту переменную, что там выше
        this.window = window;
    }




    public void openInventory () {
        JFrame inventoryBag = new JFrame("Вещевой мешок");
        inventoryBag.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);  //устанавливаем операцию, которая будет происходить при нажатии на крестик. EXIT_ON_CLOSE — выйти из программ
        inventoryBag.setSize(420, 270); //установит определенный размер рамки
        inventoryBag.setResizable(false); //false чтобы нельзя было бы поменять размеры рамки, true -можно
        inventoryBag.setLayout(null);
        inventoryBag.setVisible(true);
        System.out.println("ИНвентарь открыт");



        List<JButton> itBtn = new ArrayList<>();

        for(int i = 0; i < 4; i++) {
            itBtn.add(new JButton("it" + (i + 1)));
            inventoryBag.add(itBtn.get(i));
            itBtn.get(i).setBounds((80*(i)),20,80,80);
            int lisi = i;
            itBtn.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //System.out.println("Вы держите в руках "+window.game.inventoryItems.get(i).descr);
                    JOptionPane.showMessageDialog(null,  "У вас в руках: "+window.game.inventoryItems.get(lisi).name + " и это "+window.game.inventoryItems.get(lisi).descr);
                }
            });
            if (window.game.inventoryItems.size() < (i+1)) {
                itBtn.get(i).setEnabled(false);
                itBtn.get(i).setText("Пусто");


            } else { // если предмета нет, то сообщит о том, что его нет.
                itBtn.get(i).setEnabled(true);
                itBtn.get(i).setText(window.game.inventoryItems.get(i).name);
            }

            };

        for(int i = 4; i < 8; i++) {
            itBtn.add(new JButton("it" + (i + 1)));
            inventoryBag.add(itBtn.get(i));
            itBtn.get(i).setBounds((80*(i-4)),100,80,80);
            int lisi = i;
            itBtn.get(i).addActionListener(new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(null,  "У вас в руках: "+window.game.inventoryItems.get(lisi).name + " и это "+window.game.inventoryItems.get(lisi).descr); //вывод сообщения информационного
                }
            });
            if (window.game.inventoryItems.size() < (i+1)) {
                itBtn.get(i).setEnabled(false);
                itBtn.get(i).setText("Пусто");


            } else { // если предмета нет, то сообщит о том, что его нет.
                itBtn.get(i).setEnabled(true);
                itBtn.get(i).setText(window.game.inventoryItems.get(i).name);
            }

        };







        }



    }




