
package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CheckOut extends javax.swing.JFrame {

    public CheckOut() {
        initComponents();
        dateLabel.setText(dateLabel.getText()+User.date);
        timeLabel1.setText(timeLabel1.getText()+User.time);
        evtLabel.setText(User.event);              
        seatNumLabel.setText(seatNumLabel.getText()+User.seat.toString());              
        seatFareLabel.setText(seatFareLabel.getText()+User.seatFare+" INR");
        amtLabel.setText(amtLabel.getText()+User.amount+" INR");
        seattypeLabel.setText(seattypeLabel.getText()+User.tseat);
        jRadioButton2.setSelected(true);
        jButton3.setVisible(false);
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TitlePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        timeLabel1 = new javax.swing.JLabel();
        evtLabel = new javax.swing.JLabel();
        seattypeLabel = new javax.swing.JLabel();
        amtLabel = new javax.swing.JLabel();
        seatFareLabel = new javax.swing.JLabel();
        seatNumLabel = new javax.swing.JLabel();
        matchNumLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Your Order Details");

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateLabel.setText("Date: ");

        timeLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timeLabel1.setText("Time: ");

        evtLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        evtLabel.setText("Match: ");

        seattypeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seattypeLabel.setText("Seat Type: ");

        amtLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amtLabel.setText("Amount: ");

        seatFareLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seatFareLabel.setText("Seat Fare: ");

        seatNumLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seatNumLabel.setText("Seat No: ");

        matchNumLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        matchNumLabel.setText("Match Details");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("All Prices Including GST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matchNumLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(timeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                        .addComponent(seatFareLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(seatNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seattypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                    .addComponent(amtLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(evtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(348, 348, 348))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(matchNumLabel)
                .addGap(3, 3, 3)
                .addComponent(evtLabel)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(seatNumLabel)
                    .addComponent(seattypeLabel))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel1)
                    .addComponent(seatFareLabel)
                    .addComponent(amtLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jButton1.setText("Pay Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Yes");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Do you want to preorder food?");

        jButton3.setText("Preorder Food");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addContainerGap(853, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addGap(37, 37, 37)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(0, 186, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
              try {
            Connection con;
            PreparedStatement pstmt = null;
            int op;
            int[] s=new int[User.seatCount];
            int count=0;
                while(count<User.seatCount)
                {
                    s[count]=User.seat.get(count);
                    count++;
                }
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stadiumdb","root","");
            String str="";
                  System.out.println("Seatcount"+User.seatCount);
                  switch (User.seatCount) {
                      case 1:
                          str="insert into booking(user_id,event,seat_type,seat_num1,status) values(?,?,?,?,?)";
                          pstmt = con.prepareStatement(str);
                          pstmt.setInt(1,User.uid);
                          pstmt.setString(2,User.event);
                          pstmt.setObject(3,User.tseat);
                          pstmt.setObject(4,s[0]);
                          pstmt.setString(5,"Pending");
                          break;
                      case 2:
                          str="insert into booking(user_id,event,seat_type,seat_num1,seat_num2,status) values(?,?,?,?,?,?)";
                          pstmt = con.prepareStatement(str);
                          pstmt.setInt(1,User.uid);
                          pstmt.setString(2,User.event);
                          pstmt.setObject(3,User.tseat);
                          pstmt.setObject(4,s[0]);
                          pstmt.setObject(5,s[1]);
                          pstmt.setString(6,"Pending");
                          break;
                      case 3:
                          str="insert into booking(user_id,event,seat_type,seat_num1,seat_num2,seat_num3,status) values(?,?,?,?,?,?,?)";
                          pstmt = con.prepareStatement(str);
                          pstmt.setInt(1,User.uid);
                          pstmt.setString(2,User.event);
                          pstmt.setObject(3,User.tseat);
                          pstmt.setObject(4,s[0]);
                          pstmt.setObject(5,s[1]);
                          pstmt.setObject(6,s[2]);
                          pstmt.setString(7,"Pending");
                          break;
                      case 4:
                          str="insert into booking(user_id,event,seat_type,seat_num1,seat_num2,seat_num3,seat_num4,status) values(?,?,?,?,?,?,?,?)";
                          pstmt = con.prepareStatement(str);
                          pstmt.setInt(1,User.uid);
                          pstmt.setString(2,User.event);
                          pstmt.setObject(3,User.tseat);
                          pstmt.setObject(4,s[0]);
                          pstmt.setObject(5,s[1]);
                          pstmt.setObject(6,s[2]);
                          pstmt.setObject(7,s[3]);
                          pstmt.setString(8,"Pending");
                          break;
                      case 5:
                          str="insert into booking(user_id,event,seat_type,seat_num1,seat_num2,seat_num3,seat_num4,seat_num5,status) values(?,?,?,?,?,?,?,?,?)";
                          pstmt = con.prepareStatement(str);
                          pstmt.setInt(1,User.uid);
                          pstmt.setString(2,User.event);
                          pstmt.setObject(3,User.tseat);
                          pstmt.setObject(4,s[0]);
                          pstmt.setObject(5,s[1]);
                          pstmt.setObject(6,s[2]);
                          pstmt.setObject(7,s[3]);
                          pstmt.setObject(8,s[4]);
                          pstmt.setString(9,"Pending");
                          break;
                      default:
                          break;
                  }
            op=pstmt.executeUpdate();
            
            str=User.dbupdate;
            pstmt = con.prepareStatement(str);
            
            if(op!=0)
            {
                int j=0,x;
                switch (User.eventindex) {
                    case 1:                            
                            j=0;
                                for(j=0;j<User.seatCount;j++)
                                {
                                    x=s[j];
                                    pstmt.setInt(1,x);
                                    op=pstmt.executeUpdate();
                                }
                            
                            break;
                    case 2:
                            j=0;
                            for(j=0;j<User.seatCount;j++)
                                {
                                    x=s[j];
                                    pstmt.setInt(1,x);
                                    op=pstmt.executeUpdate();
                                }
                               break;
                    case 3:
                            j=0;
                            for(j=0;j<User.seatCount;j++)
                                {
                                    x=s[j];
                                    pstmt.setInt(1,x);
                                    op=pstmt.executeUpdate();
                                }
                    default:
                        break;
                }  
                
                str="select max(booking_id) from booking ";
                pstmt=con.prepareStatement(str);
                ResultSet r = pstmt.executeQuery();
                if(r.next())
                User.book_id=r.getInt("max");
                System.out.print("BookID:"+User.book_id);
                String str1="Update booking set amt=? where booking_id=?";
                pstmt=con.prepareStatement(str1);
                pstmt.setLong(1,User.amount);
                pstmt.setInt(2,User.book_id);
                op=pstmt.executeUpdate();
                str="select max(food_id) from booking ";
                pstmt=con.prepareStatement(str);
                r = pstmt.executeQuery();
                if(r.next())
                User.food_order_id=r.getInt("max");
                JOptionPane.showMessageDialog(null,"Order confirmed with booking Number "+User.book_id+"\nYou can check all your bookings under view booking tab at homepage");
                if(jRadioButton1.isSelected())
                {
                jButton1.setVisible(false);
                jButton2.setVisible(false);
                jButton3.setVisible(true);
                }
                else
                {
                User.setNull();
                UserHome userHome = new UserHome();
                userHome.setVisible(true);
                this.dispose();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Unsuccessfull");
                User.setNull();
            }
            pstmt.close();
            con.close();            
        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int res=JOptionPane.showConfirmDialog(null,"You have selected to calcel your order!\nDo you really want to cancel your order" ,"Confirm Seat",JOptionPane.YES_NO_OPTION);
            if(res==0)
            {
                User.setNull();
                UserHome userHome = new UserHome();
                userHome.setVisible(true);
                this.dispose();                
            }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Food food = new Food();
        food.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JLabel amtLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel evtLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel matchNumLabel;
    private javax.swing.JLabel seatFareLabel;
    private javax.swing.JLabel seatNumLabel;
    private javax.swing.JLabel seattypeLabel;
    private javax.swing.JLabel timeLabel1;

}
