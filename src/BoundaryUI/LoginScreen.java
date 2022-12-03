package BoundaryUI;
import Controllers.*;
import Entitity.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginScreen extends JFrame {
    private JButton backButton;
    private JPanel backgroundPanel;
    private JLabel emailText;
    private JTextField emailTextbox;
    private JLabel headerText;
    private JPanel line;
    private JButton loginButton;
    private JLabel passwordText;
    private JPasswordField passwordTextbox;

    public LoginScreen() {
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
        headerText = new JLabel();
        line = new JPanel();
        passwordTextbox = new JPasswordField();
        emailTextbox = new JTextField();
        emailText = new JLabel();
        passwordText = new JLabel();
        loginButton = new JButton();
        backButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinemopolis");
        setBackground(new Color(0, 0, 0));
        setResizable(false);

        backgroundPanel.setBackground(Color.black);

        headerText.setFont(new Font("Nirmala UI", 1, 48)); 
        headerText.setForeground(Color.white);
        headerText.setText("Welcome Back!");
        headerText.setToolTipText("");

        line.setMaximumSize(new Dimension(0, 2));
        line.setMinimumSize(new Dimension(0, 2));
        line.setPreferredSize(new Dimension(0, 2));

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

        passwordTextbox.setBackground(new Color(77, 77, 77));
        passwordTextbox.setFont(new Font("Dubai", 0, 18)); 
        passwordTextbox.setForeground(Color.white);
        passwordTextbox.setBorder(BorderFactory.createEtchedBorder());
        passwordTextbox.setSelectionColor(new Color(77, 77, 77));

        emailTextbox.setBackground(new Color(77, 77, 77));
        emailTextbox.setFont(new Font("Dubai", 0, 18)); 
        emailTextbox.setForeground(Color.white);
        emailTextbox.setBorder(BorderFactory.createEtchedBorder());
        emailTextbox.setSelectionColor(new Color(77, 77, 77));

        emailText.setBackground(Color.black);
        emailText.setFont(new Font("Dubai", 0, 18)); 
        emailText.setForeground(Color.white);
        emailText.setText("Email");

        passwordText.setBackground(Color.black);
        passwordText.setFont(new Font("Dubai", 0, 18));
        passwordText.setForeground(Color.white);
        passwordText.setText("Password");

        loginButton.setBackground(new Color(221, 5, 37));
        loginButton.setFont(new Font("Dubai", 1, 20)); 
        loginButton.setForeground(Color.white);
        loginButton.setText("Log In");
        loginButton.setBorderPainted(false);
        loginButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        backButton.setBackground(new Color(221, 5, 37));
        backButton.setFont(new Font("Dubai", 1, 14)); 
        backButton.setForeground(Color.white);
        backButton.setText("Back");
        backButton.setBorderPainted(false);

        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(headerText))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(line, GroupLayout.PREFERRED_SIZE, 423, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(GroupLayout.Alignment.LEADING, backgroundPanelLayout.createSequentialGroup()
                            .addGap(204, 204, 204)
                            .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(emailTextbox, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(emailText))))
                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(passwordTextbox, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(passwordText))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
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
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(emailText, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(emailTextbox, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(passwordText, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(passwordTextbox, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
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

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }   
    
    

    private void loginButtonActionPerformed(ActionEvent evt) {   
        String usernameField = emailTextbox.getText();
        String passwordField = String.valueOf(passwordTextbox.getPassword());

        if(usernameField.isEmpty() || passwordField.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter BOTH your email and password >:(","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        LoginController lc = new LoginController();
        boolean userExists = lc.forwardUserCreds(usernameField, passwordField);
  
        if(!userExists){
            JOptionPane.showMessageDialog(this, "Incorrect username or password ","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        User foundUser = lc.findUserFromSingleton(usernameField);
        dispose();
        DashboardScreen ds = new DashboardScreen(foundUser);
        ds.performStrategy();
        
        


        // TODO add your handling code here:
    }                                           

    private void backButtonActionPerformed(ActionEvent evt) {                                           
        dispose();
        HomeScreen.main(null);
    }                                                                                           
}
