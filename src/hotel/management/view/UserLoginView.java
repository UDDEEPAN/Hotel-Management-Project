/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.management.view;

import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class UserLoginView extends javax.swing.JFrame {

    /**
     * Creates new form UserLoginView
     */
    public UserLoginView() {
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

        loginlbl = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();
        nametextfield = new javax.swing.JTextField();
        passwordlbl = new javax.swing.JLabel();
        passwordtxtfield = new javax.swing.JTextField();
        submitbtt = new javax.swing.JButton();
        cancelbtt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginlbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginlbl.setText("LOGIN  APPLICATION");

        namelbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        namelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namelbl.setText("User Name");

        nametextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        passwordlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordlbl.setText("Password");

        submitbtt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitbtt.setText("Submit");
        submitbtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbttActionPerformed(evt);
            }
        });

        cancelbtt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelbtt.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(passwordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordtxtfield, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(nametextfield))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitbtt)
                .addGap(66, 66, 66)
                .addComponent(cancelbtt)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(loginlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitbtt)
                    .addComponent(cancelbtt))
                .addGap(178, 178, 178))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitbttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbttActionPerformed
        if(nametextfield.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Please Fill the Username");
        }
        if(passwordtxtfield.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Fill the Password");
        }
         if(nametextfield.getText().contains("uddeepana")&&passwordtxtfield.getText().contains("UK EXPRESS2003")){
            JOptionPane.showMessageDialog(null, "Login Succesfully");
            MainView mv1 = new MainView();
            mv1.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Wrong Username Or Password","Message",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_submitbttActionPerformed

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
            java.util.logging.Logger.getLogger(UserLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtt;
    private javax.swing.JLabel loginlbl;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField nametextfield;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JTextField passwordtxtfield;
    private javax.swing.JButton submitbtt;
    // End of variables declaration//GEN-END:variables

   
        
      }
