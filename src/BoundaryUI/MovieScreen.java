package BoundaryUI;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import Entitity.Theatre;
import Entitity.User;

public class MovieScreen extends JFrame {
    private JButton backButton;
    private JPanel backgroundPanel;
    private JButton continueButton;
    private JLabel headerText;
    private JScrollPane jScrollPane1;
    private JPanel line;
    private JTable movieTable;
    private User user;
    private ArrayList<Theatre> theatres;
    private int tIndex;

    public MovieScreen(User user, ArrayList<Theatre> theatres, int tIndex) {
        this.user = user;
        this.theatres = theatres;
        this.tIndex = tIndex;
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
        backButton = new JButton();
        headerText = new JLabel();
        line = new JPanel();
        continueButton = new JButton();
        jScrollPane1 = new JScrollPane();
        movieTable = new JTable();

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


        headerText.setFont(new Font("Nirmala UI", 1, 48)); // NOI18N
        headerText.setForeground(Color.white);
        headerText.setText("Select a Movie");
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

        movieTable.setTableHeader(null);
        movieTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        movieTable.setDefaultEditor(Object.class, null);
        movieTable.setBackground(new Color(77, 77, 77));
        movieTable.setBorder(new LineBorder(Color.white, 1, true));
        movieTable.setFont(new Font("Dubai", 1, 18)); // NOI18N
        movieTable.setForeground(Color.white);
        movieTable.setGridColor(Color.white);
        movieTable.setRowHeight(61);
        movieTable.setSelectionBackground(new Color(183, 183, 183));
        movieTable.setShowHorizontalLines(true);
        movieTable.setShowVerticalLines(true);
        jScrollPane1.setViewportView(movieTable);
        jScrollPane1.getViewport().setBackground(new Color(77,77,77));
        jScrollPane1.setBorder(BorderFactory.createLineBorder(Color.white));

        DefaultTableModel model = (DefaultTableModel)movieTable.getModel();
        model.addColumn(new Object[] {"bruh"});

        int i =0;
        while(i < theatres.get(0).getMovieList().size()){
            model.addRow(new Object[] {theatres.get(0).getMovieList().get(i).getMovieName()});
            i++;
        }

        movieTable.setModel(model);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (i = 0; i < movieTable.getModel().getColumnCount(); i++) {
            movieTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        

        
        GroupLayout backgroundPanelLayout = new GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(headerText)
                .addGap(203, 203, 203))
            .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(line, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(continueButton, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(headerText)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(line, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGroup(backgroundPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continueButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        continueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }                     

    private void continueButtonActionPerformed(ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void backButtonActionPerformed(ActionEvent evt) {                                           
        dispose();     
        TheatreScreen ts = new TheatreScreen(theatres, this.user);
    }                                                 
}