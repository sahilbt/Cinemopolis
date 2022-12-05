package UI;
import javax.swing.*;

import Business.PaymentService;
import Controllers.CouponController;
import Controllers.TicketController;
import Entitity.Coupon;
import Entitity.Ticket;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CancelScreen extends JFrame implements UI {
    private JButton backButton;
    private JPanel backgroundPanel;
    private JTextField couponTextbox;
    private JLabel disclaimerText1;
    private JLabel disclaimerText2;
    private JLabel headerText;
    private JPanel line;
    private JButton refundButton;
    private JLabel orderText;


    /**
	 * Cancel Constructor
	 * 
	 * @param user User object using the Screen
	*/           
    public CancelScreen() {
        initComponents();
    }
    

    /**
	 * Function that initializes all components and displays them to the user
	 * 
	 * @param None
	*/      
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
        backButton = new JButton();
        couponTextbox = new JTextField();
        orderText = new JLabel();
        refundButton = new JButton();
        disclaimerText1 = new JLabel();
        disclaimerText2 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinemopolis");
        setBackground(new Color(0, 0, 0));
        setResizable(false);

        backgroundPanel.setBackground(Color.black);

        headerText.setFont(new Font("Nirmala UI", 1, 48)); 
        headerText.setForeground(Color.white);
        headerText.setText("Cancel Ticket");
        headerText.setToolTipText("");

        line.setBackground(Color.white);
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        backButton.setBackground(new Color(221, 5, 37));
        backButton.setFont(new Font("Dubai", 1, 14)); 
        backButton.setForeground(Color.white);
        backButton.setText("Back");
        backButton.setBorderPainted(false);

        couponTextbox.setBackground(new Color(77, 77, 77));
        couponTextbox.setFont(new Font("Dubai", 0, 18)); 
        couponTextbox.setForeground(Color.white);
        couponTextbox.setBorder(BorderFactory.createEtchedBorder());
        couponTextbox.setSelectionColor(new Color(77, 77, 77));

        orderText.setBackground(Color.black);
        orderText.setFont(new Font("Dubai", 0, 18)); 
        orderText.setForeground(Color.white);
        orderText.setText("Order ID");

        refundButton.setBackground(new Color(221, 5, 37));
        refundButton.setFont(new Font("Dubai", 1, 20)); 
        refundButton.setForeground(Color.white);
        refundButton.setText("Refund");
        refundButton.setBorderPainted(false);
        refundButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        disclaimerText1.setBackground(Color.black);
        disclaimerText1.setFont(new Font("Dubai", 0, 12)); 
        disclaimerText1.setForeground(Color.white);
        disclaimerText1.setHorizontalAlignment(SwingConstants.CENTER);
        disclaimerText1.setText("You will be refunded 85% of your order value as store credit if you are an ");
        disclaimerText1.setHorizontalTextPosition(SwingConstants.CENTER);

        disclaimerText2.setBackground(Color.black);
        disclaimerText2.setFont(new Font("Dubai", 0, 12)); // NOI18N
        disclaimerText2.setForeground(Color.white);
        disclaimerText2.setHorizontalAlignment(SwingConstants.CENTER);
        disclaimerText2.setText("  unregistered user. You may only cancel a ticket with 72 hours notice.");
        disclaimerText2.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGap(0, 150, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(disclaimerText1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 469, GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(disclaimerText2, GroupLayout.PREFERRED_SIZE, 428, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, GroupLayout.PREFERRED_SIZE)))
                .addGap(141, 141, 141))
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(headerText))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(line, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(couponTextbox, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(refundButton, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(orderText)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(headerText))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(orderText, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(couponTextbox, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refundButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(disclaimerText1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(disclaimerText2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
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

        refundButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                refundButtonActionPerformed(evt);
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }                   


    /**
	 * Function to send user to previous page if the back button is clicked
	 * 
	 * @param evt event used to trigger method
	*/      
    private void backButtonActionPerformed(ActionEvent evt) {    
        dispose();
        HomeScreen.main(null);                                       
    }                                          

  
    /**
	 * Function to cancel the ticket and produce a coupon id the refund button is clicked
	 * 
	 * @param evt event used to trigger method
	*/      
    private void refundButtonActionPerformed(ActionEvent evt) {  
        //get input and make sure input is valid  
        String id = couponTextbox.getText();    
        
        if(id.isEmpty() || !id.matches("^[0-9]*$")){
            JOptionPane.showMessageDialog(this, "Please enter a valid order number","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        
        TicketController tc = new TicketController();
        CouponController cc = new CouponController();
        boolean existence = tc.exists(id);

        //make sure ticket exists
        if(!existence){
            JOptionPane.showMessageDialog(this, "This Order ID does not exist!","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        Ticket ticket = tc.getTicket(id);
        boolean notExp = tc.notExpired();

        //make sure ricket is within refund range
        if(!notExp){
            JOptionPane.showMessageDialog(this, "This Order was purchased more than 72 hours ago!","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        // add coupon to database
        cc.addCoupon(ticket);
        Coupon c = cc.getRecentCoupon();

        //send cancellation email
        PaymentService ps = new PaymentService();
        ps.makeEmail(ticket.getEmail(), id, c);

        tc.closeControl();
        cc.closeControl();

        //Display success message
        JOptionPane.showMessageDialog(this, "Order successfully canceled! Please check your email for the refund details.","Success", JOptionPane.PLAIN_MESSAGE);
    }                                                       
}