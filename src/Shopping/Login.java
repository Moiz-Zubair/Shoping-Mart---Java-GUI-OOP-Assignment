package Shopping;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Login {
    JFrame Login_frame;
    JPanel LoginPanel;
    JLabel label_2;
    JLabel userName;
    JLabel password;
    JTextArea userName_text;
    JPasswordField password_text;
    JLabel backGround;
    JButton proceed;
    ImageIcon img;
    JButton back;
    protected ArrayList<String> UserNames = new ArrayList(Arrays.asList("moiz","effi"));
    protected ArrayList<String> Passwords = new ArrayList(Arrays.asList("8096","123"));
    protected String login_username;
    protected String login_password;

    Login() {
        //font
        Font f = new Font("Wide Latin",Font.BOLD,20);

        // HEADER
        LoginPanel = new JPanel();
        LoginPanel.setBounds(90, 70, 500, 40);
        LoginPanel.setBackground(new Color(207, 201, 186, 100));

        //background
        img = new ImageIcon("Images\\login.jpg");
        backGround = new JLabel("",img,SwingConstants.CENTER);
        backGround.setBounds(0,0,700,600);

        //HEADING
        label_2 = new JLabel();
        label_2.setText("Login");
        label_2.setBounds(300, 50, 150, 50);
        label_2.setBackground(Color.yellow);
        label_2.setFont(f);

        //Frame
        Login_frame = new JFrame("STORE ASSIGNMENT");
        Login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Login_frame.setSize(700, 600);

        //Username
        userName =new JLabel("User Name: ");
        userName.setForeground(Color.white);
        userName.setFont(new Font("Arial",Font.BOLD,14));
        userName.setBounds(200,250,100,30);
        userName_text = new JTextArea();
        userName_text.setBorder(BorderFactory.createLineBorder(Color.black));
        userName_text.setBounds(300,250,120,30);

        //Password
        password=new JLabel("Password:");
        password.setBounds(200,300, 100,30);
        password.setFont(new Font("Arial",Font.BOLD,14));
        password.setForeground(Color.white);
        password_text = new JPasswordField();
        password_text.setBorder(BorderFactory.createLineBorder(Color.black));
        password_text.setBounds(300,300,120,30);

        //Proceed Button
        proceed = new JButton("Submit");
        proceed.setBounds(315,350,75,35);
        proceed.setBackground(Color.gray);

        //back Button
        back = new JButton("Back");
        back.setBounds(550,500,75,35);
        back.setBackground(Color.gray);

        //Adding assets to the frame
        backGround.add(back);
        backGround.add(proceed);
        backGround.add(userName);
        backGround.add(userName_text);
        backGround.add(password);
        backGround.add(password_text);
        backGround.add(LoginPanel);
        LoginPanel.add(label_2);
        Login_frame.add(backGround);

        //Visibility of frame
        display_login();

        proceed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                {
                    UserNames.add(SignUp.U);
                    Passwords.add(SignUp.P);


                    login_username = userName_text.getText();
                    login_password = String.valueOf(password_text.getPassword());

                    if(UserNames.contains(login_username) && Passwords.contains(login_password))
                    {
                        final JPanel panel_true = new JPanel();
                        JOptionPane.showMessageDialog(panel_true, "Login Sucessfull", "Sucessful", JOptionPane.INFORMATION_MESSAGE);
                        Login_frame.setVisible(false);
                        inventory I1 = new inventory();
                        I1.inventory_display();
                    }
                    else
                    {
                        final JPanel panel_false = new JPanel();
                        JOptionPane.showMessageDialog(panel_false, "Login Unsucessfull", "Error", JOptionPane.ERROR_MESSAGE);
                        Login_frame.setVisible(true);
                    }
                }
            }
        });

        //ActionListener for Back button
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Login_frame.setVisible(false);
                Online o1 = new Online();
                o1.Display();
            }
        });
    }

    protected void display_login(){
        Login_frame.setLocationRelativeTo(null);
        Login_frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}