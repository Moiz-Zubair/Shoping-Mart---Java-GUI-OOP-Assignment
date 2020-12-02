package Shopping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Outlet {
    JFrame outlet_frame;
    JPanel onlinePanel;
    JLabel label_1;
    JLabel backGround;
    JLabel City_selected;
    JButton Login_Button;
    JComboBox city_selected;
    ImageIcon img;

    Outlet(){

        //Font
        Font f = new Font("Wide Latin",Font.BOLD,20);

        // HEADER
        onlinePanel = new JPanel();
        onlinePanel.setBounds(90,70,500,40);
        onlinePanel.setBackground(new Color(207,201,186,100));

        //background
        img = new ImageIcon("Images\\frontpage.jpg");
        backGround = new JLabel("",img,SwingConstants.CENTER);
        backGround.setBounds(0,0,700,600);

        //HEADING
        label_1 = new JLabel();
        label_1.setText("Outlet");
        label_1.setBounds(300,50,150,50);
        label_1.setBackground(Color.yellow);
        label_1.setFont(f);

        //Frame
        outlet_frame = new JFrame("STORE ASSIGNMENT");
        outlet_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outlet_frame.setSize(700, 600);

        //Username
        City_selected =new JLabel("Select City: ");
        City_selected.setFont(new Font("Arial",Font.BOLD,16));
        City_selected.setForeground(Color.black);
        City_selected.setBounds(250,220,100,30);

        String[] cities = { "Islamabad", "Karachi", "Lahore", "Multan", "Peshawar","Rawalpindi"};

        city_selected = new JComboBox(cities);
        city_selected.setBounds(350,220,105,45);
        city_selected.setSelectedIndex(0);

        city_selected.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                outlet_frame.setVisible(false);
                inventory I1 = new inventory();
                I1.inventory_display();
            }
        });


        //Buttons
        Login_Button = new JButton("Back");
        Login_Button.setBounds(275,450,150,25);
        Login_Button.setBackground(Color.gray);

        backGround.add(city_selected);
        backGround.add(Login_Button);
        backGround.add(City_selected);
        backGround.add(onlinePanel);
        onlinePanel.add(label_1);
        outlet_frame.add(backGround);

        //ActionListener for login button
        Login_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                outlet_frame.setVisible(false);
                Store S1 = new Store();
                S1.home_dispaly();
            }
        });


        Outlet_display();

    }
    public void Outlet_display(){
        outlet_frame.setLocationRelativeTo(null);
        outlet_frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Outlet();
    }
}