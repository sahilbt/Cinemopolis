package BoundaryUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

import Entitity.User;

import java.awt.*;

public class RegisteredDashScreen extends JFrame implements Strategy{
    private JLabel accountText;
    private JLabel accountText1;
    private JLabel accountText2;
    private JPanel backgroundPanel;
    private JButton changeButrton;
    private JButton continueButton;
    private JLabel headerText;
    private JPanel line;
    private JButton logoutButton;
    private User user;

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


        backgroundPanel = new JPanel();
        headerText = new JLabel();
        line = new JPanel();
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

        backgroundPanel.setBackground(Color.black);

        headerText.setFont(new Font("Nirmala UI", 1, 48)); // NOI18N
        headerText.setForeground(Color.white);
        headerText.setText("My Account");
        headerText.setToolTipText("");

        line.setMaximumSize(new Dimension(0, 2));
        line.setMinimumSize(new Dimension(0, 2));

        GroupLayout lineLayout = new GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        changeButrton.setBackground(new Color(221, 5, 37));
        changeButrton.setFont(new Font("Dubai", 1, 20)); // NOI18N
        changeButrton.setForeground(Color.white);
        changeButrton.setText("Change Payment");
        changeButrton.setBorderPainted(false);
        changeButrton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        changeButrton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                changeButrtonActionPerformed(evt);
            }
        });

        continueButton.setBackground(new Color(221, 5, 37));
        continueButton.setFont(new Font("Dubai", 1, 20)); // NOI18N
        continueButton.setForeground(Color.white);
        continueButton.setText("Find a Theatre");
        continueButton.setBorderPainted(false);
        continueButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        continueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        accountText.setBackground(Color.black);
        accountText.setFont(new Font("Dubai", 0, 18)); // NOI18N
        accountText.setForeground(Color.white);
        accountText.setText("Account Settings");

        accountText1.setBackground(Color.black);
        accountText1.setFont(new Font("Dubai", 0, 18)); // NOI18N
        accountText1.setForeground(Color.white);
        accountText1.setText("Continue to Theatre Selection");

        logoutButton.setBackground(new Color(221, 5, 37));
        logoutButton.setFont(new Font("Dubai", 1, 20)); // NOI18N
        logoutButton.setForeground(Color.white);
        logoutButton.setText("Log Out");
        logoutButton.setBorderPainted(false);
        logoutButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        accountText2.setBackground(Color.black);
        accountText2.setFont(new Font("Dubai", 0, 18)); // NOI18N
        accountText2.setForeground(Color.white);
        accountText2.setText("Welcome to your Account!");

        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(accountText)
                        .addGap(127, 127, 127)
                        .addComponent(accountText1))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(line, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(headerText))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(accountText2))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(changeButrton, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(continueButton, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(logoutButton, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(headerText)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(accountText2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(accountText1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(accountText, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(continueButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeButrton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(logoutButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                .addGap(548, 548, 548))
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
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backgroundPanel, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }                       

    private void changeButrtonActionPerformed(ActionEvent evt) {                                              

    }                                             

    private void continueButtonActionPerformed(ActionEvent evt) {                                               

    }                                              

    private void logoutButtonActionPerformed(ActionEvent evt) { 
        dispose();
        HomeScreen.main(null);                                             
    }                                                     
}