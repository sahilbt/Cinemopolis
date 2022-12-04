package UI;
import java.awt.*;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.*;

import Controllers.LoginController;
import Entitity.PaymentInformation;
import Entitity.User;

public class UserUpdateScreen extends JFrame implements UI{
    private JButton backButton8;
    private JPanel backgroundPanel;
    private JTextField cardNumberInput;
    private JLabel cardNumberLabel1;
    private JTextField cvvInput;
    private JLabel cvvLabel;
    private JTextField expInput;
    private JLabel expLabel;
    private JLabel headerText;
    private JTextField nameInput;
    private JLabel nameLabel;
    private JPanel paymentLine;
    private JButton updateButton;
    private User user;
              

    public UserUpdateScreen(User user) {
        this.user = user;
        initComponents();
    }
                     
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
        backButton8 = new JButton();
        headerText = new JLabel();
        paymentLine = new JPanel();
        cvvInput = new JTextField();
        nameLabel = new JLabel();
        nameInput = new JTextField();
        expInput = new JTextField();
        cvvLabel = new JLabel();
        expLabel = new JLabel();
        cardNumberInput = new JTextField();
        updateButton = new JButton();
        cardNumberLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinemopolis");
        setBackground(new Color(0, 0, 0));
        setResizable(false);

        backgroundPanel.setBackground(Color.black);

        backButton8.setBackground(new Color(221, 5, 37));
        backButton8.setFont(new Font("Dubai", 1, 14)); // NOI18N
        backButton8.setForeground(Color.white);
        backButton8.setText("Back");
        backButton8.setBorderPainted(false);


        headerText.setFont(new Font("Nirmala UI", 1, 48)); // NOI18N
        headerText.setForeground(Color.white);
        headerText.setText("Update Information");
        headerText.setToolTipText("");

        paymentLine.setMaximumSize(new Dimension(0, 2));
        paymentLine.setMinimumSize(new Dimension(0, 2));

        GroupLayout paymentLineLayout = new GroupLayout(paymentLine);
        paymentLine.setLayout(paymentLineLayout);
        paymentLineLayout.setHorizontalGroup(
            paymentLineLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );
        paymentLineLayout.setVerticalGroup(
            paymentLineLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        cvvInput.setBackground(new Color(77, 77, 77));
        cvvInput.setFont(new Font("Dubai", 0, 18)); // NOI18N
        cvvInput.setForeground(Color.white);
        cvvInput.setBorder(BorderFactory.createEtchedBorder());
        cvvInput.setSelectionColor(new Color(77, 77, 77));

        nameLabel.setBackground(Color.black);
        nameLabel.setFont(new Font("Dubai", 0, 18)); // NOI18N
        nameLabel.setForeground(Color.white);
        nameLabel.setText("Name on Card");

        nameInput.setBackground(new Color(77, 77, 77));
        nameInput.setFont(new Font("Dubai", 0, 18)); // NOI18N
        nameInput.setForeground(Color.white);
        nameInput.setBorder(BorderFactory.createEtchedBorder());
        nameInput.setSelectionColor(new Color(77, 77, 77));

        expInput.setBackground(new Color(77, 77, 77));
        expInput.setFont(new Font("Dubai", 0, 18)); // NOI18N
        expInput.setForeground(Color.white);
        expInput.setBorder(BorderFactory.createEtchedBorder());
        expInput.setSelectionColor(new Color(77, 77, 77));

        cvvLabel.setBackground(Color.black);
        cvvLabel.setFont(new Font("Dubai", 0, 18)); // NOI18N
        cvvLabel.setForeground(Color.white);
        cvvLabel.setText("CVV");

        expLabel.setBackground(Color.black);
        expLabel.setFont(new Font("Dubai", 0, 18)); // NOI18N
        expLabel.setForeground(Color.white);
        expLabel.setText("Exp");

        cardNumberInput.setBackground(new Color(77, 77, 77));
        cardNumberInput.setFont(new Font("Dubai", 0, 18)); // NOI18N
        cardNumberInput.setForeground(Color.white);
        cardNumberInput.setBorder(BorderFactory.createEtchedBorder());
        cardNumberInput.setSelectionColor(new Color(77, 77, 77));

        updateButton.setBackground(new Color(221, 5, 37));
        updateButton.setFont(new Font("Dubai", 1, 20)); // NOI18N
        updateButton.setForeground(Color.white);
        updateButton.setText("Update");
        updateButton.setBorderPainted(false);
        updateButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));


        cardNumberLabel1.setBackground(Color.black);
        cardNumberLabel1.setFont(new Font("Dubai", 0, 18)); // NOI18N
        cardNumberLabel1.setForeground(Color.white);
        cardNumberLabel1.setText("Card Number");

        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(backButton8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(headerText)
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(paymentLine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameInput)
                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                    .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(expInput, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(expLabel)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(cvvInput, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                            .addComponent(cvvLabel)
                                            .addGap(22, 22, 22))))
                                .addComponent(cardNumberInput, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(nameLabel)))
                            .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                .addComponent(updateButton, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                .addComponent(cardNumberLabel1)
                                .addGap(41, 41, 41)))
                        .addGap(285, 285, 285))))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(backButton8, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(headerText)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(paymentLine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(cardNumberLabel1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardNumberInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cvvLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addComponent(expLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cvvInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                    .addComponent(expInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(updateButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        backButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButton8ActionPerformed(evt);
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }                     

    private void backButton8ActionPerformed(ActionEvent evt) {
        dispose();
        DashboardScreen ds = new DashboardScreen(user);
        ds.performStrategy();                                            
    }                                           

    private void updateButtonActionPerformed(ActionEvent evt) {                                             
        String cardNum = cardNumberInput.getText();
        String nameOnCard = nameInput.getText();
        String exp = expInput.getText();
        String cvv = cvvInput.getText();

        if(cardNum.isEmpty() || nameOnCard.isEmpty() || exp.isEmpty() || cvv.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please ensure you have filled out all fields!","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        if(!cardNum.matches("^[0-9]*$") || cardNum.length() != 16){
            JOptionPane.showMessageDialog(this, "Please enter a valid credit card number!","Error!", JOptionPane.PLAIN_MESSAGE);
            return;           
        }

        if(!exp.matches("^(0[1-9]|1[0-2])/?(([0-9]{4}|[0-9]{2})$)")){
            JOptionPane.showMessageDialog(this, "Please enter the expiry date in the correct format! (mm/yy)","Error!", JOptionPane.PLAIN_MESSAGE);
            return;    
        }

        if(!cvv.matches("^[0-9]*$") || cvv.length() != 3){
            JOptionPane.showMessageDialog(this, "Please enter a valid CVV number (3 digits)","Error!", JOptionPane.PLAIN_MESSAGE);
            return;       
        }

        PaymentInformation pi = new PaymentInformation(cardNum, exp, cvv, nameOnCard);
        this.user.setPaymentInformation(pi);

        LoginController lc = new LoginController();
        lc.forwardUpdate(user);
        JOptionPane.showMessageDialog(this, "Successfully updated your payment details!","Success!", JOptionPane.PLAIN_MESSAGE);
    }                                            
}