package BoundaryUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeScreen extends JFrame {

    private JPanel backgroundPanel;
    private JPanel barDown;
    private JPanel barUp;
    private JLabel blackPanther;
    private JButton buttonFindTheater;
    private JButton cancellationButton;
    private JLabel icon;
    private JButton loginButton;
    private JButton registerButton;
    private JLabel textAdventure;
    private JLabel textBrowseOur;
    private JLabel textCatelogue;
    private JLabel textFindYou;
    private JLabel theaterName;    

    public HomeScreen() {
        initComponents();
    }
                       
    private void initComponents() {
        backgroundPanel = new JPanel();
        theaterName = new JLabel();
        icon = new JLabel();
        registerButton = new JButton();
        cancellationButton = new JButton();
        loginButton = new JButton();
        barUp = new JPanel();
        barDown = new JPanel();
        textFindYou = new JLabel();
        textAdventure = new JLabel();
        textBrowseOur = new JLabel();
        textCatelogue = new JLabel();
        blackPanther = new JLabel();
        buttonFindTheater = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.black);
        setName("Frame Top"); 
        setResizable(false);

        backgroundPanel.setBackground(Color.black);

        theaterName.setFont(new Font("Dubai Light", 0, 48)); 
        theaterName.setForeground(Color.white);
        theaterName.setText("Cinemopolis");

        icon.setIcon(new ImageIcon("popcornIcon.png")); 
        icon.setText("jLabel3");

        registerButton.setBackground(new Color(221, 5, 37));
        registerButton.setFont(new Font("Dubai", 1, 18)); 
        registerButton.setForeground(Color.white);
        registerButton.setText("Register");
        registerButton.setBorderPainted(false);
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        cancellationButton.setBackground(java.awt.Color.black);
        cancellationButton.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        cancellationButton.setForeground(java.awt.Color.white);
        cancellationButton.setText("Cancellation");
        cancellationButton.setContentAreaFilled(false);
        cancellationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancellationButtonActionPerformed(evt);
            }
        });

        loginButton.setBackground(java.awt.Color.black);
        loginButton.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        loginButton.setForeground(java.awt.Color.white);
        loginButton.setText("Login");
        loginButton.setContentAreaFilled(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barUpLayout = new javax.swing.GroupLayout(barUp);
        barUp.setLayout(barUpLayout);
        barUpLayout.setHorizontalGroup(
            barUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        barUpLayout.setVerticalGroup(
            barUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barDownLayout = new javax.swing.GroupLayout(barDown);
        barDown.setLayout(barDownLayout);
        barDownLayout.setHorizontalGroup(
            barDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );
        barDownLayout.setVerticalGroup(
            barDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        textFindYou.setFont(new java.awt.Font("Dubai Light", 0, 32)); // NOI18N
        textFindYou.setForeground(java.awt.Color.white);
        textFindYou.setText("Find your");

        textAdventure.setFont(new java.awt.Font("Nirmala UI", 1, 32)); // NOI18N
        textAdventure.setForeground(new java.awt.Color(221, 5, 37));
        textAdventure.setText("adventure");

        textBrowseOur.setFont(new java.awt.Font("Dubai Light", 0, 32)); // NOI18N
        textBrowseOur.setForeground(java.awt.Color.white);
        textBrowseOur.setText("Browse our");

        textCatelogue.setFont(new java.awt.Font("Nirmala UI", 1, 32)); // NOI18N
        textCatelogue.setForeground(java.awt.Color.white);
        textCatelogue.setText("catalogue");

        blackPanther.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Downloads\\eeee.jpg")); // NOI18N
        blackPanther.setText("jLabel8");

        buttonFindTheater.setBackground(new java.awt.Color(221, 5, 37));
        buttonFindTheater.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        buttonFindTheater.setForeground(new java.awt.Color(255, 255, 255));
        buttonFindTheater.setText("Find a theater");
        buttonFindTheater.setBorderPainted(false);
        buttonFindTheater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFindTheaterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(24, 46, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(textFindYou)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAdventure, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(theaterName))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(textBrowseOur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textCatelogue, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(barDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(cancellationButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registerButton))
                    .addComponent(blackPanther, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonFindTheater, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancellationButton)
                            .addComponent(loginButton)
                            .addComponent(registerButton))
                        .addGap(41, 41, 41)
                        .addComponent(blackPanther, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonFindTheater, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(theaterName))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(icon)))
                        .addGap(48, 48, 48)
                        .addComponent(barUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFindYou, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAdventure))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textBrowseOur, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCatelogue))
                        .addGap(18, 18, 18)
                        .addComponent(barDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        backgroundPanel.getAccessibleContext().setAccessibleName("background panel");
        backgroundPanel.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>                        

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void cancellationButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void buttonFindTheaterActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }       
}
