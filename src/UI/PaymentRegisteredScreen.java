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


public class PaymentRegisteredScreen extends JFrame implements UI{
    private JButton backButton;
    private JButton backButton1;
    private JPanel backgroundPanel;
    private JLabel cardNumberLabel1;
    private JTextField couponInput;
    private JLabel couponLabel;
    private JLabel jLabel1;
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

    public PaymentRegisteredScreen(User user, ArrayList<Theatre> theatres, int t, int m, int s, ArrayList<Integer> seats) {
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
        couponInput = new JTextField();
        couponLabel = new JLabel();
        payButton = new JButton();
        backButton1 = new JButton();
        cardNumberLabel1 = new JLabel();
        jLabel1 = new JLabel();

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
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

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
        payButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        backButton1.setBackground(new Color(221, 5, 37));
        backButton1.setFont(new Font("Dubai", 1, 14)); // NOI18N
        backButton1.setForeground(Color.white);
        backButton1.setText("Apply");
        backButton1.setBorderPainted(false);
        backButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        cardNumberLabel1.setBackground(Color.black);
        cardNumberLabel1.setFont(new Font("Dubai", 0, 24)); // NOI18N
        cardNumberLabel1.setForeground(Color.white);
        cardNumberLabel1.setText("Total: $");

        price = 20 * seats.size();

        cardNumberLabel1.setText("Total: $" + Integer.toString(price));

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/resources/text3.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(couponInput, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(couponLabel)
                            .addComponent(cardNumberLabel1)))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212)
                        .addComponent(paymentHeader)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(paymentLine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 621, GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(payButton, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(backButton1)))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(cardNumberLabel1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(couponLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(couponInput, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(payButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
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

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }                     

    private void backButtonActionPerformed(ActionEvent evt) {                                           
        dispose();
        SeatsScreen ss = new SeatsScreen(user, theatres, t, m, s);
    }                                          

    private void payButtonActionPerformed(ActionEvent evt) {                                          
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

        TicketController tc = new TicketController();
    
        Ticket t = new Ticket(-1, user.getUsername(), movieS, showTimesS, dateString, seats, price, registerdOrNot, theatreS);
        tc.addTicketToDB(t);
        t.setID(tc.getRecentTicket());

        PaymentService ps = new PaymentService();
        if (!ps.makeEmail(t)){
            tc.removeTicket(t);
            JOptionPane.showMessageDialog(this, "Please enter a valid email!","Error!", JOptionPane.PLAIN_MESSAGE);
            return; 
        }
        
    

        SeatController s = new SeatController();
        s.updateSeats(seats);

        tc.closeControl();
        s.closeControl();
        JOptionPane.showMessageDialog(this, "Tickets sucessfully purchased! Check your email for details","Success!", JOptionPane.PLAIN_MESSAGE);
        dispose();
        DashboardScreen ds = new DashboardScreen(user);
        ds.performStrategy();
    }                                         

    private void backButton1ActionPerformed(ActionEvent evt) {                                            
        String id = couponInput.getText();

        if(id.isEmpty() || !id.matches("^[0-9]*$")){
            JOptionPane.showMessageDialog(this, "This coupon is invalid !","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        CouponController cc = new CouponController();
        boolean validCoupon = cc.validateCoupon(id);
       
        if(!(validCoupon)){
            JOptionPane.showMessageDialog(this, "This coupon is invalid !","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        Coupon coupon = cc.getCoupon(id);

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
            cc.deleteCoupon(coupon);
        }
        else{
            cc.updateCoupon(coupon);
        }

        JOptionPane.showMessageDialog(this, "The coupon application process was successful!","Success!", JOptionPane.PLAIN_MESSAGE);
    }                                                  
}
