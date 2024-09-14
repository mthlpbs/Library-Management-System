/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ILS;
    import java.sql.Connection;
    import java.sql.Statement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.awt.HeadlessException;
    import javax.swing.JOptionPane;

/**
 *
 * @author Mithila Prabashwara
 */
public class LogIn extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame
     */
    
    public static String intSid;
    
    public LogIn() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        window = new javax.swing.JPanel();
        windowTitle = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        sidText = new javax.swing.JLabel();
        passwdText = new javax.swing.JLabel();
        signIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sponsCom = new javax.swing.JLabel();
        passwd = new javax.swing.JPasswordField();
        showPwd = new javax.swing.JCheckBox();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exeter's Public Library");
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(362, 220));

        window.setBackground(new java.awt.Color(255, 255, 255));

        windowTitle.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        windowTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        windowTitle.setText("Sign in to ILS");
        windowTitle.setPreferredSize(new java.awt.Dimension(570, 694));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logo.png"))); // NOI18N

        sid.setBackground(new java.awt.Color(241, 238, 238));
        sid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        sid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sid.setName(""); // NOI18N

        sidText.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        sidText.setText("SID");

        passwdText.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        passwdText.setText("Password");

        signIn.setBackground(new java.awt.Color(51, 102, 255));
        signIn.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        signIn.setForeground(new java.awt.Color(255, 255, 255));
        signIn.setText("Log in");
        signIn.setBorder(null);
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });

        sponsCom.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        sponsCom.setForeground(new java.awt.Color(179, 179, 179));
        sponsCom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sponsCom.setText("© 2024 Exeter City Council.");

        passwd.setBackground(new java.awt.Color(241, 238, 238));
        passwd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));

        showPwd.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        showPwd.setText("Show Password");
        showPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPwdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout windowLayout = new javax.swing.GroupLayout(window);
        window.setLayout(windowLayout);
        windowLayout.setHorizontalGroup(
            windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowLayout.createSequentialGroup()
                .addComponent(windowTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, windowLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sponsCom)
                .addGap(197, 197, 197))
            .addGroup(windowLayout.createSequentialGroup()
                .addGroup(windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(windowLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel1))
                    .addGroup(windowLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(windowLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwdText)
                            .addComponent(sidText)
                            .addComponent(passwd, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(showPwd)
                            .addComponent(sid)))
                    .addGroup(windowLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        windowLayout.setVerticalGroup(
            windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(windowTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(sidText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwdText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPwd)
                .addGap(18, 18, 18)
                .addComponent(signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sponsCom, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(window, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(window, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     Used to check the login credentials are correct or not.
     * */
    
    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        intSid = sid.getText();
        char[] intPwd = passwd.getPassword();
        String inputPwd = new String(intPwd);
        try {
            Valid.login(intSid, inputPwd);
            Connection connection = db.connect();
            Statement eqStat = connection.createStatement();
            ResultSet rs = eqStat.executeQuery("SELECT `SId` FROM `staff` WHERE `SId` LIKE '"+intSid+"'; ");
            if (rs.next()) {
                String id = rs.getString(1).toUpperCase();
                ResultSet rp = eqStat.executeQuery("SELECT `Password` FROM `staff` WHERE `SId` = '"+id+"'; ");
                if (rp.next()) {
                    String pwd = rp.getString(1);
                    if (!(pwd == null || pwd.trim().isEmpty())) {
                        if (inputPwd.matches(pwd)) {
                            Log.write(intSid+" is logged to the system successfully.");
                            Staff.setSid(id);
                            this.dispose();
                            Home homepage = new Home();
                            homepage.setVisible(true);
                            Log.write("The Home page is started successfully.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Wrong password. Try again");
                        }
                    } else {
                        Log.write("The login session of "+ intSid+" is failed due to missing the password.");
                        JOptionPane.showMessageDialog(null, "Something is went wrong with your account. Try again or contact your administrator","Message", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    Log.write("The login session of "+ intSid+" is failed due to database error. (missed/altered)");
                    JOptionPane.showMessageDialog(null, "Something is went wrong. Try again or contact your administrator","Message", JOptionPane.ERROR_MESSAGE);
                }
            } else { JOptionPane.showMessageDialog(null, "Wrong sid. Try again"); }
            } catch (SQLException e) {
                Log.write("An error occurred while fetching data from the database.\n"+" ".repeat(24)+"ERR MEG -"+e.getMessage());
                JOptionPane.showMessageDialog(null, "An unexpected error occurred. Try again or contact your administrator.","Message", JOptionPane.ERROR_MESSAGE);
            } catch (InvalidLoginCredentialsException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (HeadlessException e) {
                Log.write("Error is occurred.\n"+" ".repeat(24)+"ERR MEG -"+e.getMessage());
                JOptionPane.showMessageDialog(null, "An unexpected error occurred. Try again or contact your administrator","Message", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_signInActionPerformed

    //Used to add show password when click on showPwd checkbox
    private void showPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPwdActionPerformed
        if (showPwd.isSelected()) { passwd.setEchoChar((char)0);}
        else { passwd.setEchoChar('*');}
        
    }//GEN-LAST:event_showPwdActionPerformed

    public String getSid() {
        return sid.getText();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Log.write("The application is started successfully.");
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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField passwd;
    private javax.swing.JLabel passwdText;
    private javax.swing.JCheckBox showPwd;
    private javax.swing.JTextField sid;
    private javax.swing.JLabel sidText;
    private javax.swing.JButton signIn;
    private javax.swing.JLabel sponsCom;
    private javax.swing.JPanel window;
    private javax.swing.JLabel windowTitle;
    // End of variables declaration//GEN-END:variables
}

