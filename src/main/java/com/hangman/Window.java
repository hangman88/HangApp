package main.java.com.hangman;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Window extends JFrame{

    public int random_number1;

    public Game game; //это создали, чтобы окно, создаваемое в Game.java  понимало, с чем работает.

    Window(Game game) {//создали конструктор, приняли гейм гейм и куда-то надо его сохранить, в ту переменную, что там выше
        this.game = game;
    }

            public void makeWindow () {
                Inventory inventory = new Inventory(this);

                JFrame framuga = new JFrame("Тестовая рамка");  //мы создаем рамку, которая и будет отображаться при запуске нашей игры
                framuga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //устанавливаем операцию, которая будет происходить при нажатии на крестик. EXIT_ON_CLOSE — выйти из программы
                //framuga.setExtendedState(JFrame.MAXIMIZED_BOTH);         //устанавливаем нашей рамке максимальные размеры
                //framuga.setUndecorated(true); //убираем декорации(кнопки свернуть, закрыть, уменьшить/увеличить и т.п.), т.е. делаем игру на весь экран.

                framuga.setSize(800, 600); //установит определенный размер рамки
                framuga.setResizable(false); //false чтобы нельзя было бы поменять размеры рамки, true -можно

                //framuga.setLayout(new GridLayout());
                framuga.setLayout(null);
                //framuga.add(new Main()); // добавит





                System.out.println("Окно создано");

                JTextField f1 = new JTextField(1);
                f1.setBounds(10,350,750,30);


                JButton x=new JButton("x", new ImageIcon("D:\\icon.png"));
                JButton u=new JButton("↑");
                JButton d=new JButton("↓");
                JButton l=new JButton("←");
                JButton r=new JButton("→", new ImageIcon("D:\\icon.png"));
                JButton lu=new JButton("⬈");
                JButton ld=new JButton("⬋");

                x.setBounds(650,450,50,50);

                u.setBounds(650,400,50,50);
                d.setBounds(650,500,50,50);
                l.setBounds(600,450,50,50);
                r.setBounds(700,450,50,50);
                lu.setBounds(700,400,50,50);
                ld.setBounds(600,500,50,50);

                framuga.add(x);
                framuga.add(u);
                framuga.add(d);
                framuga.add(l);
                framuga.add(r);
                framuga.add(lu);
                framuga.add(ld);

                framuga.add(f1);




                x.addActionListener(new ActionListener() { //кнопка действия
                                              @Override
                                              public void actionPerformed(ActionEvent e) {
                        System.out.println("РАБОТАЕТ КНОПКА");
                        //b.setEnabled(false);
                                                  inventory.openInventory();


                        //int random_number1 = 0 + (int) (Math.random() * 10); // Генерация 1-го числа от 0 до 10
                        //JOptionPane.showMessageDialog(null,  "Случайное число: "+random_number1 ); //вывод сообщения информационного
                        f1.setText(Game.wkonsol);

                                              } });

                u.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Вы идёте на север");
                        f1.setText("вы идёте на север");
                    } });
                d.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Вы идёте на юг");
                        f1.setText("вы идёте на юг");
                    } });
                l.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Вы идёте на восток");
                        f1.setText("вы идёте на восток");
                    } });
                r.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Вы идёте на запад");
                        f1.setText("вы идёте на запад");
                    } });

                lu.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Вы поднимаетесь выше");
                        f1.setText("вы поднимаетесь выше");
                    } });

                ld.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Вы спускаетесь ниже");
                        f1.setText("вы спускаетесь ниже");
                        //game.inventoryItems.add(game.allItems.get(1)); //0 а размер массива 1
                        game.onGroungLoc.add(game.allItems.get(1));
                    } });



                //JLabel labela = new JLabel("Текст какой-то");
                //labela.setBounds(10,10,150,50);
                //framuga.add(labela);
                ////framuga.getContentPane().add(labela);




                Object[][] cellData = {
                        {game.allItems.get(2).name, game.allItems.get(1).name, game.allItems.get(3).name, "row1-col2", "row1-col2"},
                        };




                List<JButton> onGroundBut = new ArrayList<>();

                for(int i = 0; i < 4; i++) {
                    onGroundBut.add(new JButton("it" + (i + 1)));
                    framuga.add(onGroundBut.get(i));
                    onGroundBut.get(i).setBounds((80*(i)),150,80,80);
                    int lisi = i;
                    onGroundBut.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            //System.out.println("Вы держите в руках "+window.game.inventoryItems.get(i).descr);

                            game.inventoryItems.add(game.allItems.get(1)); //0 а размер массива 1
                        }
                    });
                    if (game.onGroungLoc.size() < (i+1)) {
                        onGroundBut.get(i).setEnabled(false);
                        onGroundBut.get(i).setText("Пусто");


                    } else { // если предмета нет, то сообщит о том, что его нет.
                        onGroundBut.get(i).setEnabled(true);
                        onGroundBut.get(i).setText(game.onGroungLoc.get(i).name);
                    }

                };
















/*
                String[] columnNames = {"col1", "col2", "col3", "col4", "col5"};
                JTable tablica = new JTable(cellData, columnNames);
                tablica.setBounds(30,30,600,50);
                framuga.add(tablica);
*/





                framuga.setVisible(true);
            }

}
