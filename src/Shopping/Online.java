package Shopping;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Online {




        JFrame frame_online;
        JPanel onlinePanel;
        JLabel label_1;
        JLabel backGround;
        JButton Login_Button;
        JButton Signup_Button;
        JButton Storedetails_Button;
        JButton Back_Button;
        ImageIcon img;

        Online(){

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
            label_1.setText("Online Form");
            label_1.setBounds(300,50,150,50);
            label_1.setBackground(Color.yellow);
            label_1.setFont(f);

            //Frame
            frame_online = new JFrame("STORE ASSIGNMENT");
            frame_online.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame_online.setSize(700, 600);

            //Buttons
            Login_Button = new JButton("Login");
            Login_Button.setBounds(275,200,150,80);
            Login_Button.setBackground(new Color(123,144,149));

            Signup_Button = new JButton("Sign Up");
            Signup_Button.setBounds(275,300,150,80);
            Signup_Button.setBackground(new Color(123,144,149));

            Storedetails_Button = new JButton("Our Message");
            Storedetails_Button.setBounds(275,400,150,80);
            Storedetails_Button.setBackground(new Color(123,144,149));
            Storedetails_Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame_online.setVisible(false);
                    Store_details S2 = new Store_details();
                    S2.details_dispaly();
                }
            });

            Back_Button = new JButton("Back To Home Page");
            Back_Button.setBounds(450,500,150,40);
            Back_Button.setBackground(Color.gray);


            backGround.add(Login_Button);
            backGround.add(Signup_Button);
            backGround.add(Storedetails_Button);
            backGround.add(Back_Button);
            backGround.add(onlinePanel);
            onlinePanel.add(label_1);
            frame_online.add(backGround);

            //ActionListener for login button
            Login_Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    frame_online.setVisible(false);
                    Login L1 = new Login();
                    L1.display_login();
                }
            });

            //ActionListener for Sign up button
            Signup_Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    frame_online.setVisible(false);
                    SignUp S1 = new SignUp();
                    S1.display_Signup();

                }
            });

            //ActionListener for Store Details button
            Storedetails_Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                   // frame_online.setVisible(false);
                   // Store_details S2 = new Store_details();
                    //S2.details_display();
                }
            });

            //ActionListener for Back button
            Back_Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    frame_online.setVisible(false);
                    Store s1 = new Store();
                    s1.home_dispaly();
                }
            });

        }

        protected void Display(){
            frame_online.setLocationRelativeTo(null);
            frame_online.setVisible(true);
        }
        public static void main(String[] args) {
            new Online();
        }
    }
