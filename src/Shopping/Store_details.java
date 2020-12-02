package Shopping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Store_details {

    JFrame details_frame;
    JPanel detailsPanel;
    JPanel details;
    JPanel details1;
    JLabel welLabel;
    JLabel bodylable;
    JLabel bodylable1;
    ImageIcon img;
    JLabel backGround;
    JButton backButton;


    Store_details(){
        //FONT
        Font f = new Font("Wide Latin",Font.BOLD,20);
        Font f_updated = new Font("Arial Black",Font.PLAIN,12);

        // HEADER
        detailsPanel = new JPanel();
        detailsPanel.setBounds(75,70,500,50);
        detailsPanel.setBackground(new Color(207,201,186,100));

        //Body
        details = new JPanel();
        details.setBounds(40,150,600,50);
        details.setBackground(new Color(207,201,186,100));

        details1 = new JPanel();
        details1.setBounds(40,200,600,50);
        details1.setBackground(new Color(207,201,186,100));

        //HEADING
        welLabel = new JLabel();
        welLabel.setText("Thanks For Choosing Us");
        welLabel.setBounds(75,50,150,50);
        welLabel.setBackground(Color.yellow);
        welLabel.setFont(f);

        //Body text
        bodylable = new JLabel();
        bodylable.setText("The Best Gift you could ever give someone is your time,");
        bodylable.setBounds(100,50,150,25);
        bodylable.setBackground(Color.gray);
        bodylable.setFont(f_updated);

        bodylable1 = new JLabel();
        bodylable1.setText("because you're giving them something that you will never get back");
        bodylable1.setBounds(100,75,150,25);
        bodylable1.setBackground(Color.gray);
        bodylable1.setFont(f_updated);

        details_frame = new JFrame("STORE ASSIGNMENT");
        details_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        details_frame.setSize(700, 600);
        //background

        img = new ImageIcon("Images\\frontpage.jpg");
        backGround = new JLabel("",img,SwingConstants.CENTER);
        backGround.setBounds(0,0,700,600);

        //BUTTONS
        //onlineButton = new JButton(new ImageIcon("C:\\Users\\HP\\Desktop\\button.png"));
        backButton = new JButton("Back");
        backButton.setBounds(250,450,150,60);


        //ActionListener
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                details_frame.setVisible(false);
                Online O1 = new Online();
                O1.Display();
            }
        });

        backGround.add(backButton);
        backGround.add(detailsPanel);
        backGround.add(details);
        backGround.add(details1);
        backGround.add(bodylable1);
        details1.add(bodylable1);
        details.add(bodylable);
        detailsPanel.add(welLabel);
        details_frame.add(backGround);

        details_dispaly();
    }

    public void details_dispaly(){
        details_frame.setLocationRelativeTo(null);
        details_frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Store_details();
    }

}