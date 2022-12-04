package UI;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.*;

import Entitity.Showtime;
import Entitity.Theatre;
import Entitity.Ticket;
import Entitity.User;

public class SeatsScreen extends JFrame {
    private JButton backButton;
    private JPanel backgroundPanel;
    private JButton continueButton;
    private JLabel headerText;
    private JLabel jLabel1;
    private JPanel line;
    private JToggleButton seat1;
    private JToggleButton seat10;
    private JToggleButton seat11;
    private JToggleButton seat12;
    private JToggleButton seat13;
    private JToggleButton seat14;
    private JToggleButton seat15;
    private JToggleButton seat16;
    private JToggleButton seat17;
    private JToggleButton seat18;
    private JToggleButton seat19;
    private JToggleButton seat2;
    private JToggleButton seat20;
    private JToggleButton seat3;
    private JToggleButton seat4;
    private JToggleButton seat5;
    private JToggleButton seat6;
    private JToggleButton seat7;
    private JToggleButton seat8;
    private JToggleButton seat9;
    private ArrayList<JToggleButton> arr = new ArrayList<JToggleButton>();
    private User user;
    private ArrayList<Theatre> theatres;
    private int t;
    private int m;
    private int s;

    public SeatsScreen(User user, ArrayList<Theatre> theatres, int t, int m, int s) {
        this.user = user;
        this.theatres = theatres;
        this.t = t;
        this.m = m;
        this.s = s;
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
        continueButton = new JButton();
        backButton = new JButton();
        seat1 = new JToggleButton();
        seat2 = new JToggleButton();
        seat3 = new JToggleButton();
        seat4 = new JToggleButton();
        seat5 = new JToggleButton();
        seat6 = new JToggleButton();
        seat7 = new JToggleButton();
        seat8 = new JToggleButton();
        seat9 = new JToggleButton();
        seat10 = new JToggleButton();
        seat11 = new JToggleButton();
        seat12 = new JToggleButton();
        seat13 = new JToggleButton();
        seat14 = new JToggleButton();
        seat15 = new JToggleButton();
        seat16 = new JToggleButton();
        seat17 = new JToggleButton();
        seat18 = new JToggleButton();
        seat19 = new JToggleButton();
        seat20 = new JToggleButton();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinemopolis");
        setBackground(new Color(0, 0, 0));
        setResizable(false);

        backgroundPanel.setBackground(Color.black);

        headerText.setFont(new Font("Nirmala UI", 1, 48)); // NOI18N
        headerText.setForeground(Color.white);
        headerText.setText("Select your Seats");
        headerText.setToolTipText("");

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

        continueButton.setBackground(new Color(221, 5, 37));
        continueButton.setFont(new Font("Dubai", 1, 20)); // NOI18N
        continueButton.setForeground(Color.white);
        continueButton.setText("Continue");
        continueButton.setBorderPainted(false);
        continueButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        continueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

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

        seat1.setBackground(new Color(77, 77, 77));
        seat1.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat1.setForeground(Color.white);
        seat1.setText("1");
        seat1.setBorder(null);
        seat1.setBorderPainted(false);
        seat1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat1ActionPerformed(evt);
            }
        });
        arr.add(seat1);

        seat2.setBackground(new Color(77, 77, 77));
        seat2.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat2.setForeground(Color.white);
        seat2.setText("2");
        seat2.setBorder(null);
        seat2.setBorderPainted(false);
        seat2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat2ActionPerformed(evt);
            }
        });
        arr.add(seat2);

        seat3.setBackground(new Color(77, 77, 77));
        seat3.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat3.setForeground(Color.white);
        seat3.setText("4");
        seat3.setBorder(null);
        seat3.setBorderPainted(false);
        seat3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat3ActionPerformed(evt);
            }
        });
        arr.add(seat3);

        seat4.setBackground(new Color(77, 77, 77));
        seat4.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat4.setForeground(Color.white);
        seat4.setText("3");
        seat4.setBorder(null);
        seat4.setBorderPainted(false);
        seat4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat4ActionPerformed(evt);
            }
        });
        arr.add(seat4);

        seat5.setBackground(new Color(77, 77, 77));
        seat5.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat5.setForeground(Color.white);
        seat5.setText("5");
        seat5.setBorder(null);
        seat5.setBorderPainted(false);
        seat5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat5ActionPerformed(evt);
            }
        });
        arr.add(seat5);

        seat6.setBackground(new Color(77, 77, 77));
        seat6.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat6.setForeground(Color.white);
        seat6.setText("6");
        seat6.setBorder(null);
        seat6.setBorderPainted(false);
        seat6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat6ActionPerformed(evt);
            }
        });
        arr.add(seat6);

        seat7.setBackground(new Color(77, 77, 77));
        seat7.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat7.setForeground(Color.white);
        seat7.setText("7");
        seat7.setBorder(null);
        seat7.setBorderPainted(false);
        seat7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat7ActionPerformed(evt);
            }
        });
        arr.add(seat7);

        seat8.setBackground(new Color(77, 77, 77));
        seat8.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat8.setForeground(Color.white);
        seat8.setText("8");
        seat8.setBorder(null);
        seat8.setBorderPainted(false);
        seat8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat8ActionPerformed(evt);
            }
        });
        arr.add(seat8);

        seat9.setBackground(new Color(77, 77, 77));
        seat9.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat9.setForeground(Color.white);
        seat9.setText("9");
        seat9.setBorder(null);
        seat9.setBorderPainted(false);
        seat9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat9ActionPerformed(evt);
            }
        });
        arr.add(seat9);

        seat10.setBackground(new Color(77, 77, 77));
        seat10.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat10.setForeground(Color.white);
        seat10.setText("10");
        seat10.setBorder(null);
        seat10.setBorderPainted(false);
        seat10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat10ActionPerformed(evt);
            }
        });
        arr.add(seat10);

        seat11.setBackground(new Color(77, 77, 77));
        seat11.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat11.setForeground(Color.white);
        seat11.setText("11");
        seat11.setBorder(null);
        seat11.setBorderPainted(false);
        seat11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat11ActionPerformed(evt);
            }
        });
        arr.add(seat11);

        seat12.setBackground(new Color(77, 77, 77));
        seat12.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat12.setForeground(Color.white);
        seat12.setText("12");
        seat12.setBorder(null);
        seat12.setBorderPainted(false);
        seat12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat12ActionPerformed(evt);
            }
        });
        arr.add(seat12);

        seat13.setBackground(new Color(77, 77, 77));
        seat13.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat13.setForeground(Color.white);
        seat13.setText("13");
        seat13.setBorder(null);
        seat13.setBorderPainted(false);
        seat13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat13ActionPerformed(evt);
            }
        });
        arr.add(seat13);

        seat14.setBackground(new Color(77, 77, 77));
        seat14.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat14.setForeground(Color.white);
        seat14.setText("14");
        seat14.setBorder(null);
        seat14.setBorderPainted(false);
        seat14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat14ActionPerformed(evt);
            }
        });
        arr.add(seat14);

        seat15.setBackground(new Color(77, 77, 77));
        seat15.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat15.setForeground(Color.white);
        seat15.setText("15");
        seat15.setBorder(null);
        seat15.setBorderPainted(false);
        seat15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat15ActionPerformed(evt);
            }
        });
        arr.add(seat15);

        seat16.setBackground(new Color(77, 77, 77));
        seat16.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat16.setForeground(Color.white);
        seat16.setText("16");
        seat16.setBorder(null);
        seat16.setBorderPainted(false);
        seat16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat16ActionPerformed(evt);
            }
        });
        arr.add(seat16);

        seat17.setBackground(new Color(77, 77, 77));
        seat17.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat17.setForeground(Color.white);
        seat17.setText("17");
        seat17.setBorder(null);
        seat17.setBorderPainted(false);
        seat17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat17ActionPerformed(evt);
            }
        });
        arr.add(seat17);

        seat18.setBackground(new Color(77, 77, 77));
        seat18.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat18.setForeground(Color.white);
        seat18.setText("19");
        seat18.setBorder(null);
        seat18.setBorderPainted(false);
        seat18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat18ActionPerformed(evt);
            }
        });
        arr.add(seat18);

        seat19.setBackground(new Color(77, 77, 77));
        seat19.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat19.setForeground(Color.white);
        seat19.setText("18");
        seat19.setBorder(null);
        seat19.setBorderPainted(false);
        seat19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat19ActionPerformed(evt);
            }
        });
        arr.add(seat19);

        seat20.setBackground(new Color(77, 77, 77));
        seat20.setFont(new Font("Dubai", 0, 16)); // NOI18N
        seat20.setForeground(Color.white);
        seat20.setText("20");
        seat20.setBorder(null);
        seat20.setBorderPainted(false);
        seat20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                seat20ActionPerformed(evt);
            }
        });
        arr.add(seat20);


        jLabel1.setIcon(new ImageIcon(getClass().getResource("/resources/screen.png"))); // NOI18N

        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continueButton, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(headerText))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
                            .addComponent(line, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(seat1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seat2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seat4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seat3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seat5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addComponent(seat6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seat7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seat8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seat9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seat10, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seat11, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addComponent(seat19, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seat18, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seat20, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addComponent(seat13, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seat14, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seat15, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seat16, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seat17, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seat12, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(continueButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE, false)
                            .addComponent(seat2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(seat7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat10, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat11, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat12, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(seat16, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat17, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat14, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat13, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat15, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(seat19, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat18, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat20, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
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

        for(int i = 0; i < arr.size(); i++){
            if(theatres.get(t).getMovieList().get(m).getShowTimes().get(s).getSeats().get(i).getVacant() == false){
                arr.get(i).setEnabled(false);
                arr.get(i).setText("X");
                arr.get(i).setForeground(Color.black);
            }
        }

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }                     

    private void backButtonActionPerformed(ActionEvent evt) {                                           
        dispose();
        ShowtimeScreen sc = new ShowtimeScreen(user, theatres, t, m);
    }                                          

    private void continueButtonActionPerformed(ActionEvent evt) {         
        ArrayList<Integer> seats = new ArrayList<Integer>();                                      
        int selected = 0;
        int r = 0;

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).isSelected()){
                selected++;
                seats.add(theatres.get(t).getMovieList().get(m).getShowTimes().get(s).getSeats().get(i).getID());
            }
            if(theatres.get(t).getMovieList().get(m).getShowTimes().get(s).getSeats().get(i).getRuser())
                r++;
        }

        if(selected == 0){
            JOptionPane.showMessageDialog(this, "Please select at least 1 seat to continue!","Error!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        // if(r >= 2 && user != null){
        //     JOptionPane.showMessageDialog(this, "Registered users may only book 10% of the theatre","Error!", JOptionPane.PLAIN_MESSAGE);
        //     return;
        // }

        if(user == null){
            dispose();
            PaymentGuestScreen pg = new PaymentGuestScreen(user, theatres, t, m, s, seats);
        }
        else{
            dispose();
            PaymentRegisteredScreen prg = new PaymentRegisteredScreen();
        }
    }                                              

    private void seat1ActionPerformed(ActionEvent evt) {                                      
    }                                     

    private void seat2ActionPerformed(ActionEvent evt) {                                      
    }                                     

    private void seat3ActionPerformed(ActionEvent evt) {                                      
    }                                     

    private void seat4ActionPerformed(ActionEvent evt) {                                      
    }                                     

    private void seat5ActionPerformed(ActionEvent evt) {                                      
    }                                     

    private void seat6ActionPerformed(ActionEvent evt) {                                      
    }                                     

    private void seat7ActionPerformed(ActionEvent evt) {                                      
    }                                     

    private void seat8ActionPerformed(ActionEvent evt) {                                      
    }                                     

    private void seat9ActionPerformed(ActionEvent evt) {                                      
    }                                     

    private void seat10ActionPerformed(ActionEvent evt) {                                       
    }                                      

    private void seat11ActionPerformed(ActionEvent evt) {                                       
    }                                      

    private void seat12ActionPerformed(ActionEvent evt) {                                       
    }                                      

    private void seat13ActionPerformed(ActionEvent evt) {                                       
    }                                      

    private void seat14ActionPerformed(ActionEvent evt) {                                       
    }                                      

    private void seat15ActionPerformed(ActionEvent evt) {                                       
    }                                      

    private void seat16ActionPerformed(ActionEvent evt) {                                       
    }                                      

    private void seat17ActionPerformed(ActionEvent evt) {                                       
    }                                      

    private void seat18ActionPerformed(ActionEvent evt) {                                       
    }                                      

    private void seat19ActionPerformed(ActionEvent evt) {                                       
    }                                      

    private void seat20ActionPerformed(ActionEvent evt) {                                       
    }                                                    
}
