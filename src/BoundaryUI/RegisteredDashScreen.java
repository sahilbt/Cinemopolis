package BoundaryUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

import Entitity.User;

import java.awt.*;

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

        backgroundPanel3.setBackground(java.awt.Color.black);

        headerText3.setFont(new java.awt.Font("Nirmala UI", 1, 48)); 
        headerText3.setForeground(java.awt.Color.white);
        headerText3.setText("My Account");
        headerText3.setToolTipText("");

        line3.setMaximumSize(new java.awt.Dimension(0, 2));
        line3.setMinimumSize(new java.awt.Dimension(0, 2));

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

        changeButrton.setBackground(new java.awt.Color(221, 5, 37));
        changeButrton.setFont(new java.awt.Font("Dubai", 1, 20)); 
        changeButrton.setForeground(java.awt.Color.white);
        changeButrton.setText("Change Payment");
        changeButrton.setBorderPainted(false);
        changeButrton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        continueButton.setBackground(new java.awt.Color(221, 5, 37));
        continueButton.setFont(new java.awt.Font("Dubai", 1, 20)); 
        continueButton.setForeground(java.awt.Color.white);
        continueButton.setText("Find a Theatre");
        continueButton.setBorderPainted(false);
        continueButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        accountText.setBackground(java.awt.Color.black);
        accountText.setFont(new java.awt.Font("Dubai", 0, 18)); 
        accountText.setForeground(java.awt.Color.white);
        accountText.setText("Account Settings");

        accountText1.setBackground(java.awt.Color.black);
        accountText1.setFont(new java.awt.Font("Dubai", 0, 18)); 
        accountText1.setForeground(java.awt.Color.white);
        accountText1.setText("Continue to Theatre Selection");

        logoutButton.setBackground(new java.awt.Color(221, 5, 37));
        logoutButton.setFont(new java.awt.Font("Dubai", 1, 20));
        logoutButton.setForeground(java.awt.Color.white);
        logoutButton.setText("Log Out");
        logoutButton.setBorderPainted(false);
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        accountText2.setBackground(java.awt.Color.black);
        accountText2.setFont(new java.awt.Font("Dubai", 0, 18)); 
        accountText2.setForeground(java.awt.Color.white);
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

        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        changeButrton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButrtonActionPerformed(evt);
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }                    

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        dispose();
        HomeScreen.main(null); 
    }                                            

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void changeButrtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                                          
}