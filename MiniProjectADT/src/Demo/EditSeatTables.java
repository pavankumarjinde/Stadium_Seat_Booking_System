package Demo;

import Seat.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class EditSeatTables extends javax.swing.JFrame {

    String str;
    public EditSeatTables() {
        initComponents();
        if(Admin.eventindex==0)
        {
            JOptionPane.showMessageDialog(null,"No Event Selected");            
        }        
        jButton1.setVisible(false);
        jButton2.setVisible(false);         
    }

    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        TitlePanel1 = new javax.swing.JPanel();
        TitleLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        proceedButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        royalBoxRadioButton = new javax.swing.JRadioButton();
        gen1RadioButton = new javax.swing.JRadioButton();
        gen2RadioButton = new javax.swing.JRadioButton();
        int1RadioButton = new javax.swing.JRadioButton();
        vipBox2RadioButton = new javax.swing.JRadioButton();
        int2RadioButton = new javax.swing.JRadioButton();
        corp2RadioButton = new javax.swing.JRadioButton();
        platinumRadioButton = new javax.swing.JRadioButton();
        prem2RadioButton = new javax.swing.JRadioButton();
        corp1RadioButton = new javax.swing.JRadioButton();
        vipbox1RadioButton = new javax.swing.JRadioButton();
        prem1RadioButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        TitlePanel.setBackground(java.awt.SystemColor.textHighlight);
        TitlePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TitlePanel.setPreferredSize(new java.awt.Dimension(766, 120));

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
                .addContainerGap(288, Short.MAX_VALUE)
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TitlePanel1.setBackground(java.awt.SystemColor.textHighlight);
        TitlePanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TitlePanel1.setPreferredSize(new java.awt.Dimension(766, 120));

        TitleLabel1.setBackground(new java.awt.Color(0, 0, 153));
        TitleLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); 
        TitleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel1.setText("Stadium Seat Booking System");
        TitleLabel1.setIconTextGap(0);

        javax.swing.GroupLayout TitlePanel1Layout = new javax.swing.GroupLayout(TitlePanel1);
        TitlePanel1.setLayout(TitlePanel1Layout);
        TitlePanel1Layout.setHorizontalGroup(
            TitlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanel1Layout.createSequentialGroup()
                .addContainerGap(351, Short.MAX_VALUE)
                .addComponent(TitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        TitlePanel1Layout.setVerticalGroup(
            TitlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Select your seating area to proceed");

        proceedButton.setText("Proceed");
        proceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedButtonActionPerformed(evt);
            }
        });

        royalBoxRadioButton.setText("Royal Box");
        royalBoxRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                royalBoxRadioButtonActionPerformed(evt);
            }
        });

        gen1RadioButton.setText("General Addmission West");
        gen1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen1RadioButtonActionPerformed(evt);
            }
        });

        gen2RadioButton.setText("General Addmission East");
        gen2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen2RadioButtonActionPerformed(evt);
            }
        });

        int1RadioButton.setText("International Seats West");
        int1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int1RadioButtonActionPerformed(evt);
            }
        });

        vipBox2RadioButton.setText("VIP Box East");
        vipBox2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vipBox2RadioButtonActionPerformed(evt);
            }
        });

        int2RadioButton.setText("International Seats East");
        int2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int2RadioButtonActionPerformed(evt);
            }
        });

        corp2RadioButton.setText("Corporate Box East");
        corp2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corp2RadioButtonActionPerformed(evt);
            }
        });

        platinumRadioButton.setText("Platinum Seats");
        platinumRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platinumRadioButtonActionPerformed(evt);
            }
        });

        prem2RadioButton.setText("Premium Seats East");
        prem2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prem2RadioButtonActionPerformed(evt);
            }
        });

        corp1RadioButton.setText("Corporate Box West");
        corp1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corp1RadioButtonActionPerformed(evt);
            }
        });

        vipbox1RadioButton.setText("VIP Box West");
        vipbox1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vipbox1RadioButtonActionPerformed(evt);
            }
        });

        prem1RadioButton.setText("Premium Seats West");
        prem1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prem1RadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gen2RadioButton)
                    .addComponent(platinumRadioButton)
                    .addComponent(royalBoxRadioButton)
                    .addComponent(vipbox1RadioButton)
                    .addComponent(vipBox2RadioButton)
                    .addComponent(prem1RadioButton)
                    .addComponent(prem2RadioButton)
                    .addComponent(corp1RadioButton)
                    .addComponent(corp2RadioButton)
                    .addComponent(int1RadioButton)
                    .addComponent(int2RadioButton)
                    .addComponent(gen1RadioButton))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(platinumRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(royalBoxRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vipbox1RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vipBox2RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prem1RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prem2RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(corp1RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(corp2RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(int1RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(int2RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gen1RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gen2RadioButton)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel4.setText("Note: Following action will set all seats of selected area to available");
        jLabel4.setMaximumSize(new java.awt.Dimension(150, 50));
        jLabel4.setMinimumSize(new java.awt.Dimension(150, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(proceedButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(proceedButton)
                .addGap(39, 39, 39))
        );

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/venue_40 - Copy.jpg"))); // NOI18N
        jLabel1.setIconTextGap(0);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Finish Editing");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel3.setText("Edit Seats Arrangement");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1113, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitlePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void platinumRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Admin.seatname="platinumseat";
    }

    private void royalBoxRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Admin.seatname="royalbox";
    }

    private void vipbox1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
       Admin.seatname="vipboxwest";
    }
    private void vipBox2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Admin.seatname="vipboxeast";
    }

    private void prem1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
           Admin.seatname="premiumseatwest";
    }

    private void prem2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
           Admin.seatname="premiumseateast";
    }

    private void corp1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
              Admin.seatname="corporateboxwest";
    }

    private void corp2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
               Admin.seatname="corporateboxeast";
    }

    private void int1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
             Admin.seatname="interenationalwest";
    }
    private void int2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
            Admin.seatname="interenationaleast";
    }

    private void gen1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
              Admin.seatname="generalwest";
    }

    private void gen2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {

      Admin.seatname="generaleast";
    }

    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String s="";
        if(platinumRadioButton.isSelected())
        {
            s=resetSeat("platinumseat");
            str=str+s;
        }
        if(royalBoxRadioButton.isSelected())
        {
            s=resetSeat("royalbox");
            str=str+","+s;
        }
        if(vipbox1RadioButton.isSelected())
        {
            s=resetSeat("vipboxwest");
            str=str+","+s;
        }
        if(vipBox2RadioButton.isSelected())
        {
            s=resetSeat("vipboxeast");
            str=str+","+s;
        }
        if(prem1RadioButton.isSelected())
        {
            s=resetSeat("premiumseatwest");
            str=str+","+s;
        }
        if(prem2RadioButton.isSelected())
        {
            s=resetSeat("premiumseateast");
            str=str+","+s;
        }
        if(corp1RadioButton.isSelected())
        {
             s=resetSeat("corporateboxwest");
             str=str+","+s;
        }
        if(corp2RadioButton.isSelected())
        {
            s=resetSeat("corporateboxeast");
            str=str+","+s;
        }
        if(int1RadioButton.isSelected())
        {
            s=resetSeat("interenationalwest");
            str=str+","+s;
        }
        if(int2RadioButton.isSelected())
        {
            s=resetSeat("interenationaleast");
            str=str+","+s;
        }
        if(gen1RadioButton.isSelected())
        {
            s=resetSeat("generalwest");
            str=str+","+s;
        }
        if(gen2RadioButton.isSelected())
        {
            s=resetSeat("generaleast");
            str=str+","+s;
        }
        JOptionPane.showMessageDialog(null,str);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        proceedButton.setVisible(false);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        proceedButton.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false); 
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        AdminHome adminHome = new AdminHome();
        adminHome.setVisible(true);
        this.dispose();
    }
    private String resetSeat(String a)
    {
        int op;
        String str="Alter table "+a+" DROP  COLUMN "+Admin.status;
        String str1="Alter table "+a+" add  COLUMN "+Admin.status+" boolean default(true)";
        
        try{
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stadiumdb","root","");
            
            PreparedStatement pstmt = con.prepareStatement(str);            
            op = pstmt.executeUpdate();
            
            pstmt=con.prepareStatement(str1);
            op=pstmt.executeUpdate();
            if(op==0)
               return (a);
            
            con.close();
            } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return(" Error");
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
            java.util.logging.Logger.getLogger(EditSeatTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSeatTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSeatTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSeatTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditSeatTables().setVisible(true);
            }
        });
    }

  
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TitleLabel1;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel TitlePanel1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton corp1RadioButton;
    private javax.swing.JRadioButton corp2RadioButton;
    private javax.swing.JRadioButton gen1RadioButton;
    private javax.swing.JRadioButton gen2RadioButton;
    private javax.swing.JRadioButton int1RadioButton;
    private javax.swing.JRadioButton int2RadioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton platinumRadioButton;
    private javax.swing.JRadioButton prem1RadioButton;
    private javax.swing.JRadioButton prem2RadioButton;
    private javax.swing.JButton proceedButton;
    private javax.swing.JRadioButton royalBoxRadioButton;
    private javax.swing.JRadioButton vipBox2RadioButton;
    private javax.swing.JRadioButton vipbox1RadioButton;

}
