package carems.gui;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;


class MainMenuPanel extends JPanel {
    private final Dimension panelSize = new Dimension(800,600);
    private final Color clrAshGrey = new Color(42, 42, 42);    
    private final Color clrMagmaOrange = new Color(255, 127, 39);
    
    MainMenuPanel(){
        this.setPreferredSize(panelSize);
        this.setBackground(clrAshGrey);   
    }
    
    // Paint lines in the panel.
    @Override
    public void paint(Graphics g) { 
        
        Graphics2D line1 = (Graphics2D) g;
        Graphics2D line2 = (Graphics2D) g;
        line1.setColor(clrMagmaOrange);
        line2.setColor(clrMagmaOrange);
        line1.drawLine(200, 200, 0, 200);
        line2.drawLine(200, 0, 200, 800);
    }
}

public class MainMenu extends JFrame implements ActionListener {
    
    private final MainMenuPanel panel;
    private final ImageIcon logoPic = new ImageIcon("CaremsLogoPic.png");
    private final JLabel lblCarems, caremsLogo;
    private final JButton btnBookingDetail, btnCar, btnOwner, btnCustomer, 
            btnLogout;
    
    // Add color.
    private final Color clrAshGrey = new Color(42, 42, 42);    
    private final Color clrMagmaOrange = new Color(255, 127, 39);
    
    // Init. fonts.
    private final Font fntHeader = new Font("League Spartan", Font.BOLD, 30); 
    private final Font fntDefault = new Font("League Spartan", Font.BOLD, 12);
    
    public MainMenu(){  

        panel = new MainMenuPanel();
        
        lblCarems = new JLabel();
        lblCarems.setText("CAREMS");
        lblCarems.setBounds(30, 125, 500, 100);
        lblCarems.setForeground(clrMagmaOrange);
        lblCarems.setFont(fntHeader);
        
        caremsLogo = new JLabel();
        caremsLogo.setBounds(-5, -5, 200, 200);
        caremsLogo.setIcon(logoPic);
        
        btnBookingDetail = new JButton("BOOKING DETAILS");
        btnBookingDetail.setBounds(0, 300, 200, 30);
        btnBookingDetail.setBackground(clrMagmaOrange);
        btnBookingDetail.setFont(fntDefault);
        btnBookingDetail.addActionListener(MainMenu.this);
        
        btnCustomer = new JButton("CUSTOMER");
        btnCustomer.setBounds(0, 340, 200, 30);
        btnCustomer.setBackground(clrMagmaOrange);
        btnCustomer.setFont(fntDefault);
        btnCustomer.addActionListener(MainMenu.this);
        
        btnCar = new JButton("CARS");
        btnCar.setBounds(0, 380, 200, 30);
        btnCar.setBackground(clrMagmaOrange);
        btnCar.setFont(fntDefault);
        btnCar.addActionListener(MainMenu.this);
        
        btnOwner = new JButton("OWNER");
        btnOwner.setBounds(0, 420, 200, 30);
        btnOwner.setBackground(clrMagmaOrange);
        btnOwner.setFont(fntDefault);
        btnOwner.addActionListener(MainMenu.this);
        
        btnLogout = new JButton("LOGOUT");
        btnLogout.setBounds(0, 550, 200, 30);
        btnLogout.setBackground(clrMagmaOrange);
        btnLogout.setFont(fntDefault);
        btnLogout.addActionListener(MainMenu.this);
        
        // Set MainMenu properties.
        this.setTitle("Carems - Car Rental Management System");
        this.setSize(800,600);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        this.add(lblCarems);
        this.add(caremsLogo);
        this.add(btnBookingDetail);
        this.add(btnCustomer);
        this.add(btnCar);
        this.add(btnOwner);
        this.add(btnLogout);
        this.add(panel);
        this.pack();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        this.setBackground(clrAshGrey);
           
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnCustomer){
        }
        else if(e.getSource() == btnBookingDetail){
        
        }
        else if(e.getSource() == btnCar){
            CarMenu carMenu = new CarMenu();
        }
        else if(e.getSource() == btnOwner){
        }
        else if(e.getSource() == btnLogout){
        }
    }
}
