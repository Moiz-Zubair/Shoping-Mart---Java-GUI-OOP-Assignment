package Shopping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class removeItem   {
    JFrame frame;
    JLabel welLabel;
    JButton removeButton;
    JButton selectButton;
    JPanel homePanel;
    JComboBox cb;
    JLabel selectionLabel;
    String [] items;
    protected static ArrayList<String> name = new ArrayList<>();
    protected static ArrayList<Integer> price = new ArrayList<>();
    protected static ArrayList<Integer> quantity = new ArrayList<>();



    removeItem(ArrayList name,ArrayList price,ArrayList quantity) {
        this.name=name;
        this.price=price;
        this.quantity=quantity;



        items = new String[name.size()];
        for(int i =0;i<name.size();i++){
            items[i] = ((String) name.get(i) + "    Qtn:"+quantity.get(i));
        }


        //FONT
        Font f = new Font("Arial", Font.BOLD, 24);

        homePanel = new JPanel();
        homePanel.setBounds(0,0,300,300);
        homePanel.setBackground(Color.red);

        cb = new JComboBox(items);

        //HEADING
        welLabel = new JLabel();
        welLabel.setText("REMOVE ITEM");
        welLabel.setBounds(150, -50, 250, 50);
        welLabel.setBackground(Color.yellow);
        welLabel.setFont(f);


        frame = new JFrame("STORE ASSIGNMENT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        //background

        selectionLabel = new JLabel();

        selectionLabel.setBounds(150,200,250,50);
        selectionLabel.setBackground(Color.white);
        selectionLabel.setForeground(Color.white);
        selectionLabel.setHorizontalAlignment(JLabel.CENTER);
        selectionLabel.setText("jajaj");

        removeButton = new JButton("REMOVE");
        removeButton.setBounds(150,300,150,80);

        selectButton =new JButton("Select item to remove");
        selectButton.setBounds(200,300,150,80);








       // frame.add(homePanel);
        frame.add(welLabel);
        frame.add(selectionLabel);
        frame.add(cb);
        frame.add(selectButton);
        frame.add(removeButton);
        removeItem_display();
    }


    protected void removeItem_display(){
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
       // frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
      //  new removeItem();
    }



}

