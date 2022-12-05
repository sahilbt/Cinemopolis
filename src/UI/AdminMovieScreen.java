package UI;

import javax.swing.*;

import Controllers.MovieController;
import Entitity.User;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminMovieScreen extends JFrame {
    private JButton addButton;
    private JButton backButton;
    private JPanel backgroundPanel;
    private JTextField movieInput;
    private JLabel headText;
    private JLabel infoText;
    private JPanel line;
    private JLabel movieText;
    private JButton removeButton;
    private User user;
               
    public AdminMovieScreen(User user) {
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
        movieInput = new JTextField();
        movieText = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinemopolis");
        setBackground(new Color(0, 0, 0));
        setResizable(false);

        backgroundPanel.setBackground(Color.black);

        headText.setFont(new Font("Nirmala UI", 1, 48)); 
        headText.setForeground(Color.white);
        headText.setText("Manage Movies");
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
        infoText.setText("Enter a Movie name to either add or remove it");

        backButton.setBackground(new Color(221, 5, 37));
        backButton.setFont(new Font("Dubai", 1, 14)); // NOI18N
        backButton.setForeground(Color.white);
        backButton.setText("Back");
        backButton.setBorderPainted(false);

        movieInput.setBackground(new Color(77, 77, 77));
        movieInput.setFont(new Font("Dubai", 0, 18)); // NOI18N
        movieInput.setForeground(Color.white);
        movieInput.setBorder(BorderFactory.createEtchedBorder());
        movieInput.setSelectionColor(new Color(77, 77, 77));

        movieText.setBackground(Color.black);
        movieText.setFont(new Font("Dubai", 0, 18)); // NOI18N
        movieText.setForeground(Color.white);
        movieText.setText("Movie Name");

        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(headText))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(line, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(removeButton, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(infoText)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(movieText))))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(movieInput, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(headText))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infoText, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(movieText, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(movieInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
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
        String name = movieInput.getText();

        if(name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a movie name","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        
        
        MovieController mc = new MovieController();

        if(!mc.checkMovieInDB(name)){
            mc.postMovie(name);
        }else{
            JOptionPane.showMessageDialog(this, "This movie already exists in our database!","Error!", JOptionPane.PLAIN_MESSAGE);
            return; 
        }
        mc.closeControl();
        JOptionPane.showMessageDialog(this, "Movie had been added to the database","Error!", JOptionPane.PLAIN_MESSAGE);
                                      
    }                                         

    private void removeButtonActionPerformed(ActionEvent evt) {   
        String name = movieInput.getText();

        if(name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a movie name","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        
        MovieController mc = new MovieController();

        if(mc.checkMovieInDB(name)){
            mc.delMovie(name);
        }else{
            JOptionPane.showMessageDialog(this, "This movie doesn't exist in our database!","Error!", JOptionPane.PLAIN_MESSAGE);
            return; 
        }
        

        mc.closeControl();

        JOptionPane.showMessageDialog(this, "Movie had been removed to the database","Error!", JOptionPane.PLAIN_MESSAGE);
        
    }                                            

    private void backButtonActionPerformed(ActionEvent evt) { 
        dispose();
        DashboardScreen ds = new DashboardScreen(user);      
        ds.performStrategy();                                    
    }                                          
}