package Shopping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class inventory {


    JPanel dialog_panel;
        JFrame frame ;
        JLabel inventory;
        ImageIcon image ;
        JLabel backGround;
        JPanel panel1;
        JPanel panel2;
        JPanel panel3;
        JPanel panel4;
        JPanel panel5;
        JPanel panel6;
        JPanel panel7;
        JPanel panel8;

        JLabel label1;
        JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JPopupMenu pop1;
    JMenuItem add1;
    JPopupMenu pop2;
    JMenuItem add2;
    JPopupMenu pop3;
    JMenuItem add3;
    JPopupMenu pop4;
    JMenuItem add4;
    JPopupMenu pop5;
    JMenuItem add5;
    JPopupMenu pop6;
    JMenuItem add6;
    JPopupMenu pop7;
    JMenuItem add7;
    JPopupMenu pop8;
    JMenuItem add8;






        JButton cartButton;

    protected static ArrayList<String> Item_name = new ArrayList<>();
    protected static ArrayList<Integer> Item_price = new ArrayList<>();
    protected static ArrayList<Integer> Item_quantity = new ArrayList<>();

    ArrayList<String> temp_name = new ArrayList<>();
    ArrayList<Integer> temp_price = new ArrayList<>();



        inventory() {


            addWidgets();
            inventory_display();

            cartButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Cart c1 = new Cart(Item_name, Item_price,Item_quantity);
                    if(Item_name.isEmpty()==true) {
                        frame.setVisible(false);
                        JOptionPane.showMessageDialog(dialog_panel, "YOUR CART IS EMPTY", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }

                    else {
                        frame.setVisible(false);
                        c1.cart_display();
                    }

                }

            });


            //PANELS ACTION LISTENERS
            panel1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                  //  super.mouseClicked(e);
                    pop1.show(frame, 130, 250);//add 80 +  150

                }
            });


            panel2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //super.mouseClicked(e);
                    pop2.show(frame, 340, 250);

                }
            });


            panel3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //     super.mouseClicked(e);
                    pop3.show(frame, 540, 250);

                }
            });


            panel4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //   super.mouseClicked(e);
                    pop4.show(frame, 740, 250);

                }
            });


            panel5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // super.mouseClicked(e);
                    pop5.show(frame, 130, 500);//add 80 +  150


                }
            });


            panel6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    //super.mouseClicked(e);
                    pop6.show(frame, 340, 500);


                }
            });


            panel7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // super.mouseClicked(e);
                    pop7.show(frame, 540, 500);

                }
            });


            panel8.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    pop8.show(frame, 730, 500);

                }
            });


        }
        void addWidgets(){

            pop1 = new JPopupMenu();
            add1 = new JMenuItem("ADD TO CART");
            pop1.add(add1);
            add1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    Item_name.add("EAR PHONES");
                    Item_price.add(600);
                    final JPanel panel = new JPanel();
                    String quantity = JOptionPane.showInputDialog("ENTER PRODUCT QUANTITY YOU WANT TO BUY");
                    int quant = Integer.parseInt(quantity);
                    Item_quantity.add(quant);
                    JOptionPane.showMessageDialog(panel, "ITEM ADDED TO THE CART", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            pop2 = new JPopupMenu();
            add2 = new JMenuItem("ADD TO CART");
            pop2.add(add2);
            add2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    Item_name.add("SAMSUNG ");
                    Item_price.add(32000);
                    final JPanel panel = new JPanel();
                    String quantity = JOptionPane.showInputDialog("ENTER PRODUCT QUANTITY YOU WANT TO BUY");
                    int quant = Integer.parseInt(quantity);
                    Item_quantity.add(quant);
                    JOptionPane.showMessageDialog(panel, "ITEM ADDED TO THE CART", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            pop3 = new JPopupMenu();
            add3 = new JMenuItem("ADD TO CART");
            pop3.add(add3);
            add3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    Item_name.add("MYSTERY BOX");
                    Item_price.add(5000);
                    final JPanel panel = new JPanel();
                    String quantity = JOptionPane.showInputDialog("ENTER PRODUCT QUANTITY YOU WANT TO BUY");
                    int quant = Integer.parseInt(quantity);
                    Item_quantity.add(quant);
                    JOptionPane.showMessageDialog(panel, "ITEM ADDED TO THE CART", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            pop4 = new JPopupMenu();
            add4 = new JMenuItem("ADD TO CART");
            pop4.add(add4);
            add4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    Item_name.add("SAMSUNG LED 43\"");
                    Item_price.add(40000);
                    final JPanel panel = new JPanel();
                    String quantity = JOptionPane.showInputDialog("ENTER PRODUCT QUANTITY YOU WANT TO BUY");
                    int quant = Integer.parseInt(quantity);
                    Item_quantity.add(quant);
                    JOptionPane.showMessageDialog(panel, "ITEM ADDED TO THE CART", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            pop5 = new JPopupMenu();
            add5 = new JMenuItem("ADD TO CART");
            pop5.add(add5);
            add5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    Item_name.add("GLASSES");
                    Item_price.add(1500);
                    final JPanel panel = new JPanel();
                    String quantity = JOptionPane.showInputDialog("ENTER PRODUCT QUANTITY YOU WANT TO BUY");
                    int quant = Integer.parseInt(quantity);
                    Item_quantity.add(quant);
                    JOptionPane.showMessageDialog(panel, "ITEM ADDED TO THE CART", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            pop6 = new JPopupMenu();
            add6 = new JMenuItem("ADD TO CART");
            pop6.add(add6);
            add6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    Item_name.add("DIGITAL WATCH");
                    Item_price.add(3000);
                    final JPanel panel = new JPanel();
                    String quantity = JOptionPane.showInputDialog("ENTER PRODUCT QUANTITY YOU WANT TO BUY");
                    int quant = Integer.parseInt(quantity);
                    Item_quantity.add(quant);
                    JOptionPane.showMessageDialog(panel, "ITEM ADDED TO THE CART", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            pop7 = new JPopupMenu();
            add7 = new JMenuItem("ADD TO CART");
            pop7.add(add7);
            add7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                        Item_name.add("SONY PLAYSATION 4");
                    Item_price.add(39000);
                    final JPanel panel = new JPanel();
                    String quantity = JOptionPane.showInputDialog("ENTER PRODUCT QUANTITY YOU WANT TO BUY");
                    int quant = Integer.parseInt(quantity);
                    Item_quantity.add(quant);
                    JOptionPane.showMessageDialog(panel, "ITEM ADDED TO THE CART", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            pop8 = new JPopupMenu();
            add8 = new JMenuItem("ADD TO CART");
            pop8.add(add8);
            add8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    Item_name.add("ADIDAS SNEAKERS");
                    Item_price.add(8999);
                    final JPanel panel = new JPanel();
                    String quantity = JOptionPane.showInputDialog("ENTER PRODUCT QUANTITY YOU WANT TO BUY");
                    int quant = Integer.parseInt(quantity);
                    Item_quantity.add(quant);
                    JOptionPane.showMessageDialog(panel, "ITEM ADDED TO THE CART", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            });




            //BACKGROUNG
            image = new ImageIcon("Images\\inventory.jpg");
            backGround = new JLabel("",image,SwingConstants.CENTER);
            backGround.setBounds(0,0,900,730);

            //Buttons
            cartButton = new JButton(new ImageIcon("Images\\button.png"));
            cartButton.setBounds(770,20,80,35);

            //LABEL
            inventory = new JLabel();
            inventory.setText("INVENTORY");
            inventory.setBounds(350,-50,800,200);
            inventory.setForeground(Color.white);
            inventory.setFont(new Font("Algerian",Font.BOLD,36));
            inventory.setBackground(Color.WHITE);


            //frame
            frame = new JFrame("STORE ASSIGNMENT");
            frame.setSize(900,730);

            panel1 = new JPanel();
            panel1.setBounds(50,100,130,130);
            panel1.setBackground(new Color(0,0,0,0));
            panel1.add(new JLabel(new ImageIcon("Images\\earphones.png")));

            panel2 = new JPanel();
            panel2.setBounds(260,100,130,130);
            panel2.setBackground(new Color(0,0,0,0));
            panel2.add(new JLabel(new ImageIcon("Images\\phone.png")));

            panel3 = new JPanel();
            panel3.setBounds(460,100,130,130);
             panel3.setBackground(new Color(0,0,0,0));
            panel3.add(new JLabel(new ImageIcon("Images\\box.png")));

            panel4 = new JPanel();
            panel4.setBounds(660,100,150,120);
            panel4.add(new JLabel(new ImageIcon("Images\\tv.png")));
            panel4.setBackground(new Color(0,0,0,0));

            panel5 = new JPanel();
            panel5.setBounds(50,350,130,130);
            panel5.setBackground(new Color(0,0,0,0));
            panel5.add(new JLabel(new ImageIcon("Images\\glasses.png")));

            panel6 = new JPanel();
            panel6.setBounds(260,350,130,130);
            panel6.setBackground(new Color(0,0,0,0));
            panel6.add(new JLabel(new ImageIcon("Images\\watch.png")));

            panel7 = new JPanel();
            panel7.setBounds(460,350,130,130);
            panel7.add(new JLabel(new ImageIcon("Images\\playstation.png")));
            panel7.setBackground(new Color(0,0,0,0));

            panel8 = new JPanel();
            panel8.setBounds(660,350,150,120);
            panel8.add(new JLabel(new ImageIcon("Images\\shoes.png")));
            panel8.setBackground(new Color(0,0,0,0));


            //LABELS
            label1 = new JLabel("<html>EAR PHONES<br/>PRICE : 600</html>");
            label1.setForeground(Color.white);
            label1.setBounds(50,185,150,00200);
            label1.setFont(new Font("Arial Black",Font.PLAIN,12));

            label2 = new JLabel("<html>SAMSUNG NOTE 10<br/>PRICE : 32000</html>");
            label2.setForeground(Color.white);
            label2.setBounds(255,185,150,00200);
            label2.setFont(new Font("Arial Black",Font.PLAIN,12));

            label3 = new JLabel("<html>MYSTERY BOX<br/>PRICE : 5000</html>");
            label3.setForeground(Color.white);
            label3.setBounds(455,185,150,00200);
            label3.setFont(new Font("Arial Black",Font.PLAIN,12));

            label4 = new JLabel("<html>SAMSUNG LED 43\"<br/>PRICE : 40000</html>");
            label4.setForeground(Color.white);
            label4.setBounds(657,185,150,00200);
            label4.setFont(new Font("Arial Black",Font.PLAIN,12));

            label5 = new JLabel("<html>GLASSES<br/>PRICE : 1500</html>");
            label5.setForeground(Color.white);
            label5.setBounds(50,440,150,00200);
            label5.setFont(new Font("Arial Black",Font.PLAIN,12));

            label6 = new JLabel("<html>DIGITAL WATCH<br/>PRICE : 3000</html>");
            label6.setForeground(Color.white);
            label6.setBounds(255,440,150,00200);
            label6.setFont(new Font("Arial Black",Font.PLAIN,12));

            label7 = new JLabel("<html>SONY PLAYSTATION 4<br/>PRICE : 39000</html>");
            label7.setForeground(Color.white);
            label7.setBounds(455,440,150,00200);
            label7.setFont(new Font("Arial Black",Font.PLAIN,12));

            label8 = new JLabel("<html>ADIDAS SNEAKERS<br/>PRICE : 8999</html>");
            label8.setForeground(Color.white);
            label8.setBounds(657,430,150,00200);
            label8.setFont(new Font("Arial Black",Font.PLAIN,12));

            frame.add(inventory);
            frame.add(cartButton);
            frame.add(panel1);
            frame.add(panel2);
            frame.add(panel3);
            frame.add(panel4);
            frame.add(panel5);
            frame.add(panel6);
            frame.add(panel7);
            frame.add(panel8);
            frame.add(label1);
            frame.add(label2);
            frame.add(label3);
            frame.add(label4);
            frame.add(label5);
            frame.add(label6);
            frame.add(label7);
            frame.add(label8);

            frame.add(backGround);

        }


    protected void inventory_display() {
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

        public static void main(String[] args) {
           new inventory();
        }

    }

