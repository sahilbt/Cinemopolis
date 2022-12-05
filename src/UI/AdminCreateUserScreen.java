package UI;
import javax.swing.*;
import Controllers.LoginController;
import Entitity.PaymentInformation;
import Entitity.User;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminCreateUserScreen extends JFrame implements UI{
    private JTextField addressInput;
    private JLabel addressLabel;
    private JButton backButton;
    private JPanel backgroundPanel;
    private JTextField cardNumberInput;
    private JLabel cardNumberLabel1;
    private JTextField cvvInput;
    private JLabel cvvLabel;
    private JTextField emailInput;
    private JLabel emailLabel;
    private JTextField expInput;
    private JLabel expLabel;
    private JTextField firstNameInput1;
    private JLabel firstNameLabel;
    private JLabel headerText;
    private JTextField lastNameInput;
    private JLabel lastNameLabel;
    private JTextField nameInput;
    private JLabel nameLabel;
    private JPasswordField passwordInput;
    private JLabel passwordLabel;
    private JButton createButton;
    private JPanel paymentLine;  
    private User user; 


    /**
	 * AdminCreateUserScreen Constructor
	 * 
	 * @param user User object using the Screen
	*/ 
    public AdminCreateUserScreen(User user) {
        this.user = user;
        initComponents();
    }
       
    
    /**
	 * Function that initializes all components and displays them to the user
	 * 
	 * @param None
	*/     
    @Override
    public void initComponents() {
        //Set new look and feel
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
        backButton = new JButton();
        headerText = new JLabel();
        paymentLine = new JPanel();
        cvvInput = new JTextField();
        nameLabel = new JLabel();
        emailLabel = new JLabel();
        emailInput = new JTextField();
        nameInput = new JTextField();
        expInput = new JTextField();
        cvvLabel = new JLabel();
        expLabel = new JLabel();
        cardNumberInput = new JTextField();
        firstNameLabel = new JLabel();
        passwordInput = new JPasswordField();
        passwordLabel = new JLabel();
        createButton = new JButton();
        lastNameInput = new JTextField();
        firstNameInput1 = new JTextField();
        addressInput = new JTextField();
        cardNumberLabel1 = new JLabel();
        lastNameLabel = new JLabel();
        addressLabel = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinemopolis");
        setBackground(new Color(0, 0, 0));
        setResizable(false);

        backgroundPanel.setBackground(Color.black);

        backButton.setBackground(new Color(221, 5, 37));
        backButton.setFont(new Font("Dubai", 1, 14)); 
        backButton.setForeground(Color.white);
        backButton.setText("Back");
        backButton.setBorderPainted(false);

        headerText.setFont(new Font("Nirmala UI", 1, 48)); 
        headerText.setForeground(Color.white);
        headerText.setText("New User");
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
        cvvInput.setFont(new Font("Dubai", 0, 18)); 
        cvvInput.setForeground(Color.white);
        cvvInput.setBorder(BorderFactory.createEtchedBorder());
        cvvInput.setSelectionColor(new Color(77, 77, 77));

        nameLabel.setBackground(Color.black);
        nameLabel.setFont(new Font("Dubai", 0, 18)); 
        nameLabel.setForeground(Color.white);
        nameLabel.setText("Name on Card");

        emailLabel.setBackground(Color.black);
        emailLabel.setFont(new Font("Dubai", 0, 18)); 
        emailLabel.setForeground(Color.white);
        emailLabel.setText("Email");

        emailInput.setBackground(new Color(77, 77, 77));
        emailInput.setFont(new Font("Dubai", 0, 18));
        emailInput.setForeground(Color.white);
        emailInput.setBorder(BorderFactory.createEtchedBorder());
        emailInput.setSelectionColor(new Color(77, 77, 77));

        nameInput.setBackground(new Color(77, 77, 77));
        nameInput.setFont(new Font("Dubai", 0, 18)); 
        nameInput.setForeground(Color.white);
        nameInput.setBorder(BorderFactory.createEtchedBorder());
        nameInput.setSelectionColor(new Color(77, 77, 77));

        expInput.setBackground(new Color(77, 77, 77));
        expInput.setFont(new Font("Dubai", 0, 18)); 
        expInput.setForeground(Color.white);
        expInput.setBorder(BorderFactory.createEtchedBorder());
        expInput.setSelectionColor(new Color(77, 77, 77));

        cvvLabel.setBackground(Color.black);
        cvvLabel.setFont(new Font("Dubai", 0, 18)); 
        cvvLabel.setForeground(Color.white);
        cvvLabel.setText("CVV");

        expLabel.setBackground(Color.black);
        expLabel.setFont(new Font("Dubai", 0, 18)); 
        expLabel.setForeground(Color.white);
        expLabel.setText("Exp");

        cardNumberInput.setBackground(new Color(77, 77, 77));
        cardNumberInput.setFont(new Font("Dubai", 0, 18));
        cardNumberInput.setForeground(Color.white);
        cardNumberInput.setBorder(BorderFactory.createEtchedBorder());
        cardNumberInput.setSelectionColor(new Color(77, 77, 77));

        firstNameLabel.setBackground(Color.black);
        firstNameLabel.setFont(new Font("Dubai", 0, 18)); 
        firstNameLabel.setForeground(Color.white);
        firstNameLabel.setText("First Name");

        passwordInput.setBackground(new Color(77, 77, 77));
        passwordInput.setFont(new Font("Dubai", 0, 18)); 
        passwordInput.setForeground(Color.white);
        passwordInput.setBorder(BorderFactory.createEtchedBorder());
        passwordInput.setSelectionColor(new Color(77, 77, 77));

        passwordLabel.setBackground(Color.black);
        passwordLabel.setFont(new Font("Dubai", 0, 18)); 
        passwordLabel.setForeground(Color.white);
        passwordLabel.setText("Password");

        createButton.setBackground(new Color(221, 5, 37));
        createButton.setFont(new Font("Dubai", 1, 20)); 
        createButton.setForeground(Color.white);
        createButton.setText("Create");
        createButton.setBorderPainted(false);
        createButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        lastNameInput.setBackground(new Color(77, 77, 77));
        lastNameInput.setFont(new Font("Dubai", 0, 18));
        lastNameInput.setForeground(Color.white);
        lastNameInput.setBorder(BorderFactory.createEtchedBorder());
        lastNameInput.setSelectionColor(new Color(77, 77, 77));

        firstNameInput1.setBackground(new Color(77, 77, 77));
        firstNameInput1.setFont(new Font("Dubai", 0, 18)); 
        firstNameInput1.setForeground(Color.white);
        firstNameInput1.setBorder(BorderFactory.createEtchedBorder());
        firstNameInput1.setSelectionColor(new Color(77, 77, 77));

        addressInput.setBackground(new Color(77, 77, 77));
        addressInput.setFont(new Font("Dubai", 0, 18)); 
        addressInput.setForeground(Color.white);
        addressInput.setBorder(BorderFactory.createEtchedBorder());
        addressInput.setSelectionColor(new Color(77, 77, 77));

        cardNumberLabel1.setBackground(Color.black);
        cardNumberLabel1.setFont(new Font("Dubai", 0, 18)); 
        cardNumberLabel1.setForeground(Color.white);
        cardNumberLabel1.setText("Card Number");

        lastNameLabel.setBackground(Color.black);
        lastNameLabel.setFont(new Font("Dubai", 0, 18)); 
        lastNameLabel.setForeground(Color.white);
        lastNameLabel.setText("Last Name");

        addressLabel.setBackground(Color.black);
        addressLabel.setFont(new Font("Dubai", 0, 18)); 
        addressLabel.setForeground(Color.white);
        addressLabel.setText("Address");

        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234)
                .addComponent(headerText)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel)
                            .addComponent(lastNameLabel)
                            .addComponent(addressLabel)
                            .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addressInput, GroupLayout.Alignment.LEADING)
                                .addComponent(lastNameInput, GroupLayout.Alignment.LEADING)
                                .addComponent(firstNameInput1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameLabel)
                                .addComponent(nameInput)
                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                    .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(expLabel)
                                        .addComponent(expInput, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                    .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                            .addComponent(cvvLabel)
                                            .addGap(37, 37, 37))
                                        .addComponent(cvvInput, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
                                .addComponent(cardNumberInput))
                            .addComponent(cardNumberLabel1))
                        .addGap(45, 45, 45)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(emailLabel)
                                .addComponent(passwordLabel)
                                .addComponent(emailInput)
                                .addComponent(passwordInput, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(createButton, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70))
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(paymentLine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addComponent(headerText))
                .addGap(12, 12, 12)
                .addComponent(paymentLine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addComponent(emailLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(passwordLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addComponent(createButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addComponent(firstNameLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstNameInput1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(lastNameLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastNameInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addressLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addComponent(cardNumberLabel1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
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
                                    .addComponent(expInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 67, Short.MAX_VALUE))
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

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                regButtonActionPerformed(evt);
            }
        });
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }                      


    /**
	 * Function to send user back to previous page if the back button is clicked
	 * 
	 * @param evt event used to trigger method
	*/ 
    private void backButtonActionPerformed(ActionEvent evt) {  
        dispose();
        AdminUserScreen aus = new AdminUserScreen(user);
    }                                           


    /**
	 * Function to create a new user if the create user button is clicked
	 * 
	 * @param evt event used to trigger method
	*/  
    private void regButtonActionPerformed(ActionEvent evt) {
        //Get inputs                                          
        String fName = firstNameInput1.getText();
        String lName = lastNameInput.getText();
        String address = addressInput.getText();

        //Make sure inputs are valid
        if(fName.isEmpty() || lName.isEmpty() || address.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please ensure you have filled out all fields!","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        //Get inputs
        String cardNum = cardNumberInput.getText();
        String nameOnCard = nameInput.getText();
        String exp = expInput.getText();
        String cvv = cvvInput.getText();

        //Make sure inputs are valid
        if(cardNum.isEmpty() || nameOnCard.isEmpty() || exp.isEmpty() || cvv.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please ensure you have filled out all fields!","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        //Make sure inputs are valid
        if(!cardNum.matches("^[0-9]*$") || cardNum.length() != 16){
            JOptionPane.showMessageDialog(this, "Please enter a valid credit card number!","Error!", JOptionPane.PLAIN_MESSAGE);
            return;           
        }

        //Make sure inputs are valid
        if(!exp.matches("^(0[1-9]|1[0-2])/?(([0-9]{4}|[0-9]{2})$)")){
            JOptionPane.showMessageDialog(this, "Please enter the expiry date in the correct format! (mm/yy)","Error!", JOptionPane.PLAIN_MESSAGE);
            return;    
        }

        //Make sure inputs are valid
        if(!cvv.matches("^[0-9]*$") || cvv.length() != 3){
            JOptionPane.showMessageDialog(this, "Please enter a valid CVV number (3 digits)","Error!", JOptionPane.PLAIN_MESSAGE);
            return;       
        }

        //Get inputs
        String email = emailInput.getText();
        String pass =  String.valueOf(passwordInput.getPassword());

        //Make sure inputs are valid
        if(email.isEmpty() || pass.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please ensure you have filled out all fields!","Error!", JOptionPane.PLAIN_MESSAGE);
            return;    
        }

        LoginController lc = new LoginController();
        User tmp = lc.findUserFromSingleton(email);

        //make sure registering user is a unique user
        if(tmp != null){
            JOptionPane.showMessageDialog(this, "An account with this email already exists!","Error!", JOptionPane.PLAIN_MESSAGE);
            return;      
        }

        //Create User object and send information to the database
        String fullName = fName + " " + lName;
        PaymentInformation p = new PaymentInformation(cardNum, exp, cvv, nameOnCard);

        User u = new User(fullName, address, p, email, pass, "R");

        lc.addUser(u);
        lc.closeControl();

        //display success message
        JOptionPane.showMessageDialog(this, "New user successfully added!","Success!", JOptionPane.PLAIN_MESSAGE);
    }                                                  
} 