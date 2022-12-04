package UI;
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
        setTitle("Cinemopolis");
        setBackground(Color.black);
        setName("Frame Top"); 
        setResizable(false);

        backgroundPanel.setBackground(Color.black);

        theaterName.setFont(new Font("Dubai Light", 0, 48)); 
        theaterName.setForeground(Color.white);
        theaterName.setText("Cinemopolis");

        icon.setIcon(new ImageIcon(getClass().getResource("/resources/popcorn.png")));

        registerButton.setBackground(new Color(221, 5, 37));
        registerButton.setFont(new Font("Dubai", 1, 18)); 
        registerButton.setForeground(Color.white);
        registerButton.setText("Register");
        registerButton.setBorderPainted(false);

        cancellationButton.setBackground(Color.black);
        cancellationButton.setFont(new Font("Dubai Light", 0, 18));
        cancellationButton.setForeground(Color.white);
        cancellationButton.setText("Cancellation");
        cancellationButton.setContentAreaFilled(false);

        loginButton.setBackground(Color.black);
        loginButton.setFont(new Font("Dubai Light", 0, 18));
        loginButton.setForeground(Color.white);
        loginButton.setText("Login");
        loginButton.setContentAreaFilled(false);

        GroupLayout barUpLayout = new GroupLayout(barUp);
        barUp.setLayout(barUpLayout);
        barUpLayout.setHorizontalGroup(
            barUpLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        barUpLayout.setVerticalGroup(
            barUpLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        GroupLayout barDownLayout = new GroupLayout(barDown);
        barDown.setLayout(barDownLayout);
        barDownLayout.setHorizontalGroup(
            barDownLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        barDownLayout.setVerticalGroup(
            barDownLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        textFindYou.setFont(new Font("Dubai Light", 0, 32)); 
        textFindYou.setForeground(Color.white);
        textFindYou.setText("Find your");

        textAdventure.setFont(new Font("Nirmala UI", 1, 32));
        textAdventure.setForeground(new Color(221, 5, 37));
        textAdventure.setText("adventure");

        textBrowseOur.setFont(new Font("Dubai Light", 0, 32));
        textBrowseOur.setForeground(Color.white);
        textBrowseOur.setText("Browse our");

        textCatelogue.setFont(new Font("Nirmala UI", 1, 32));
        textCatelogue.setForeground(Color.white);
        textCatelogue.setText("catalogue");

        blackPanther.setIcon(new ImageIcon(getClass().getResource("/resources/wakanda.jpg"))); 

        buttonFindTheater.setBackground(new Color(221, 5, 37));
        buttonFindTheater.setFont(new Font("Nirmala UI", 1, 24)); 
        buttonFindTheater.setForeground(new Color(255, 255, 255));
        buttonFindTheater.setText("Find a theater");
        buttonFindTheater.setBorderPainted(false);

        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(24, 46, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(textFindYou)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAdventure, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(icon, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(theaterName))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(textBrowseOur)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textCatelogue, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
                    .addComponent(barDown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(barUp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(cancellationButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registerButton))
                    .addComponent(blackPanther, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonFindTheater, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(cancellationButton)
                            .addComponent(loginButton)
                            .addComponent(registerButton))
                        .addGap(41, 41, 41)
                        .addComponent(blackPanther, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonFindTheater, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.LEADING, backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(theaterName))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(icon)))
                        .addGap(48, 48, 48)
                        .addComponent(barUp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textFindYou, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAdventure))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textBrowseOur, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCatelogue))
                        .addGap(18, 18, 18)
                        .addComponent(barDown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
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

        buttonFindTheater.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonFindTheaterActionPerformed(evt);
            }
        });

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        cancellationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancellationButtonActionPerformed(evt);
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

    private void cancellationButtonActionPerformed(ActionEvent evt) {                                                   
        dispose();
        CancelScreen cs = new CancelScreen();
    }                                                  

    private void loginButtonActionPerformed(ActionEvent evt) {
        dispose();                                            
        LoginScreen ls = new LoginScreen();
    }                                           

    private void buttonFindTheaterActionPerformed(ActionEvent evt) {                                                  
        dispose();
        DashboardScreen ds = new DashboardScreen(null);
        ds.performStrategy();
    }                                                 

    public static void main(String args[]) {
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
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen();
            }
        });
    }       
}
