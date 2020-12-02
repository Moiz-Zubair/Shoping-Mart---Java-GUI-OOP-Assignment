package Shopping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp {

    JFrame Signup_frame;
    JPanel SignupPanel;
    JLabel label_3;
    JLabel userName;
    JLabel password;
    JLabel confirm_password;
    JTextArea userName_text;
    JPasswordField password_text;
    JPasswordField confirm_password_text;
    JLabel backGround;
    JButton create_account;
    JButton back;
    ImageIcon img;
    public static String U  ;
    public static String P ;
    public static String PR;


    SignUp(){
        //font
        Font f = new Font("Wide Latin",Font.BOLD,20);

        // HEADER
        SignupPanel = new JPanel();
        SignupPanel.setBounds(90, 70, 500, 40);
        SignupPanel.setBackground(new Color(207, 201, 186, 100));

        //background
        img = new ImageIcon("Images\\login.jpg");
        backGround = new JLabel("",img,SwingConstants.CENTER);
        backGround.setBounds(0,0,700,600);

        //HEADING
        label_3 = new JLabel();
        label_3.setText("Create An Account");
        label_3.setBounds(300, 50, 150, 50);
        label_3.setBackground(Color.yellow);
        label_3.setFont(f);

        //Frame
        Signup_frame = new JFrame("STORE ASSIGNMENT");
        Signup_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Signup_frame.setSize(700, 600);

        //Username
        userName =new JLabel("User Name: ");
        userName.setForeground(Color.white);
        userName.setFont(new Font("Arial",Font.BOLD,14));
        userName.setBounds(200,210,100,30);
        userName_text = new JTextArea();
        userName_text.setBorder(BorderFactory.createLineBorder(Color.black));
        userName_text.setBounds(350,210,120,20);

        //Password
        password=new JLabel("Password:");
        password.setForeground(Color.white);
        password.setFont(new Font("Arial",Font.BOLD,14));
        password.setBounds(200,250, 100,30);
        password_text = new JPasswordField();
        password_text.setBorder(BorderFactory.createLineBorder(Color.black));
        password_text.setBounds(350,250,120,20);

        //Reconfirm Password
        confirm_password=new JLabel("Confirm Password:");
        confirm_password.setForeground(Color.white);
        confirm_password.setFont(new Font("Arial",Font.BOLD,14));
        confirm_password.setBounds(200,290, 150,30);
        confirm_password_text = new JPasswordField();
        confirm_password_text.setBorder(BorderFactory.createLineBorder(Color.black));
        confirm_password_text.setBounds(350,290,120,20);

        //Account Creation Button
        create_account = new JButton("Create Account");
        create_account.setBounds(280,350,150,35);
        create_account.setBackground(Color.gray);

        //back Button
        back = new JButton("Back");
        back.setBounds(550,500,75,35);
        back.setBackground(Color.gray);

        //Adding assets to the frame
        backGround.add(create_account);
        backGround.add(back);
        backGround.add(userName);
        backGround.add(userName_text);
        backGround.add(password);
        backGround.add(password_text);
        backGround.add(confirm_password);
        backGround.add(confirm_password_text);
        backGround.add(SignupPanel);
        SignupPanel.add(label_3);
        Signup_frame.add(backGround);

        //Visibility of frame
        display_Signup();

        //ActionListener for Create account button
        create_account.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {

                {
                    U = userName_text.getText();
                    P = String.valueOf(password_text.getPassword());
                    PR = String.valueOf(confirm_password_text.getPassword());

                    if (P.equals(PR))
                    {
                        final JPanel panel = new JPanel();
                        JOptionPane.showMessageDialog(panel, "Account Sucessfully created!!!", "Sucessful", JOptionPane.INFORMATION_MESSAGE);
                        Signup_frame.setVisible(false);
                        Login L1 = new Login();
                        L1.display_login();
                    }
                    else
                    {
                        final JPanel panel_false = new JPanel();
                        JOptionPane.showMessageDialog(panel_false, "Passwords Does not Match", "Error", JOptionPane.ERROR_MESSAGE);
                        Signup_frame.setVisible(true);
                        display_Signup();
                    }
                }
            }
        });

        //ActionListener for Back button
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Signup_frame.setVisible(false);
                Online o1 = new Online();
                o1.Display();
            }
        });

        U = userName_text.getText();
        P = String.valueOf(password_text.getPassword());
    }

    public void display_Signup(){
        Signup_frame.setLocationRelativeTo(null);
        Signup_frame.setVisible(true);
    }
    public static void main(String[] args) {
        new SignUp();
    }
}