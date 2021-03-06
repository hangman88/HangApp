package main.java.com.hangman;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Window extends JFrame{
    public List<JButton> onGroundBut = new ArrayList<>();


    public Game game; //это создали, чтобы окно, создаваемое в Game.java понимало, с чем работает.
    Window(Game game) {//создали конструктор, приняли Гей, гейм и куда-то надо его сохранить, в ту переменную, что там выше
        this.game = game;
    }

    //int playerPositionX=1;
    //int playerPositionY=1;


            public void makeWindow () {

                Inventory inventory = new Inventory(this);

                JFrame mainFrame = new JFrame("Тестовая рамка");  //мы создаем рамку, которая и будет отображаться при запуске нашей игры
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Устанавливаем операцию, которая будет происходить при нажатии на крестик. EXIT_ON_CLOSE — выйти из программы
                //mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);         //устанавливаем нашей рамке максимальные размеры
                //mainFrame.setUndecorated(true); //убираем декорации(кнопки свернуть, закрыть, уменьшить/увеличить и т.п.), т.е. делаем игру на весь экран.

                mainFrame.setSize(800, 600); //установит определенный размер рамки
                mainFrame.setResizable(false); //false чтобы нельзя было бы поменять размеры рамки, true -можно

                //mainFrame.setLayout(new GridLayout());
                mainFrame.setLayout(null);
                //mainFrame.add(new Main()); // добавит



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

                mainFrame.add(x);
                mainFrame.add(u);
                mainFrame.add(d);
                mainFrame.add(l);
                mainFrame.add(r);
                mainFrame.add(lu);
                mainFrame.add(ld);

                mainFrame.add(f1);




                x.addActionListener(new ActionListener() { //кнопка действия
                                              @Override
                                              public void actionPerformed(ActionEvent e) {
                                                  inventory.openInventory();


                                                  f1.setText(Game.wkonsol);

                                              } });

                u.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) throws ArrayIndexOutOfBoundsException {
                        try{
                        game.playerPositionY--;
                        game.mapPrinter.printMap();
                        //playerPositionY=y;
                        System.out.println("Вы идёте на север");
                        f1.setText("вы идёте на север");
                        } catch (ArrayIndexOutOfBoundsException ext) {
                            System.out.println("Вы не можете идти в ту сторону");
                        }

                    } });
                d.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) throws ArrayIndexOutOfBoundsException {

                        try {
                            game.playerPositionY++;
                            game.mapPrinter.printMap();



                            System.out.println("Вы идёте на юг");
                            f1.setText("вы идёте на юг");

                        } catch (ArrayIndexOutOfBoundsException ext) {
                            System.out.println("Вы не можете идти в ту сторону");
                        }


                    } });
                l.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) throws ArrayIndexOutOfBoundsException {

                        try {
                        //int x=playerPositionX;
                        //int y=playerPositionY;
                        //game.data1[y][x] = "...";
                        //game.data1[y][x-1] = ".x.";
                        game.playerPositionX--;
                        game.mapPrinter.printMap();
                        //playerPositionX=x;
                            System.out.println("Вы идёте на восток");
                            f1.setText("вы идёте на восток");

                        } catch (ArrayIndexOutOfBoundsException ext) {
                            System.out.println("Вы не можете идти в ту сторону");
                        }


                    } });
                r.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) throws ArrayIndexOutOfBoundsException {
                        try {
                        //int x=playerPositionX;
                        //int y=playerPositionY;
                        //game.data1[y][x] = "...";
                        //game.data1[y][x+1] = ".x.";
                        game.playerPositionX++;
                        game.mapPrinter.printMap();
                        //playerPositionX=x;
                            System.out.println("Вы идёте на запад");
                            f1.setText("вы идёте на запад");

                        } catch (ArrayIndexOutOfBoundsException ext) {
                            System.out.println("Вы не можете идти в ту сторону");
                        }

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
                        //game.inventoryItems.add(game.allItems.get(1)); // эта строчка добавляла предмет в инвентарь для теста. удалить чуть позже
                        game.onGroundLoc.add(game.allItems.get(1));
                        checkGround();
                    } });



                mainFrame.setVisible(true);




                for(int i = 0; i < 8; i++) {
                    onGroundBut.add(new JButton("it" + (i + 1)));
                    mainFrame.add(onGroundBut.get(i));
                    onGroundBut.get(i).setBounds((70+80*(i)),250,80,80);


                    int lisi = i;
                    onGroundBut.get(i).addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (game.inventoryItems.size() <= 7) {
                                game.inventoryItems.add(game.onGroundLoc.get(lisi)); //0, а размер массива 1
                                System.out.println("Вы подняли " + game.onGroundLoc.get(lisi).name);
                                game.onGroundLoc.remove(lisi); //0, а размер массива 1
                                checkGround();
                            } else {
                                System.out.println("Вы не можете нести больше");
                            }
                        }
                    });
                }



                checkGround();

            }

            public void checkGround() {
                    for (int i = 0; i < 8; i++) {
                        if (game.onGroundLoc.size() < (i+1)) {
                            onGroundBut.get(i).setEnabled(false);
                            onGroundBut.get(i).setText("Пусто");
                        } else { // если предмета нет, то сообщит о том, что его нет.
                            onGroundBut.get(i).setEnabled(true);
                            onGroundBut.get(i).setText(game.onGroundLoc.get(i).name);
                        }
                    }
            }

}
