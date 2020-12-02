package Shopping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cash {

    JFrame Cash_frame;
    JPanel CashPanel;
    JLabel label_3;
    JLabel Payment;
    JLabel amount;
    JTextArea Payment_text;
    JTextField amount_text;
    JLabel backGround;
    JButton proceed_payment;
    ImageIcon img;
    JButton back;
    public static double payment;
    public static double amount_pay;

    Cash(){
        //font
        Font f = new Font("Wide Latin",Font.BOLD,20);

        // HEADER
        CashPanel = new JPanel();
        CashPanel.setBounds(90, 70, 500, 40);
        CashPanel.setBackground(new Color(207, 201, 186, 100));

        //background
        img = new ImageIcon("Images\\payment.jpg");
        backGround = new JLabel("",img,SwingConstants.CENTER);
        backGround.setBounds(0,0,700,600);

        //HEADING
        label_3 = new JLabel();
        label_3.setText("Cash Payment");
        label_3.setBounds(300, 50, 150, 50);
        label_3.setBackground(Color.yellow);
        label_3.setFont(f);

        //Frame
        Cash_frame = new JFrame("STORE ASSIGNMENT");
        Cash_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Cash_frame.setSize(700, 600);

        //Username
        Payment =new JLabel("Enter Amount to be paid:");
        Payment.setBounds(125,200,150,30);
        Payment.setForeground(Color.white);
        Payment_text = new JTextArea();
        Payment_text.setBorder(BorderFactory.createLineBorder(Color.black));
        Payment_text.setBounds(350,200,120,20);

        //Password
        amount=new JLabel("Total Amount:");
        amount.setForeground(Color.white);
        amount.setBounds(125,250, 100,30);

        //x = new JTextField("");
        //count1 =22;
        //String s1 = new Integer(count1).toString();
        //x.setText(s1);

        amount_text = new JTextField("");
        amount_pay = Cart.total;
        amount_text.setText(String.valueOf(amount_pay));
        amount_text.setBorder(BorderFactory.createLineBorder(Color.black));
        amount_text.setBounds(350,250,120,20);

        //Account Creation Button
        proceed_payment = new JButton("Proceed to Payment");
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
        backGround.add(CashPanel);
        CashPanel.add(label_3);
        Cash_frame.add(backGround);

        //Visibility of frame


        //ActionListener for Create account button
        proceed_payment.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                payment = (float) Double.parseDouble(Payment_text.getText());
                double change = Double.parseDouble(Payment_text.getText()) - amount_pay;
                if(payment>=amount_pay)
                {
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "AMOUNT PAID  RS: " + payment + " \nBALANCE  RS : " + change+"\n\tTHANKYOU FOR SHOPPING WITH US ", "Payment Successful", JOptionPane.INFORMATION_MESSAGE); //+ change after $ sign
                    Cash_frame.setVisible(false);
                }
                else{

                    final JPanel panel_false = new JPanel();
                    JOptionPane.showMessageDialog(panel_false, "Please Enter Correct Amount", "Error", JOptionPane.ERROR_MESSAGE);
                    Cash_frame.setVisible(true);
                }
            }
        });

        //ActionListener for Back button
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Cash_frame.setVisible(false);
                PaymentMethods P1 = new PaymentMethods();
                P1.Display();
            }
        });

        //amount = amount_text.get;
        display_Cash();
    }

    public void display_Cash(){
        Cash_frame.setLocationRelativeTo(null);
        Cash_frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Cash();
    }
}