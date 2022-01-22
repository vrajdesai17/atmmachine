/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atmmachine;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FastCash extends javax.swing.JFrame {

    /**
     * Creates new form FastCash
     */
    public FastCash() {
        initComponents();
    }
int MyAccNum;
    public FastCash(int AccNum) {
      initComponents();
        MyAccNum = AccNum;
        //AccNumLbl.setText(""+AccNum);
        GetBalance();
    }
    Connection conn = null;
    PreparedStatement pst = null,pst1=null;
    ResultSet Rs = null,Rs1=null;
    Statement St = null,St1=null;
    int OldBalance;
    private void GetBalance()
    {
        String Query = "select * from Accounttbl where AccNum='"+MyAccNum+"'";
        try{
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","Vraj@6636");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","aayushi17");
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","server");
            St1 = (Statement) con.createStatement();
            Rs1 = St1.executeQuery(Query);
            if(Rs1.next()){
               OldBalance = Rs1.getInt(9);
               BalLbl.setText("Rs"+OldBalance);
            }else
            {
                
            }
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MINISTATEMENTBTN = new javax.swing.JButton();
        DEPOSITBTN1 = new javax.swing.JButton();
        WITHDRAWALBTN = new javax.swing.JButton();
        FASTCASHBTN = new javax.swing.JButton();
        CHANGEPINBTN = new javax.swing.JButton();
        BALANCEBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BalLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 14));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("AVB BANK");
        jLabel6.setMinimumSize(new java.awt.Dimension(100, 14));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("FAST CASH PAGE");
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 14));

        MINISTATEMENTBTN.setBackground(new java.awt.Color(0, 102, 204));
        MINISTATEMENTBTN.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        MINISTATEMENTBTN.setForeground(new java.awt.Color(0, 102, 204));
        MINISTATEMENTBTN.setText("RS 10000");
        MINISTATEMENTBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MINISTATEMENTBTNMouseClicked(evt);
            }
        });
        MINISTATEMENTBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINISTATEMENTBTNActionPerformed(evt);
            }
        });

        DEPOSITBTN1.setBackground(new java.awt.Color(0, 102, 204));
        DEPOSITBTN1.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        DEPOSITBTN1.setForeground(new java.awt.Color(0, 102, 204));
        DEPOSITBTN1.setText("RS 1000");
        DEPOSITBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN1MouseClicked(evt);
            }
        });
        DEPOSITBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN1ActionPerformed(evt);
            }
        });

        WITHDRAWALBTN.setBackground(new java.awt.Color(0, 102, 204));
        WITHDRAWALBTN.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        WITHDRAWALBTN.setForeground(new java.awt.Color(0, 102, 204));
        WITHDRAWALBTN.setText("RS 2500");
        WITHDRAWALBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WITHDRAWALBTNMouseClicked(evt);
            }
        });
        WITHDRAWALBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WITHDRAWALBTNActionPerformed(evt);
            }
        });

        FASTCASHBTN.setBackground(new java.awt.Color(0, 102, 204));
        FASTCASHBTN.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        FASTCASHBTN.setForeground(new java.awt.Color(0, 102, 204));
        FASTCASHBTN.setText("RS 5000");
        FASTCASHBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FASTCASHBTNMouseClicked(evt);
            }
        });
        FASTCASHBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FASTCASHBTNActionPerformed(evt);
            }
        });

        CHANGEPINBTN.setBackground(new java.awt.Color(0, 102, 204));
        CHANGEPINBTN.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        CHANGEPINBTN.setForeground(new java.awt.Color(0, 102, 204));
        CHANGEPINBTN.setText("RS 20000");
        CHANGEPINBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHANGEPINBTNMouseClicked(evt);
            }
        });
        CHANGEPINBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHANGEPINBTNActionPerformed(evt);
            }
        });

        BALANCEBTN.setBackground(new java.awt.Color(0, 102, 204));
        BALANCEBTN.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        BALANCEBTN.setForeground(new java.awt.Color(0, 102, 204));
        BALANCEBTN.setText("RS 25000");
        BALANCEBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BALANCEBTNMouseClicked(evt);
            }
        });
        BALANCEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BALANCEBTNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("LOGOUT");
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 14));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        BalLbl.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        BalLbl.setForeground(new java.awt.Color(0, 0, 255));
        BalLbl.setText("BALANCE:");
        BalLbl.setMinimumSize(new java.awt.Dimension(100, 14));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CHANGEPINBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FASTCASHBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DEPOSITBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MINISTATEMENTBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WITHDRAWALBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BALANCEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(BalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(257, 257, 257))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(299, 299, 299))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(BalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEPOSITBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WITHDRAWALBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MINISTATEMENTBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FASTCASHBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BALANCEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHANGEPINBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MINISTATEMENTBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINISTATEMENTBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MINISTATEMENTBTNActionPerformed

    private void DEPOSITBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN1ActionPerformed

    private void WITHDRAWALBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WITHDRAWALBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WITHDRAWALBTNActionPerformed

    private void FASTCASHBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FASTCASHBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FASTCASHBTNActionPerformed

    private void CHANGEPINBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHANGEPINBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHANGEPINBTNActionPerformed

    private void BALANCEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BALANCEBTNActionPerformed
       
    }//GEN-LAST:event_BALANCEBTNActionPerformed

    private void DEPOSITBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN1MouseClicked
      if(OldBalance < 1000){
          JOptionPane.showMessageDialog(this, "No Enough Balance");
    }
        {
            try{
            String Query = "Update AccountTbl set Balance =? Where AccNum =? ";
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","Vraj@6636");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","aayushi17");
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","server");
            PreparedStatement ps=con.prepareStatement(Query);
            ps.setInt(1, OldBalance-1000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
        this. dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        } 
    }//GEN-LAST:event_DEPOSITBTN1MouseClicked

    private void WITHDRAWALBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WITHDRAWALBTNMouseClicked
        if(OldBalance < 2500){
          JOptionPane.showMessageDialog(this, "No Enough Balance");
    }
        {
            try{
            String Query = "Update AccountTbl set Balance =? Where AccNum =? ";
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","Vraj@6636");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","aayushi17");
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","server");
            PreparedStatement ps=con.prepareStatement(Query);
            ps.setInt(1, OldBalance-2500);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
        this. dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        } 
    }//GEN-LAST:event_WITHDRAWALBTNMouseClicked

    private void FASTCASHBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FASTCASHBTNMouseClicked
     if(OldBalance < 5000){
          JOptionPane.showMessageDialog(this, "No Enough Balance");
    }
        {
            try{
            String Query = "Update AccountTbl set Balance =? Where AccNum =? ";
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","Vraj@6636");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","aayushi17");
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","server");
            PreparedStatement ps=con.prepareStatement(Query);
            ps.setInt(1, OldBalance-5000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
        this. dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        } 
    }//GEN-LAST:event_FASTCASHBTNMouseClicked

    private void MINISTATEMENTBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINISTATEMENTBTNMouseClicked
        if(OldBalance < 10000){
          JOptionPane.showMessageDialog(this, "No Enough Balance");
    }
        {
            try{
            String Query = "Update AccountTbl set Balance =? Where AccNum =? ";
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","Vraj@6636");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","aayushi17");
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","server");
            PreparedStatement ps=con.prepareStatement(Query);
            ps.setInt(1, OldBalance-10000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
        this. dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        } 
    }//GEN-LAST:event_MINISTATEMENTBTNMouseClicked

    private void CHANGEPINBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHANGEPINBTNMouseClicked
        if(OldBalance < 20000){
          JOptionPane.showMessageDialog(this, "No Enough Balance");
    }
        {
            try{
            String Query = "Update AccountTbl set Balance =? Where AccNum =? ";
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","Vraj@6636");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","aayushi17");
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","server");
            PreparedStatement ps=con.prepareStatement(Query);
            ps.setInt(1, OldBalance-20000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
        this. dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        } 
    }//GEN-LAST:event_CHANGEPINBTNMouseClicked

    private void BALANCEBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BALANCEBTNMouseClicked
        if(OldBalance < 25000){
          JOptionPane.showMessageDialog(this, "No Enough Balance");
    }
        {
            try{
            String Query = "Update AccountTbl set Balance =? Where AccNum =? ";
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","Vraj@6636");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","aayushi17");
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","server");
            PreparedStatement ps=con.prepareStatement(Query);
            ps.setInt(1, OldBalance-25000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
        this. dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        } 
    }//GEN-LAST:event_BALANCEBTNMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new MainMenu().setVisible(true);
        this. dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(1);
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BALANCEBTN;
    private javax.swing.JLabel BalLbl;
    private javax.swing.JButton CHANGEPINBTN;
    private javax.swing.JButton DEPOSITBTN1;
    private javax.swing.JButton FASTCASHBTN;
    private javax.swing.JButton MINISTATEMENTBTN;
    private javax.swing.JButton WITHDRAWALBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

