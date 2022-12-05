package UI;

import javax.swing.*;

import Entitity.User;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminUserScreen extends JFrame {
    private JButton addButton;
    private JButton backButton;
    private JPanel backgroundPanel;
    private JTextField couponInput;
    private JLabel headText;
    private JLabel infoText;
    private JLabel infoText1;
    private JPanel line;
    private JLabel movieText;
    private JButton removeButton;   
    private User user;


    public AdminUserScreen(User user) {
        this.user = user;
        initComponents();
    }
                   
    private void initComponents() {
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
        line = new JPanel();
        addButton = new JButton();
        removeButton = new JButton();
        infoText = new JLabel();
        backButton = new JButton();
        couponInput = new JTextField();
        movieText = new JLabel();
        infoText1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinemopolis");
        setBackground(new Color(0, 0, 0));
        setResizable(false);

        backgroundPanel.setBackground(Color.black);

        headText.setFont(new Font("Nirmala UI", 1, 48)); // NOI18N
        headText.setForeground(Color.white);
        headText.setText("Manage Users");
        headText.setToolTipText("");

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

        addButton.setBackground(new Color(221, 5, 37));
        addButton.setFont(new Font("Dubai", 1, 20)); // NOI18N
        addButton.setForeground(Color.white);
        addButton.setText("Add");
        addButton.setBorderPainted(false);
        addButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));


        removeButton.setBackground(new Color(221, 5, 37));
        removeButton.setFont(new Font("Dubai", 1, 20)); // NOI18N
        removeButton.setForeground(Color.white);
        removeButton.setText("Remove");
        removeButton.setBorderPainted(false);
        removeButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));


        infoText.setBackground(Color.black);
        infoText.setFont(new Font("Dubai", 0, 18)); // NOI18N
        infoText.setForeground(Color.white);
        infoText.setText("Enter an email to remove a user");

        backButton.setBackground(new Color(221, 5, 37));
        backButton.setFont(new Font("Dubai", 1, 14)); // NOI18N
        backButton.setForeground(Color.white);
        backButton.setText("Back");
        backButton.setBorderPainted(false);

        couponInput.setBackground(new Color(77, 77, 77));
        couponInput.setFont(new Font("Dubai", 0, 18)); // NOI18N
        couponInput.setForeground(Color.white);
        couponInput.setBorder(BorderFactory.createEtchedBorder());
        couponInput.setSelectionColor(new Color(77, 77, 77));

        movieText.setBackground(Color.black);
        movieText.setFont(new Font("Dubai", 0, 18)); // NOI18N
        movieText.setForeground(Color.white);
        movieText.setText("User Email");

        infoText1.setBackground(Color.black);
        infoText1.setFont(new Font("Dubai", 0, 18)); // NOI18N
        infoText1.setForeground(Color.white);
        infoText1.setText("To add a user, click 'Add' to prompt the registration page");

        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(headText))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(line, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(couponInput, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(movieText))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(removeButton, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
                        .addGap(117, 117, 117)
                        .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(infoText))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(infoText1)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(headText)
                        .addGap(5, 5, 5)))
                .addComponent(line, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoText, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(infoText1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(movieText, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(couponInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }                       

    private void addButtonActionPerformed(ActionEvent evt) {                                          
    }                                         

    private void removeButtonActionPerformed(ActionEvent evt) {                                             
    }                                            

    private void backButtonActionPerformed(ActionEvent evt) {      
        dispose();
        DashboardScreen ds = new DashboardScreen(user);                                           
    }                                                      
}
