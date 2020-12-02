package Shopping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class payment_Card {

    JFrame Cardpayment_frame;
    JPanel CardpaymentPanel;
    JLabel label_3;
    JLabel Payment;
    JLabel amount;
    JTextArea Payment_text;
    JTextField amount_text;
    JLabel backGround;
    JButton proceed_payment;
    JButton back;
    public String pay;
    public static double payment;
    public  static double amount_pay;
    ImageIcon img;

    payment_Card(){
        //font
        Font f = new Font("Wide Latin",Font.BOLD,20);

        // HEADER
        CardpaymentPanel = new JPanel();
        CardpaymentPanel.setBounds(90, 70, 500, 40);
        CardpaymentPanel.setBackground(new Color(207, 201, 186, 100));

        //background
        img = new ImageIcon("Images\\payment.jpg");
        backGround = new JLabel("",img,SwingConstants.CENTER);
        backGround.setBounds(0,0,700,600);

        //HEADING
        label_3 = new JLabel();
        label_3.setText("Credit Card Payment");
        label_3.setBounds(300, 50, 150, 50);
        label_3.setBackground(Color.yellow);
        label_3.setFont(f);

        //Frame
        Cardpayment_frame = new JFrame("STORE ASSIGNMENT");
        Cardpayment_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Cardpayment_frame.setSize(700, 600);

        //Username
        Payment =new JLabel("Enter Amount to be paid:");
        Payment.setBounds(125,200,150,30);
        Payment.setForeground(Color.white);
        Payment_text = new JTextArea();
        Payment_text.setBorder(BorderFactory.createLineBorder(Color.black));
        Payment_text.setBounds(350,200,120,20);
        pay = Payment_text.getText();


        //Paid amount
        amount=new JLabel("Total Amount:");
        amount.setBounds(125,250, 100,30);
        amount.setForeground(Color.white);

        //x = new JTextField("");
        //count1 =22;
        //String s1 = new Integer(count1).toString();
        //x.setText(s1);

        amount_pay = Cart.total;
        amount_text = new JTextField("");
        amount_text.setText(String.valueOf(amount_pay));
        amount_text.setBorder(BorderFactory.createLineBorder(Color.black));
        amount_text.setBounds(350,250,120,20);

        //Account Creation Button
        proceed_payment = new JButton("Pay");
        proceed_payment.setBounds(250,400,150,35);

        //back Button
        back = new JButton("Back");
        back.setBounds(550,500,75,35);

        //Adding assets to the frame
        backGround.add(proceed_payment);
        backGround.add(back);
        backGround.add(Payment);
        backGround.add(Payment_text);
        backGround.add(amount);
        backGround.add(amount_text);
        backGround.add(CardpaymentPanel);
        CardpaymentPanel.add(label_3);
        Cardpayment_frame.add(backGround);

        //ActionListener for Create account button
        proceed_payment.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {

                payment = (float) Double.parseDouble(Payment_text.getText());
                double change = Double.parseDouble(Payment_text.getText()) - amount_pay;
                if(payment>amount_pay)
                {
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "Proceed to Payment", "Sucessful", JOptionPane.INFORMATION_MESSAGE);
                    final JPanel panel1 = new JPanel();
                    JOptionPane.showMessageDialog(panel1, "$" + payment + " has been cut from paid cash and your change is  $" + change, "Payment Successful", JOptionPane.INFORMATION_MESSAGE); //+ change after $ sign
                    Cardpayment_frame.setVisible(false);
                }
                else
                {
                    final JPanel panel_false = new JPanel();
                    JOptionPane.showMessageDialog(panel_false, "Please Enter Correct Amount", "Error", JOptionPane.ERROR_MESSAGE);
                    Cardpayment_frame.setVisible(true);
                }
            }

        });

        //ActionListener for Back button
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Cardpayment_frame.setVisible(false);
                PaymentMethods P1 = new PaymentMethods();
                P1.Display();
            }
        });

        display_paymentCard();
    }

    public void display_paymentCard(){
        Cardpayment_frame.setLocationRelativeTo(null);
        Cardpayment_frame.setVisible(true);
    }
    public static void main(String[] args) {
        new payment_Card();
    }
}