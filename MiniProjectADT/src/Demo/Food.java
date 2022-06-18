package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class Food extends javax.swing.JFrame {
    int total=0;
    String item[]=new String[5];    
    int qty[]=new int[5];    
    public Food() {
        User.book_id=1;
        initComponents();
        getfood();
        cokeamtLabel.setVisible(false);
        spriteamtLabel.setVisible(false);
        popsmamtLabel.setVisible(false);
        popmamtLabel.setVisible(false);
        poplgamtLabel.setVisible(false);
        jButton3.setVisible(false);
    }
    
    private void getfood()
    {
        try {
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stadiumdb","root","");
            String str="select item,price from availfood";
            PreparedStatement pstmt = con.prepareStatement(str);             
            ResultSet rs = pstmt.executeQuery();            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));              
            con.close();
            } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
   
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        TitlePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        cokeCheckBox = new javax.swing.JCheckBox();
        spriteCheckBox = new javax.swing.JCheckBox();
        popsmCheckBox = new javax.swing.JCheckBox();
        popmCheckBox = new javax.swing.JCheckBox();
        poplgCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        poplgamtLabel = new javax.swing.JLabel();
        popmamtLabel = new javax.swing.JLabel();
        popsmamtLabel = new javax.swing.JLabel();
        spriteamtLabel = new javax.swing.JLabel();
        cokeamtLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        totalamtLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitlePanel.setBackground(java.awt.SystemColor.textHighlight);
        TitlePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TitlePanel.setPreferredSize(new java.awt.Dimension(1045, 120));

        TitleLabel.setBackground(new java.awt.Color(0, 0, 153));
        TitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Stadium Seat Booking System");
        TitleLabel.setIconTextGap(0);

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Select Food Items and Quantity");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setToolTipText("Price chart ");
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner1.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Food Items");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Quantity");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner2.setEnabled(false);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner3.setEnabled(false);

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner4.setEnabled(false);

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jSpinner5.setEnabled(false);

        cokeCheckBox.setText("Coke");
        cokeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeCheckBoxActionPerformed(evt);
            }
        });

        spriteCheckBox.setText("Sprite");
        spriteCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriteCheckBoxActionPerformed(evt);
            }
        });

        popsmCheckBox.setText("Popcorn Small");
        popsmCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popsmCheckBoxActionPerformed(evt);
            }
        });

        popmCheckBox.setText("Popcorn Medium");
        popmCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popmCheckBoxActionPerformed(evt);
            }
        });

        poplgCheckBox.setText("Popcorn Large");
        poplgCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poplgCheckBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jLabel4.setText("Amount");

        poplgamtLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        poplgamtLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        poplgamtLabel.setText("Amount");
        poplgamtLabel.setEnabled(false);

        popmamtLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        popmamtLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        popmamtLabel.setText("Amount");
        popmamtLabel.setEnabled(false);

        popsmamtLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        popsmamtLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        popsmamtLabel.setText("Amount");
        popsmamtLabel.setEnabled(false);

        spriteamtLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        spriteamtLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        spriteamtLabel.setText("Amount");
        spriteamtLabel.setEnabled(false);

        cokeamtLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        cokeamtLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cokeamtLabel.setText("Amount");
        cokeamtLabel.setEnabled(false);

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        totalamtLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        totalamtLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalamtLabel.setText("TOTAL");
        totalamtLabel.setEnabled(false);

        jButton2.setText("Modify");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Pay Now");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel5.setText("Price Chart");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(spriteCheckBox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(cokeCheckBox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(popmCheckBox)
                                        .addComponent(popsmCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(poplgCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(62, 62, 62)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton2)
                                            .addGap(16, 16, 16))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cokeamtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spriteamtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(popsmamtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(popmamtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(poplgamtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(totalamtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(269, 269, 269))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cokeCheckBox))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spriteCheckBox)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spriteamtLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(popsmCheckBox)
                                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(popsmamtLabel)))
                            .addComponent(cokeamtLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(popmCheckBox)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(popmamtLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(poplgCheckBox)
                            .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poplgamtLabel))
                        .addGap(18, 18, 18)
                        .addComponent(totalamtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton2))
                        .addGap(0, 152, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }
    private void cokeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        if(cokeCheckBox.isSelected())
        {
            jSpinner1.setEnabled(true);            
        }
        else
        {            
            jSpinner1.setValue(0);
            jSpinner1.setEnabled(false);
            cokeamtLabel.setEnabled(false);
        }
    }

    private void spriteCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        if(spriteCheckBox.isSelected())
        {           
            jSpinner2.setEnabled(true);                      
        }
        else
        {    
            jSpinner2.setValue(0);
            jSpinner2.setEnabled(false);
            spriteamtLabel.setEnabled(false);
        }
    }

    private void popsmCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        if(popsmCheckBox.isSelected())
        {            
            jSpinner3.setEnabled(true);                        
        }
        else
        {           
            jSpinner3.setValue(0);
            jSpinner3.setEnabled(false);
            popsmamtLabel.setEnabled(false);
        }
    }

    private void popmCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        if(popmCheckBox.isSelected())
        {               
            jSpinner4.setEnabled(true);                        
        }
        else
        {           
            jSpinner4.setValue(0);
            jSpinner4.setEnabled(false);
            popmamtLabel.setEnabled(false);           
        }        
    }

    private void poplgCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        if(poplgCheckBox.isSelected())
        {            
            jSpinner5.setEnabled(true);                        
        }
        else
        {           
            jSpinner5.setValue(0);
            jSpinner5.setEnabled(false);
            poplgamtLabel.setEnabled(false);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            item[0]=cokeCheckBox.getText();
            item[1]=spriteCheckBox.getText();
            item[2]=popsmCheckBox.getText();
            item[3]=popmCheckBox.getText();
            item[4]=poplgCheckBox.getText();
            int prc=(int)jSpinner1.getValue();            
            qty[0]=prc;
            prc=prc*25;
            total+=prc;
            cokeamtLabel.setText((int)jSpinner1.getValue()+"*25="+prc);
            
            prc=(int)jSpinner2.getValue();
            qty[1]=prc;           
            prc=prc*25;
            total+=prc;
            spriteamtLabel.setText((int)jSpinner2.getValue()+"*25="+prc);
            
            prc=(int)jSpinner3.getValue();
            qty[2]=prc;
            prc=prc*25;
            total+=prc;
            popsmamtLabel.setText((int)jSpinner3.getValue()+"*25="+prc);
            
            prc=(int)jSpinner4.getValue();
            qty[3]=prc;
            prc=prc*40;
            total+=prc;
            popmamtLabel.setText((int)jSpinner4.getValue()+"*40="+prc);
            
            prc=(int)jSpinner5.getValue();
            qty[4]=prc;
            prc=prc*50;
            total+=prc;
            poplgamtLabel.setText((int)jSpinner5.getValue()+"*50="+prc);
            
            cokeamtLabel.setVisible(true);
            spriteamtLabel.setVisible(true);
            popsmamtLabel.setVisible(true);
            popmamtLabel.setVisible(true);
            poplgamtLabel.setVisible(true);
            totalamtLabel.setText(totalamtLabel.getText()+":"+total+" INR");
            jButton1.setVisible(false);
            jButton3.setVisible(true);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
            jButton1.setVisible(true);
            jButton3.setVisible(false);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stadiumdb","root","");
            String str="";
            PreparedStatement pstmt = con.prepareStatement(str);             
            
                          str="insert into food_order(user_id,order_id,item1,item2,item3,item4,item5,amt) values(?,?,?,?,?,?,?,?)";
                          pstmt = con.prepareStatement(str);
                          pstmt.setInt(1,User.book_id);
                          pstmt.setInt(2,User.food_order_id);
                          pstmt.setString(3,item[0]+"*"+qty[0]);
                          pstmt.setString(4,item[1]+"*"+qty[1]);
                          pstmt.setString(5,item[2]+"*"+qty[2]);
                          pstmt.setString(6,item[3]+"*"+qty[3]); 
                          pstmt.setString(7,item[4]+"*"+qty[4]); 
                          pstmt.setObject(8,total); 
                         
                
            int op=pstmt.executeUpdate();
            if(op!=0)
            {
                JOptionPane.showMessageDialog(null,"Order confirmed with booking Number "+User.book_id+"\nYou can check all your bookings under view booking tab at homepage"); 
                UserHome userHome = new UserHome();
                userHome.setVisible(true);
                this.dispose();
            }
            con.close();
            } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Food().setVisible(true);              
            }  
        });
        
    }

    
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cokeCheckBox;
    private javax.swing.JLabel cokeamtLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox poplgCheckBox;
    private javax.swing.JLabel poplgamtLabel;
    private javax.swing.JCheckBox popmCheckBox;
    private javax.swing.JLabel popmamtLabel;
    private javax.swing.JCheckBox popsmCheckBox;
    private javax.swing.JLabel popsmamtLabel;
    private javax.swing.JCheckBox spriteCheckBox;
    private javax.swing.JLabel spriteamtLabel;
    private javax.swing.JLabel totalamtLabel;
   
}