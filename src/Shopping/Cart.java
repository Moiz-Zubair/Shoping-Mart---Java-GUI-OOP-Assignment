package Shopping;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Cart {


    public  static double total = 0;
    JFrame frame;
    JLabel inventory;
    ImageIcon image;
    JLabel backGround;
    JPanel panel1;
    JPanel panel2;
    JTextArea transactions;
    JLabel records;
    JButton checkoutButton;
    JButton backButton;
    JButton removeButton;
    protected static ArrayList<String> name = new ArrayList<>();
    protected static ArrayList<Integer> price = new ArrayList<>();
    protected static ArrayList<Integer> quantity = new ArrayList<>();
   // public static double total ;





    Cart(ArrayList name, ArrayList price,ArrayList quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;


        addWidgets();
        setText();
        cart_display();



    }

    void addWidgets() {






        //BACKGROUNG
        image = new ImageIcon("Images\\newcart.jpg");
        backGround = new JLabel("", image, SwingConstants.CENTER);
        backGround.setBounds(0, 0, 1200, 900);

        //Buttons
        checkoutButton = new JButton("CHECK OUT");
        checkoutButton.setBounds(730, 600, 120, 35);
        checkoutButton.setBackground(new Color(50,205,50));

        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PaymentMethods P2= new PaymentMethods();
                frame.setVisible(false);
                P2.Display();

            }
        });

        backButton = new JButton("BACK");
        backButton.setBounds(730, 20, 120, 35);
        backButton.setBackground(new Color(3,132,250));

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total=0;
                inventory I2= new inventory();
                frame.setVisible(false);
                I2.inventory_display();
            }
        });


        removeButton = new JButton("REMOVE ITEM");
        removeButton.setBounds(730, 60, 120, 35);
        removeButton.setBackground(new Color(220,20,60));
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


               int remov= Integer.parseInt(JOptionPane.showInputDialog("Enter sr no of product you want to remove "));
               //int remov= Integer.valueOf(num);
                name.remove(remov-1);
                price.remove(remov-1);
                quantity.remove(remov-1);
                transactions.setText("");
               // totalPrice = totalPrice - (price.get(remov-1));
                total =0;
                setText();
               // System.out.println(totalPrice);

                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "ITEM REMOVED FROM THE CART", "Success", JOptionPane.INFORMATION_MESSAGE);


            }
        });

        //LABEL
        inventory = new JLabel();
        inventory.setText("CART");
        inventory.setBounds(350, -50, 800, 200);
        inventory.setForeground(Color.white);
        inventory.setFont(new Font("Algerian", Font.BOLD, 36));
        inventory.setBackground(Color.WHITE);

        records = new JLabel("TRANSACTION RECORDS");
        records.setFont(new Font("Arial Black", Font.BOLD, 16));
        records.setBounds(350, 40, 300, 250);


        //frame
        frame = new JFrame("STORE ASSIGNMENT");
        frame.setSize(900, 730);

        panel1 = new JPanel();
        panel1.setBounds(220, 180, 450, 400);
        panel1.setBackground(new Color(0, 0, 0, 0));


        //TEXTAREA
        transactions = new JTextArea(24, 35);
        transactions.setBounds(0, 0, 190, 240);
        transactions.setBackground(new Color(47,79,79));
        transactions.setForeground(Color.BLACK);
        transactions.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,12));

        frame.add(records);
        panel1.add(transactions);


        frame.add(inventory);
        frame.add(checkoutButton);
        frame.add(removeButton);
        frame.add(backButton);
        frame.add(panel1);


        frame.add(backGround);

    }
   /* public int total_price(){
        for(int i =0;i<name.size();i++);
        totalPrice+=price.get(0);
        return  totalPrice;

    */



    void setText(){
        transactions.setText("sr no  |    PRODUCT NAME    | Qtn. |  PRODUCT PRICE\n--------------------------------------------------------------------------\n");
        //  int length = name.size();
        for(int i=0;i<name.size();i++){
            int j = i+1;
            transactions.append( "  "+j +".         "+ name.get(i) +"        x  "+quantity.get(i)+"               RS."+ (price.get(i)*quantity.get(i))+"\n");
            transactions.append("--------------------------------------------------------------------------\n");
            total+=(price.get(i)*quantity.get(i));

        }
        transactions.append("TOTAL  PRICE\t\t    "  +"RS:"+ total);


    }

    protected void cart_display() {
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}

   /* public static void main(String[] args) {
        new Cart();
    }

}

    */