package BoundaryUI;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

import Entitity.User;

public class GuestDashScreen extends JFrame implements Strategy {
    private JLabel adText;
    private JButton backButton;
    private JPanel backgroundPanel;
    private JLabel contText;
    private JButton continueButton;
    private JLabel headerText;
    private JPanel line;
    private JButton registerButton;
    private User user;
    
    public GuestDashScreen(User user) {
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
        registerButton = new JButton();
        backButton = new JButton();
        contText = new JLabel();
        adText = new JLabel();
        continueButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinemopolis");
        setBackground(new Color(0, 0, 0));
        setResizable(false);

        backgroundPanel.setBackground(Color.black);

        headerText.setFont(new Font("Nirmala UI", 1, 48)); 
        headerText.setForeground(Color.white);
        headerText.setText("Welcome Guest!");
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

        registerButton.setBackground(new Color(221, 5, 37));
        registerButton.setFont(new Font("Dubai", 1, 20)); 
        registerButton.setForeground(Color.white);
        registerButton.setText("Register Now!");
        registerButton.setBorderPainted(false);
        registerButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        backButton.setBackground(new Color(221, 5, 37));
        backButton.setFont(new Font("Dubai", 1, 14)); 
        backButton.setForeground(Color.white);
        backButton.setText("Back");
        backButton.setBorderPainted(false);

        contText.setIcon(new ImageIcon(getClass().getResource("/resources/text2.png"))); 
        contText.setText("jLabel1");

        adText.setIcon(new ImageIcon(getClass().getResource("/resources/text.png"))); 
        adText.setText("jLabel1");

        continueButton.setBackground(new Color(221, 5, 37));
        continueButton.setFont(new Font("Dubai", 1, 20)); 
        continueButton.setForeground(Color.white);
        continueButton.setText("Find a Theatre");
        continueButton.setBorderPainted(false);
        continueButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(headerText))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(line, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(adText, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(contText, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(continueButton, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(registerButton, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(headerText))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(contText, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(continueButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(adText, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(registerButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(55, Short.MAX_VALUE))))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );


        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });


        continueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }                      

    private void registerButtonActionPerformed(ActionEvent evt) {                                               
        dispose();
        RegisterScreen rs = new RegisterScreen();
    }                                              

    private void backButtonActionPerformed(ActionEvent evt) {                                           
        dispose();
        HomeScreen.main(null); 
    }                                          

    private void continueButtonActionPerformed(ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                                          
}
