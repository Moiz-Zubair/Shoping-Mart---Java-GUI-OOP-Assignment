package Shopping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Store   {
    JFrame frame;
    JPanel homePanel;
    JLabel welLabel;
    ImageIcon img;
    JLabel backGround;
    JButton onlineButton;
    JButton outletButton;


    Store(){
        //FONT
        Font f = new Font("Wide Latin",Font.BOLD,20);
        // HEADER
        homePanel = new JPanel();
        homePanel.setBounds(90,70,500,40);
        homePanel.setBackground(new Color(207,201,186,100));


        //HEADING
        welLabel = new JLabel();
        welLabel.setText("WELCOME TO OUR STORE ");
        welLabel.setBounds(100,50,150,50);
        welLabel.setBackground(Color.yellow);
        welLabel.setFont(f);





         frame = new JFrame("STORE ASSIGNMENT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 600);
        //background

         img = new ImageIcon("Images\\frontpage.jpg");
         backGround = new JLabel("",img,SwingConstants.CENTER);
         backGround.setBounds(0,0,700,600);



         //BUTTONS
        onlineButton = new JButton(new ImageIcon("Images\\buttonon.png"));
        onlineButton.setBounds(120,250,150,60);

        outletButton = new JButton(new ImageIcon("Images\\buttonout.png"));
        outletButton.setBounds(120,320,150,60);

        //ActionListener
        outletButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.setVisible(false);
                 Outlet o1 = new Outlet();
                 o1.Outlet_display();

            }
        });

        onlineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.setVisible(false);
                Online o1 = new Online();
                o1.Display();
            }
        });




        backGround.add(onlineButton);
        backGround.add(outletButton);
        backGround.add(homePanel);
        homePanel.add(welLabel);
        frame.add(backGround);


        home_dispaly();
    }

    protected void home_dispaly(){
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Store();
    }



}






