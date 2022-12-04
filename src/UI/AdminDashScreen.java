package UI;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.*;

import Controllers.TheatreController;
import Entitity.Theatre;
import Entitity.User;

public class AdminDashScreen extends JFrame implements Strategy{
    private JPanel backgroundPanel;
    private JLabel headText;
    private JLabel infoText;
    private JPanel line3;
    private JButton logoutButton;
    private JButton movieButton;
    private JLabel movieText;
    private JButton userButton;
    private JLabel userText;
    private User user;

    public AdminDashScreen(User user) {
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

        backgroundPanel = new JPanel();
        headText = new JLabel();
        line3 = new JPanel();
        userButton = new JButton();
        movieButton = new JButton();
        userText = new JLabel();
        movieText = new JLabel();
        logoutButton = new JButton();
        infoText = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinemopolis");
        setBackground(new Color(0, 0, 0));
        setResizable(false);

        backgroundPanel.setBackground(Color.black);

        headText.setFont(new Font("Nirmala UI", 1, 48)); 
        headText.setForeground(Color.white);
        headText.setText("Admin Settings");
        headText.setToolTipText("");

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

        userButton.setBackground(new Color(221, 5, 37));
        userButton.setFont(new Font("Dubai", 1, 20)); 
        userButton.setForeground(Color.white);
        userButton.setText("Users");
        userButton.setBorderPainted(false);
        userButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        movieButton.setBackground(new Color(221, 5, 37));
        movieButton.setFont(new Font("Dubai", 1, 20)); 
        movieButton.setForeground(Color.white);
        movieButton.setText("Movies");
        movieButton.setBorderPainted(false);
        movieButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        userText.setBackground(Color.black);
        userText.setFont(new Font("Dubai", 0, 18));
        userText.setForeground(Color.white);
        userText.setText("Manage all Users");

        movieText.setBackground(Color.black);
        movieText.setFont(new Font("Dubai", 0, 18)); 
        movieText.setForeground(Color.white);
        movieText.setText("Manage all Movies");

        logoutButton.setBackground(new Color(221, 5, 37));
        logoutButton.setFont(new Font("Dubai", 1, 20));
        logoutButton.setForeground(Color.white);
        logoutButton.setText("Log Out");
        logoutButton.setBorderPainted(false);
        logoutButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));


        infoText.setBackground(Color.black);
        infoText.setFont(new Font("Dubai", 0, 18));
        infoText.setForeground(Color.white);
        infoText.setText("Add/Remove Users or Movies");

        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(headText))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(infoText))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addComponent(userButton, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(movieButton, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(logoutButton, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(userText)
                                .addGap(155, 155, 155)
                                .addComponent(movieText))
                            .addComponent(line3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(headText)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infoText, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(userText, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addComponent(movieText, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(movieButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addComponent(userButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(logoutButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );


        userButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                userButtonActionPerformed(evt);
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        movieButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                movieButtonActionPerformed(evt);
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }                     

    private void userButtonActionPerformed(ActionEvent evt) {                                           

    }                                          

    private void movieButtonActionPerformed(ActionEvent evt) {                                            

    }                                           

    private void logoutButtonActionPerformed(ActionEvent evt) {                                             
        dispose();
        HomeScreen.main(null); 
    }                                                     
}
