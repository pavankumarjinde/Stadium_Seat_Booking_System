package Demo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

public class AddMatch extends JFrame {
    String stadium = "Wankhede Stadium";
    String event = "";
    String date = "";
    String time = "";
    private JLabel TitleLabel;
    private JPanel TitlePanel;
    private ButtonGroup buttonGroup1;
    private JLabel dateLabel1;
    private JLabel dateLabel2;
    private JLabel dateLabel3;
    private JTextField dateTextField;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JTextField matchTextField;
    private JButton proceedButton;
    private JLabel timeLabel1;
    private JLabel timeLabel2;
    private JLabel timeLabel3;
    private JTextField timeTextField;

    public AddMatch() {
        this.initComponents();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stadiumdb","root","");
            String str = "select event_name,start_date,start_time from sportevent";
            PreparedStatement pstmt = con.prepareStatement(str);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                this.jRadioButton1.setText(rs.getString(1));
                this.dateLabel1.setText(rs.getString(2));
                this.timeLabel1.setText(rs.getString(3));
                User.event = rs.getString(1);
                User.eventindex = 1;
                this.jRadioButton1.setEnabled(false);
            }

            if (rs.next()) {
                this.jRadioButton2.setText(rs.getString(1));
                this.dateLabel2.setText(rs.getString(2));
                this.timeLabel2.setText(rs.getString(3));
                this.jRadioButton2.setEnabled(false);
            }

            if (rs.next()) {
                this.jRadioButton3.setText(rs.getString(1));
                this.dateLabel3.setText(rs.getString(2));
                this.timeLabel3.setText(rs.getString(3));
                this.jRadioButton3.setEnabled(false);
            }

            con.close();
            this.proceedButton.setVisible(false);
            this.jPanel2.setVisible(false);
        } catch (SQLException var5) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, (String)null, var5);
        }

    }

    private void initComponents() {
        this.buttonGroup1 = new ButtonGroup();
        this.TitlePanel = new JPanel();
        this.TitleLabel = new JLabel();
        this.jPanel1 = new JPanel();
        this.jRadioButton1 = new JRadioButton();
        this.jRadioButton3 = new JRadioButton();
        this.jRadioButton2 = new JRadioButton();
        this.jLabel3 = new JLabel();
        this.dateLabel1 = new JLabel();
        this.dateLabel2 = new JLabel();
        this.dateLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.timeLabel1 = new JLabel();
        this.timeLabel2 = new JLabel();
        this.timeLabel3 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel2 = new JLabel();
        this.proceedButton = new JButton();
        this.jPanel2 = new JPanel();
        this.jLabel6 = new JLabel();
        this.matchTextField = new JTextField();
        this.jLabel1 = new JLabel();
        this.jLabel7 = new JLabel();
        this.timeTextField = new JTextField();
        this.dateTextField = new JTextField();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jButton1 = new JButton();
        this.jLabel8 = new JLabel();
        this.setDefaultCloseOperation(3);
        this.TitlePanel.setBackground(SystemColor.textHighlight);
        this.TitlePanel.setBorder(new SoftBevelBorder(0));
        this.TitlePanel.setPreferredSize(new Dimension(1045, 120));
        this.TitleLabel.setBackground(new Color(0, 0, 153));
        this.TitleLabel.setFont(new Font("Times New Roman", 1, 36));
        this.TitleLabel.setHorizontalAlignment(0);
        this.TitleLabel.setText("Stadium Seat Booking System");
        this.TitleLabel.setIconTextGap(0);
        GroupLayout TitlePanelLayout = new GroupLayout(this.TitlePanel);
        this.TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(TitlePanelLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, TitlePanelLayout.createSequentialGroup().addContainerGap(288, 32767).addComponent(this.TitleLabel, -2, 504, -2).addGap(252, 252, 252)));
        TitlePanelLayout.setVerticalGroup(TitlePanelLayout.createParallelGroup(Alignment.LEADING).addGroup(TitlePanelLayout.createSequentialGroup().addGap(19, 19, 19).addComponent(this.TitleLabel, -2, 75, -2).addContainerGap(20, 32767)));
        this.jPanel1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.buttonGroup1.add(this.jRadioButton1);
        this.jRadioButton1.setText("Add Event");
        this.jRadioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddMatch.this.jRadioButton1ActionPerformed(evt);
            }
        });
        this.buttonGroup1.add(this.jRadioButton3);
        this.jRadioButton3.setText("Add Event");
        this.jRadioButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddMatch.this.jRadioButton3ActionPerformed(evt);
            }
        });
        this.buttonGroup1.add(this.jRadioButton2);
        this.jRadioButton2.setText("Add Event");
        this.jRadioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddMatch.this.jRadioButton2ActionPerformed(evt);
            }
        });
        this.jLabel3.setFont(new Font("Tahoma", 1, 11));
        this.jLabel3.setText("Date(yy/mm/dd)");
        this.dateLabel1.setText("No Date Set");
        this.dateLabel2.setText("No Date Set");
        this.dateLabel3.setText("No Date Set");
        this.jLabel4.setFont(new Font("Tahoma", 1, 11));
        this.jLabel4.setText("Time");
        this.timeLabel1.setText("No Time Set");
        this.timeLabel2.setText("No Time Set");
        this.timeLabel3.setText("No Time Set");
        this.jLabel5.setFont(new Font("Tahoma", 1, 11));
        this.jLabel5.setText("Match");
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(25, 25, 25).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jLabel5).addComponent(this.jRadioButton1, -1, 190, 32767).addComponent(this.jRadioButton2, -1, -1, 32767).addComponent(this.jRadioButton3, -1, -1, 32767)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.dateLabel1, Alignment.LEADING, -2, 74, -2).addComponent(this.jLabel3, Alignment.LEADING).addComponent(this.dateLabel2, Alignment.LEADING, -2, 74, -2).addComponent(this.dateLabel3, Alignment.LEADING, -2, 74, -2)).addGap(50, 50, 50).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel4, -2, 46, -2).addComponent(this.timeLabel1, -2, 74, -2)).addGroup(Alignment.TRAILING, jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.timeLabel2, -2, 74, -2).addComponent(this.timeLabel3, -2, 74, -2))).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(12, 12, 12).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel3, -2, 20, -2).addComponent(this.jLabel5).addComponent(this.jLabel4, -1, -1, 32767)).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jRadioButton1).addComponent(this.dateLabel1).addComponent(this.timeLabel1)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jRadioButton2).addComponent(this.dateLabel2).addComponent(this.timeLabel2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jRadioButton3).addComponent(this.dateLabel3).addComponent(this.timeLabel3)).addContainerGap(20, 32767)));
        this.jLabel2.setFont(new Font("Tahoma", 1, 11));
        this.jLabel2.setText("Select from following events ");
        this.proceedButton.setText("Proceed");
        this.proceedButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddMatch.this.proceedButtonActionPerformed(evt);
            }
        });
        this.jPanel2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.jLabel6.setText("Time(HH:MM:SS) 24 Hr Format");
        this.jLabel6.setEnabled(false);
        this.jLabel1.setText("Date(yyyy-mm-dd)");
        this.jLabel1.setEnabled(false);
        this.jLabel7.setText("New Match Title");
        this.jLabel9.setText("New Match Date");
        this.jLabel10.setText("New Match Time");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(28, 28, 28).addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jLabel7).addComponent(this.jLabel9).addComponent(this.jLabel10)).addGap(80, 80, 80).addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.matchTextField, -2, 249, -2).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.dateTextField).addComponent(this.timeTextField, -2, 93, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel1).addComponent(this.jLabel6)))).addContainerGap(33, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(25, 25, 25).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel7).addComponent(this.matchTextField, -2, -1, -2)).addGap(25, 25, 25).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.dateTextField, -2, -1, -2).addComponent(this.jLabel9).addComponent(this.jLabel1)).addGap(25, 25, 25).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.timeTextField, -2, -1, -2).addComponent(this.jLabel10).addComponent(this.jLabel6)).addContainerGap(35, 32767)));
        this.jButton1.setText("Exit");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddMatch.this.jButton1ActionPerformed(evt);
            }
        });
        this.jLabel8.setFont(new Font("Tahoma", 1, 14));
        this.jLabel8.setText("Add Match");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.TitlePanel, -1, 1050, 32767).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel2).addGroup(layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.jPanel1, -1, -1, 32767).addGroup(Alignment.LEADING, layout.createSequentialGroup().addComponent(this.proceedButton).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton1)).addComponent(this.jPanel2, -1, -1, 32767))).addGap(282, 282, 282)).addGroup(layout.createSequentialGroup().addGap(494, 494, 494).addComponent(this.jLabel8).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.TitlePanel, -2, -1, -2).addGap(27, 27, 27).addComponent(this.jLabel8).addGap(16, 16, 16).addComponent(this.jLabel2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel1, -2, -1, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel2, -2, -1, -2).addGap(18, 18, 18).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.proceedButton).addComponent(this.jButton1)).addContainerGap(203, 32767)));
        this.pack();
        this.setLocationRelativeTo((Component)null);
    }

    private void proceedButtonActionPerformed(ActionEvent evt) {
        this.event = this.matchTextField.getText();
        this.date = this.dateTextField.getText();
        this.time = this.timeTextField.getText();
        LocalDate dt = LocalDate.parse(this.date, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalTime t = LocalTime.parse(this.time, DateTimeFormatter.ISO_LOCAL_TIME);

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stadiumdb","root","");
            String str = "insert into sportevent values(?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(str);
            pstmt.setString(1, this.stadium);
            pstmt.setString(2, this.event);
            pstmt.setObject(3, dt);
            pstmt.setObject(4, t);
            int op = pstmt.executeUpdate();
            if (op != 0) {
                JOptionPane.showMessageDialog((Component)null, "Event Added Successfully");
            }

            con.close();
        } catch (SQLException var8) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

    }

    private void jRadioButton1ActionPerformed(ActionEvent evt) {
        Admin.eventindex = 1;
        this.proceedButton.setVisible(true);
        this.jPanel2.setVisible(true);
    }

    private void jRadioButton2ActionPerformed(ActionEvent evt) {
        Admin.eventindex = 2;
        this.proceedButton.setVisible(true);
        this.jPanel2.setVisible(true);
    }

    private void jRadioButton3ActionPerformed(ActionEvent evt) {
        Admin.eventindex = 3;
        this.proceedButton.setVisible(true);
        this.jPanel2.setVisible(true);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        AdminHome adminHome = new AdminHome();
        adminHome.setVisible(true);
        this.dispose();
    }

    public static void main(String[] args) {
        try {
            LookAndFeelInfo[] var4;
            int var3 = (var4 = UIManager.getInstalledLookAndFeels()).length;

            for(int var2 = 0; var2 < var3; ++var2) {
                LookAndFeelInfo info = var4[var2];
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(AddMatch.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(AddMatch.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(AddMatch.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(AddMatch.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new AddMatch()).setVisible(true);
            }
        });
    }
}
