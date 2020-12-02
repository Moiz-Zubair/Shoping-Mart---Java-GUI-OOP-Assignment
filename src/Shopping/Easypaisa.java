package Shopping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Easypaisa {

    JFrame easypaisa_frame;
    JPanel easypaisaPanel;
    JLabel label_3;
    JLabel accountholderName;
    JTextArea accountholderName_text;
    JLabel mobilenumber;
    JTextArea mobilenumber_text;
    JLabel pinnumber;
    JLabel reconfirm_pinnumber;
    JPasswordField pinnumber_text;
    JPasswordField reconfirm_pinnumber_text;
    JLabel backGround;
    JLabel Payment;
    JTextArea Payment_text;
    JLabel amount;
    JTextField amount_text;
    JButton pay;
    JButton back;
    public static String Owner  ;
    public static String Pin ;
    public static String Rpin;
    public double mobile_number;
    public double max_digits = 10000000000.0;
    public double min_digits = 999999999.0;
    public static double payment;
    public static double amount_pay;
    ImageIcon img;

    Easypaisa(){

        //font
        Font f = new Font("Wide Latin",Font.BOLD,20);

        // HEADER
        easypaisaPanel = new JPanel();
        easypaisaPanel.setBounds(90, 70, 500, 40);
        easypaisaPanel.setBackground(new Color(207, 201, 186, 100));

        //background
        img = new ImageIcon("Images\\payment.jpg");
        backGround = new JLabel("",img,SwingConstants.CENTER);
        backGround.setBounds(0,0,700,600);

        //HEADING
        label_3 = new JLabel();
        label_3.setText("Easy Paisa/ Jazz Cash");
        label_3.setBounds(300, 50, 150, 50);
        label_3.setBackground(Color.yellow);
        label_3.setFont(f);

        //Frame
        easypaisa_frame = new JFrame("STORE ASSIGNMENT");
        easypaisa_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        easypaisa_frame.setSize(700, 600);

        //Owner Name

        accountholderName =new JLabel("Account Owner Name: ");
        accountholderName.setBounds(175,150,150,30);
        accountholderName.setForeground(Color.white);
        accountholderName_text = new JTextArea();
        accountholderName_text.setBorder(BorderFactory.createLineBorder(Color.black));
        accountholderName_text.setBounds(325,150,120,20);

        //Mobile Number
        mobilenumber=new JLabel("Enter Mobile Number:");
        mobilenumber.setForeground(Color.white);
        mobilenumber.setBounds(175,200, 150,30);
        mobilenumber_text = new JTextArea();
        mobilenumber_text.setBorder(BorderFactory.createLineBorder(Color.black));
        mobilenumber_text.setBounds(325,200,120,20);

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

        //Username
        Payment =new JLabel("Enter Amount to be paid:");
        Payment.setBounds(175,350, 150,30);
        Payment.setForeground(Color.white);
        Payment_text = new JTextArea();
        Payment_text.setBorder(BorderFactory.createLineBorder(Color.black));
        Payment_text.setBounds(325,350,120,20);

        //Password
        amount=new JLabel("Total Amount:");
        amount.setBounds(175,400, 100,30);
        amount.setForeground(Color.white);
        amount_pay = Cart.total;
        amount_text = new JTextField("");
        amount_text.setText(String.valueOf(amount_pay));
        amount_text.setBorder(BorderFactory.createLineBorder(Color.black));
        amount_text.setBounds(325,400,120,20);

        //Account Creation Button
        pay = new JButton("Pay");
        pay.setBounds(250,450,150,35);

        //back Button
        back = new JButton("Back");
        back.setBounds(550,500,75,35);

        //Adding assets to the frame
        backGround.add(pay);
        backGround.add(back);
        backGround.add(accountholderName);
        backGround.add(accountholderName_text);
        backGround.add(mobilenumber);
        backGround.add(mobilenumber_text);
        backGround.add(pinnumber);
        backGround.add(pinnumber_text);
        backGround.add(reconfirm_pinnumber_text);
        backGround.add(reconfirm_pinnumber);
        backGround.add(Payment);
        backGround.add(Payment_text);
        backGround.add(amount);
        backGround.add(amount_text);
        backGround.add(easypaisaPanel);
        easypaisaPanel.add(label_3);
        easypaisa_frame.add(backGround);

        //ActionListener for Create account button
        pay.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {

                {
                    Owner = accountholderName_text.getText();
                    Pin = String.valueOf(pinnumber_text.getPassword());
                    Rpin = String.valueOf(reconfirm_pinnumber_text.getPassword());
                    mobile_number = Double.parseDouble(mobilenumber_text.getText());
                    if(mobile_number > min_digits && mobile_number < max_digits) {
                        if (Pin.equals(Rpin))
                        {
                            payment = (float) Double.parseDouble(Payment_text.getText());
                            double change = Double.parseDouble(Payment_text.getText()) - amount_pay;
                            if(payment>amount_pay)
                            {
                                final JPanel panel = new JPanel();
                                JOptionPane.showMessageDialog(panel, "Proceed to Payment", "Sucessful", JOptionPane.INFORMATION_MESSAGE);
                                final JPanel panel1 = new JPanel();
                                JOptionPane.showMessageDialog(panel1, "$" + payment + " has been cut from paid cash and your change is  $" + change, "Payment Successful", JOptionPane.INFORMATION_MESSAGE); //+ change after $ sign
                                easypaisa_frame.setVisible(false);
                            }
                            else
                            {
                                final JPanel panel_false = new JPanel();
                                JOptionPane.showMessageDialog(panel_false, "Please Enter Correct Amount", "Error", JOptionPane.ERROR_MESSAGE);
                                easypaisa_frame.setVisible(true);
                            }
                        }
                        else
                        {
                            final JPanel panel_false = new JPanel();
                            JOptionPane.showMessageDialog(panel_false, "Pin Numbers Do not Match", "Error", JOptionPane.ERROR_MESSAGE);
                            easypaisa_frame.setVisible(true);
                            easypaisa_display();
                        }
                    }
                    else{
                        final JPanel panel_false = new JPanel();
                        JOptionPane.showMessageDialog(panel_false, "Mobile Number Not Valid", "Error", JOptionPane.ERROR_MESSAGE);
                        easypaisa_frame.setVisible(true);
                        easypaisa_display();
                    }
                }
            }
        });

        //ActionListener for Back button
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                easypaisa_frame.setVisible(false);
                PaymentMethods P1 = new PaymentMethods();
                P1.Display();
            }
        });
        //display
        easypaisa_display();
    }

    public void easypaisa_display(){
        easypaisa_frame.setLocationRelativeTo(null);
        easypaisa_frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Easypaisa();
    }
}