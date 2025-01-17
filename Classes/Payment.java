package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class Payment 
{
    JFrame frame;
	JPanel panel;
	ImageIcon image;
	JLabel imagelabel;
	JButton b1,b2,b3,b4,b5;
	
	Payment() 
	{

        frame = new JFrame();
        frame.setUndecorated(true);

        image = new ImageIcon("Image/logo.jpeg");
        frame.setIconImage(image.getImage());

        panel = new JPanel();
        panel.setBounds(0, 0,1000,700);
		panel.setBackground(new Color(186,85,211));

        imagelabel = new JLabel();
        imagelabel.setIcon(new ImageIcon("Image/paybg.png"));
        Dimension size = imagelabel.getPreferredSize();
        imagelabel.setBounds(0, 0, size.width, size.height);

        b1 = new JButton("X");
        b1.setBounds(960, 4, 30, 40);
        b1.setForeground(Color.white);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);

        b2 = new JButton("-");
        b2.setBounds(920, 4, 25, 30);
        b2.setForeground(Color.white);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);

        b3 = new JButton();
        b3.setIcon(new ImageIcon("Image/return.png"));
        b3.setBounds(15, 8, 35, 40);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);

        b4 = new JButton();
        b4.setIcon(new ImageIcon("Image/bkashbtn.jpg"));
        b4.setBounds(250,430,200,80);
        //b4.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusPainted(false);
        b4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b4.setContentAreaFilled(false);
		
		b5 = new JButton();
        b5.setIcon(new ImageIcon("Image/cardbtn.jpg"));
        b5.setBounds(550,430,200,80);
        //b5.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setFocusPainted(false);
        b5.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b5.setContentAreaFilled(false);
		
		frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
      
		
		frame.add(imagelabel);
        frame.add(panel);

        frame.setSize(1000,700);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
		
		
	
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b1) {
                    frame.setVisible(false);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b2) {
                    frame.setState(Frame.ICONIFIED);
                }

            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b3) {
                    new Plan();
                    frame.setVisible(false);
                }
            }
        });
        
		b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {
                    new BkashPayment();
                    frame.setVisible(false);
                }
            }
		});
		
		b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b5) {
                    new CardPayment();
                    frame.setVisible(false);
                }
            }
		});
		
    }
}
