package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import Controllers.TheatreController;
import Entitity.Theatre;
import Entitity.User;


public class RegisteredDashScreen extends JFrame implements Strategy{
    private User user;
    private JLabel accountText;
    private JLabel accountText1;
    private JLabel accountText2;
    private JPanel backgroundPanel3;
    private JButton changeButrton;
    private JButton continueButton;
    private JLabel headerText3;
    private JPanel line3;
    private JButton logoutButton;   


    public RegisteredDashScreen(User user) {
        this.user = user;
    }

    @Override                        
    public void initComponents() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }  

        backgroundPanel3 = new JPanel();
        headerText3 = new JLabel();
        line3 = new JPanel();
        changeButrton = new JButton();
        continueButton = new JButton();
        accountText = new JLabel();
        accountText1 = new JLabel();
        logoutButton = new JButton();
        accountText2 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinemopolis");
        setBackground(new Color(0, 0, 0));
        setResizable(false);

        backgroundPanel3.setBackground(Color.black);

        headerText3.setFont(new Font("Nirmala UI", 1, 48)); 
        headerText3.setForeground(Color.white);
        headerText3.setText("My Account");
        headerText3.setToolTipText("");

        line3.setMaximumSize(new Dimension(0, 2));
        line3.setMinimumSize(new Dimension(0, 2));

        GroupLayout line3Layout = new GroupLayout(line3);
        line3.setLayout(line3Layout);
        line3Layout.setHorizontalGroup(
            line3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );
        line3Layout.setVerticalGroup(
            line3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        changeButrton.setBackground(new Color(221, 5, 37));
        changeButrton.setFont(new Font("Dubai", 1, 20)); 
        changeButrton.setForeground(Color.white);
        changeButrton.setText("Change Payment");
        changeButrton.setBorderPainted(false);
        changeButrton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        continueButton.setBackground(new Color(221, 5, 37));
        continueButton.setFont(new Font("Dubai", 1, 20)); 
        continueButton.setForeground(Color.white);
        continueButton.setText("Find a Theatre");
        continueButton.setBorderPainted(false);
        continueButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        accountText.setBackground(Color.black);
        accountText.setFont(new Font("Dubai", 0, 18)); 
        accountText.setForeground(Color.white);
        accountText.setText("Account Settings");

        accountText1.setBackground(Color.black);
        accountText1.setFont(new Font("Dubai", 0, 18)); 
        accountText1.setForeground(Color.white);
        accountText1.setText("Continue to Theatre Selection");

        logoutButton.setBackground(new Color(221, 5, 37));
        logoutButton.setFont(new Font("Dubai", 1, 20));
        logoutButton.setForeground(Color.white);
        logoutButton.setText("Log Out");
        logoutButton.setBorderPainted(false);
        logoutButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        accountText2.setBackground(Color.black);
        accountText2.setFont(new Font("Dubai", 0, 18)); 
        accountText2.setForeground(Color.white);
        accountText2.setText("Welcome to your Account!");

        GroupLayout backgroundPanel3Layout = new GroupLayout(backgroundPanel3);
        backgroundPanel3.setLayout(backgroundPanel3Layout);
        backgroundPanel3Layout.setHorizontalGroup(
            backgroundPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel3Layout.createSequentialGroup()
                .addGroup(backgroundPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanel3Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(accountText)
                        .addGap(127, 127, 127)
                        .addComponent(accountText1))
                    .addGroup(backgroundPanel3Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(line3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanel3Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(headerText3))
                    .addGroup(backgroundPanel3Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(accountText2))
                    .addGroup(backgroundPanel3Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(changeButrton, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(continueButton, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanel3Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(logoutButton, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        backgroundPanel3Layout.setVerticalGroup(
            backgroundPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(headerText3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(accountText2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(accountText1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanel3Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(accountText, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(continueButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeButrton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(logoutButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backgroundPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        continueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        changeButrton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                changeButrtonActionPerformed(evt);
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }                    

    private void logoutButtonActionPerformed(ActionEvent evt) {                                             
        dispose();
        HomeScreen.main(null); 
    }                                            

    private void continueButtonActionPerformed(ActionEvent evt) {     
        TheatreController tc = new TheatreController();
        ArrayList<Theatre> theatres = tc.getTheatreInfo();
        tc.closeControl();
        dispose();
        TheatreScreen ts = new TheatreScreen(theatres, this.user);
    }                                              

    private void changeButrtonActionPerformed(ActionEvent evt) {                                              
        dispose();
        UserUpdateScreen us = new UserUpdateScreen(user);
    }                                                          
}