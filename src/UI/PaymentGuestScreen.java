package UI;

import java.awt.*;
import java.awt.event.ActionListener;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.*;

import Business.PaymentService;
import Controllers.CouponController;
import Controllers.SeatController;
import Controllers.TicketController;
import Entitity.Coupon;
import Entitity.Theatre;
import Entitity.Ticket;
import Entitity.User;

public class PaymentGuestScreen extends JFrame implements UI{
    private JButton backButton;
    private JButton applyButton;
    private JPanel backgroundPanel;
    private JTextField cardNumberInput;
    private JLabel cardNumberLabel;
    private JLabel cardNumberLabel1;
    private JTextField couponInput;
    private JLabel couponLabel;
    private JTextField cvvInput;
    private JLabel cvvLabel;
    private JTextField emailInput;
    private JLabel emailLabel;
    private JTextField expInput;
    private JLabel expLabel;
    private JTextField nameInput;
    private JLabel nameLabel;
    private JButton payButton;
    private JLabel paymentHeader;
    private JPanel paymentLine;
    private User user;
    private ArrayList<Theatre> theatres;
    private int t;
    private int m;
    private int s;
    private ArrayList<Integer> seats;
    private int price;
    

    public PaymentGuestScreen(User user, ArrayList<Theatre> theatres, int t, int m, int s, ArrayList<Integer> seats) {
        this.user = user;
        this.theatres = theatres;
        this.t = t;
        this.m = m;
        this.s = s;
        this.seats = seats;
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
        backButton = new JButton();
        paymentHeader = new JLabel();
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
        cardNumberLabel = new JLabel();
        couponInput = new JTextField();
        couponLabel = new JLabel();
        payButton = new JButton();
        applyButton = new JButton();
        cardNumberLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinemopolis");
        setBackground(new Color(0, 0, 0));
        setResizable(false);

        backgroundPanel.setBackground(Color.black);

        backButton.setBackground(new Color(221, 5, 37));
        backButton.setFont(new Font("Dubai", 1, 14)); // NOI18N
        backButton.setForeground(Color.white);
        backButton.setText("Back");
        backButton.setBorderPainted(false);

        paymentHeader.setFont(new Font("Nirmala UI", 1, 48)); // NOI18N
        paymentHeader.setForeground(Color.white);
        paymentHeader.setText("Payment");
        paymentHeader.setToolTipText("");

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

        emailLabel.setBackground(Color.black);
        emailLabel.setFont(new Font("Dubai", 0, 18)); // NOI18N
        emailLabel.setForeground(Color.white);
        emailLabel.setText("Email");

        emailInput.setBackground(new Color(77, 77, 77));
        emailInput.setFont(new Font("Dubai", 0, 18)); // NOI18N
        emailInput.setForeground(Color.white);
        emailInput.setBorder(BorderFactory.createEtchedBorder());
        emailInput.setSelectionColor(new Color(77, 77, 77));

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

        cardNumberLabel.setBackground(Color.black);
        cardNumberLabel.setFont(new Font("Dubai", 0, 18)); // NOI18N
        cardNumberLabel.setForeground(Color.white);
        cardNumberLabel.setText("Card Number");

        couponInput.setBackground(new Color(77, 77, 77));
        couponInput.setFont(new Font("Dubai", 0, 18)); // NOI18N
        couponInput.setForeground(Color.white);
        couponInput.setBorder(BorderFactory.createEtchedBorder());
        couponInput.setSelectionColor(new Color(77, 77, 77));

        couponLabel.setBackground(Color.black);
        couponLabel.setFont(new Font("Dubai", 0, 18)); // NOI18N
        couponLabel.setForeground(Color.white);
        couponLabel.setText("Coupon");

        payButton.setBackground(new Color(221, 5, 37));
        payButton.setFont(new Font("Dubai", 1, 20)); // NOI18N
        payButton.setForeground(Color.white);
        payButton.setText("Pay");
        payButton.setBorderPainted(false);
        payButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        applyButton.setBackground(new Color(221, 5, 37));
        applyButton.setFont(new Font("Dubai", 1, 14)); // NOI18N
        applyButton.setForeground(Color.white);
        applyButton.setText("Apply");
        applyButton.setBorderPainted(false);

        cardNumberLabel1.setBackground(Color.black);
        cardNumberLabel1.setFont(new Font("Dubai", 0, 24)); // NOI18N
        cardNumberLabel1.setForeground(Color.white);

        price = 20 * seats.size();

        cardNumberLabel1.setText("Total: $" + Integer.toString(price));

        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(paymentLine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameLabel)
                            .addComponent(cardNumberLabel)
                            .addComponent(nameInput)
                            .addComponent(cardNumberInput, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(expLabel)
                                    .addComponent(expInput, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
                                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cvvLabel)
                                        .addGap(37, 37, 37))
                                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                        .addComponent(cvvInput, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(emailLabel)
                                        .addComponent(couponLabel)
                                        .addComponent(emailInput)
                                        .addComponent(couponInput, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(payButton, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(applyButton)))
                        .addGap(176, 176, 176))))
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212)
                        .addComponent(paymentHeader))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(cardNumberLabel1)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentHeader))
                .addGap(12, 12, 12)
                .addComponent(paymentLine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cardNumberLabel1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(cardNumberLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardNumberInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(cvvLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(expLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(cvvInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(expInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                .addComponent(emailLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))
                            .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                .addComponent(couponLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(couponInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addComponent(applyButton, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(payButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        applyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                applyActionPerformed(evt);
            }
        });


        payButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                payButtonActionPerformed(evt);
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

    private void payButtonActionPerformed(ActionEvent evt) {                                          
        String cardNumber = cardNumberInput.getText();
        String nameOnCard = nameInput.getText();
        String expiry = expInput.getText();
        String cvv = cvvInput.getText();
        String email = emailInput.getText();

        if(cardNumber.isEmpty()|| nameOnCard.isEmpty() || expiry.isEmpty() || cvv.isEmpty() || email.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please ensure you have filled out all fields!","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        if(!cardNumber.matches("^[0-9]*$") || cardNumber.length() != 16){
            JOptionPane.showMessageDialog(this, "Please enter a valid credit card number","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        if(!expiry.matches("^(0[1-9]|1[0-2])/?(([0-9]{4}|[0-9]{2})$)")){
            JOptionPane.showMessageDialog(this, "Please enter the expiry date in the correct format! (mm/yy)","Error!", JOptionPane.PLAIN_MESSAGE);
            return;    
        }

        if(!cvv.matches("^[0-9]*$") || cvv.length() != 3){
            JOptionPane.showMessageDialog(this, "Please enter a valid CVV number (3 digits)","Error!", JOptionPane.PLAIN_MESSAGE);
            return;       
        }

        String movieS = theatres.get(t).getMovieList().get(m).getMovieName();
        String theatreS = theatres.get(t).getTheatreName();
        String showTimesS = theatres.get(t).getMovieList().get(m).getShowTimes().get(s).getTime();
        Boolean registerdOrNot;
        if (user == null){
            registerdOrNot = false;
        }else{
            registerdOrNot = true;
        }
        Date date = new Date();
        Format formatted = new SimpleDateFormat("MM/dd/yyyy");
        String dateString = formatted.format(date);

        
        Ticket t = new Ticket(-1, email, movieS, showTimesS, dateString, seats, price, registerdOrNot, theatreS);
        TicketController tc = new TicketController();
        tc.addTicketToDB(t);
        t.setID(tc.getRecentTicket());

        PaymentService ps = new PaymentService();
        if (!ps.makeEmail(t)){
            tc.removeTicket(t);
            JOptionPane.showMessageDialog(this, "Please enter a valid email!","Error!", JOptionPane.PLAIN_MESSAGE);
            return; 
        }

        SeatController s = new SeatController();
        s.updateSeatinDB(seats);

        tc.closeControl();
        s.closeControl();

        JOptionPane.showMessageDialog(this, "Tickets sucessfully purchased! Check your email for details","Success!", JOptionPane.PLAIN_MESSAGE);
        dispose();
        HomeScreen.main(null);
    }                                         

    private void backButtonActionPerformed(ActionEvent evt) {                                           
        dispose();
        SeatsScreen ss = new SeatsScreen(user, theatres, t, m, s);
    }                                          

    private void applyActionPerformed(ActionEvent evt) {
        String id = couponInput.getText();

        if(id.isEmpty() || !id.matches("^[0-9]*$")){
            JOptionPane.showMessageDialog(this, "This coupon is invalid !","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        CouponController cc = new CouponController();
        boolean validCoupon = cc.sendCouponCreds(id);
       
        if(!(validCoupon)){
            JOptionPane.showMessageDialog(this, "This coupon is invalid !","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        Coupon coupon = cc.getCouponFromBoundaryDB(id);

        if(coupon.getValue() > price){
            coupon.setValue(coupon.getValue()-price);
            price = 0;
        }
        else{
            price = price - coupon.getValue();
            coupon.setValue(0);
        }

        cardNumberLabel1.setText("Total: $" + Integer.toString(price));

        if(coupon.getValue() == 0){
            cc.performDeletionOfCoupon(coupon);
        }
        else{
            cc.updateCouponValueInDB(coupon);
        }

        cc.closeControl();

        JOptionPane.showMessageDialog(this, "The coupon application process was successful!","Success!", JOptionPane.PLAIN_MESSAGE);
    }                                                    
}