package Shopping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Card {

    JFrame Card_frame;
    JPanel CardPanel;
    JLabel label_3;
    JLabel cardholderName;
    JTextArea cardholderName_text;
    JLabel cardnumber;
    JTextArea cardnumber_text;
    JLabel pinnumber;
    JLabel reconfirm_pinnumber;
    JPasswordField pinnumber_text;
    JPasswordField reconfirm_pinnumber_text;
    JLabel backGround;
    JButton proceed_payment;
    ImageIcon img;
    JButton back;
    public double card_number;
    public static String Owner;
    public static String Pin ;
    public static String Rpin;



    Card(){

        //font
        Font f = new Font("Wide Latin",Font.BOLD,20);

        // HEADER
        CardPanel = new JPanel();
        CardPanel.setBounds(90, 70, 500, 40);
        CardPanel.setBackground(new Color(207, 201, 186, 100));

        //background
        img = new ImageIcon("Images\\payment.jpg");
        backGround = new JLabel("",img,SwingConstants.CENTER);
        backGround.setBounds(0,0,700,600);

        //HEADING
        label_3 = new JLabel();
        label_3.setText("Credit Card Details");
        label_3.setBounds(300, 50, 150, 50);
        label_3.setBackground(Color.yellow);
        label_3.setFont(f);

        //Frame
        Card_frame = new JFrame("STORE ASSIGNMENT");
        Card_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Card_frame.setSize(700, 600);

        //Owner Name

        cardholderName =new JLabel("Owner Name: ");
        cardholderName.setBounds(175,150,150,30);
        cardholderName.setForeground(Color.white);
        cardholderName_text = new JTextArea();
        cardholderName_text.setBorder(BorderFactory.createLineBorder(Color.black));
        cardholderName_text.setBounds(325,150,120,20);

        //Card Number
        cardnumber=new JLabel("Enter Card Number:");
        cardnumber.setBounds(175,200, 150,30);
        cardnumber.setForeground(Color.white);
        cardnumber_text = new JTextArea();
        cardnumber_text.setBorder(BorderFactory.createLineBorder(Color.black));
        cardnumber_text.setBounds(325,200,120,20);

        //Pin Number
        pinnumber=new JLabel("Enter Pin Number:");
        pinnumber.setBounds(175,250, 150,30);
        pinnumber.setForeground(Color.white);
        pinnumber_text = new JPasswordField();
        pinnumber_text.setBorder(BorderFactory.createLineBorder(Color.black));
        pinnumber_text.setBounds(325,250,120,20);

        //Re-Confirm Pin Number:
        reconfirm_pinnumber=new JLabel("Re-Confirm Pin Number:");
        reconfirm_pinnumber.setBounds(175,300, 150,30);
        reconfirm_pinnumber.setForeground(Color.white);
        reconfirm_pinnumber_text = new JPasswordField();
        reconfirm_pinnumber_text.setBorder(BorderFactory.createLineBorder(Color.black));
        reconfirm_pinnumber_text.setBounds(325,300,120,20);

        //Account Creation Button
        proceed_payment = new JButton("Proceed to Payment");
        proceed_payment.setBounds(250,425,150,35);

        //back Button
        back = new JButton("Back");
        back.setBounds(550,500,75,35);

        //Adding assets to the frame
        backGround.add(proceed_payment);
        backGround.add(back);
        backGround.add(cardholderName);
        backGround.add(cardholderName_text);
        backGround.add(cardnumber);
        backGround.add(cardnumber_text);
        backGround.add(pinnumber);
        backGround.add(pinnumber_text);
        backGround.add(reconfirm_pinnumber_text);
        backGround.add(reconfirm_pinnumber);
        backGround.add(CardPanel);
        CardPanel.add(label_3);
        Card_frame.add(backGround);

        //ActionListener for Create account button
        proceed_payment.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {

                {
                    Owner = cardholderName_text.getText();
                    Pin = String.valueOf(pinnumber_text.getPassword());
                    Rpin = String.valueOf(reconfirm_pinnumber_text.getPassword());
                    card_number = Double.parseDouble(cardnumber_text.getText());
                    if (Pin.equals(Rpin))
                    {
                        final JPanel panel = new JPanel();
                        JOptionPane.showMessageDialog(panel, "Proceed to payment", "Sucessful", JOptionPane.INFORMATION_MESSAGE);
                        Card_frame.setVisible(false);
                        payment_Card Pc1 = new payment_Card();
                        Pc1.display_paymentCard();
                    }
                    else {
                        final JPanel panel_false = new JPanel();
                        JOptionPane.showMessageDialog(panel_false, "Pin Numbers Do not Match", "Error", JOptionPane.ERROR_MESSAGE);
                        Card_frame.setVisible(true);
                        Card_display(); }
                }
            }
        });

        //ActionListener for Back button
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Card_frame.setVisible(false);
                PaymentMethods P1 = new PaymentMethods();
                P1.Display();
            }
        });

        Card_display();
    }
    protected void Card_display(){
        Card_frame.setLocationRelativeTo(null);
        Card_frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Card();
    }
}