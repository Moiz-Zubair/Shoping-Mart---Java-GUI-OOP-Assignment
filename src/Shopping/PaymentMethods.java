package Shopping;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentMethods {
    JFrame method_frame;
    JPanel methodPanel;
    JLabel label_1;
    JLabel backGround;
    JButton Card;
    JButton Card_option;
    JButton Cash;
    JButton Cash_option;
    JButton Easypaisa;
    JButton Easypaisa_option;
    JButton Back_Button;
    ImageIcon img;

    PaymentMethods(){

        //Font
        Font f = new Font("Wide Latin",Font.BOLD,20);

        // HEADER
        methodPanel = new JPanel();
        methodPanel.setBounds(90,70,500,50);
        methodPanel.setBackground(new Color(207,201,186,100));

        //background
        img = new ImageIcon("Images\\payment.jpg");
        backGround = new JLabel("",img,SwingConstants.CENTER);
        backGround.setBounds(0,0,700,600);

        //HEADING
        label_1 = new JLabel();
        label_1.setText("Payment Methods");
        label_1.setBounds(300,50,150,50);
        label_1.setBackground(Color.yellow);
        label_1.setFont(f);

        //Frame
        method_frame = new JFrame("STORE ASSIGNMENT");
        method_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        method_frame.setSize(700, 600);

        //Buttons
        Card = new JButton("Credit Card");
        Card.setBounds(75,300,110,50);

        Card_option = new JButton(new ImageIcon("Images\\Card.png"));
        Card_option.setBounds(75,200,110,85);

        Cash = new JButton("Cash");
        Cash.setBounds(300,300,110,50);

        Cash_option = new JButton(new ImageIcon("Images\\Cash.png"));
        Cash_option.setBounds(300,200,110,85);

        Easypaisa = new JButton("Mobile Wallet");
        Easypaisa.setBounds(525,300,110,50);

        Easypaisa_option = new JButton(new ImageIcon("Images\\Easypaisa.png"));
        Easypaisa_option.setBounds(525,200,110,85);;

        Back_Button = new JButton("Back To Cart");
        Back_Button.setBounds(300,400,110,50);


        backGround.add(Card);
        backGround.add(Card_option);
        backGround.add(Cash);
        backGround.add(Cash_option);
        backGround.add(Easypaisa);
        backGround.add(Easypaisa_option);
       // backGround.add(Back_Button);
        backGround.add(methodPanel);
        methodPanel.add(label_1);
        method_frame.add(backGround);

        //ActionListener for login button
        Card.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                method_frame.setVisible(false);
                Card Cd1 = new Card();
                Cd1.Card_display();
            }
        });

        //ActionListener for Sign up button
        Cash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                method_frame.setVisible(false);
                Cash Cs1 = new Cash();
                Cs1.display_Cash();

            }
        });

        //ActionListener for Store Details button
        Easypaisa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                method_frame.setVisible(false);
                Easypaisa E1 = new Easypaisa();
                //E1.Easypaisa_display();
            }
        });


        Display();
    }

    protected void Display(){
        method_frame.setLocationRelativeTo(null);
        method_frame.setVisible(true);
    }
    public static void main(String[] args) {
        new PaymentMethods();
    }
}