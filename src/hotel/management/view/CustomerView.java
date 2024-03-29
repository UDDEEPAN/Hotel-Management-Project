/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.management.view;

import hotel.management.controller.CustomerController;
import hotel.management.dto.CustomerDto;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class CustomerView extends javax.swing.JFrame {

    private CustomerController customerController;

    /**
     * Creates new form CustomerView
     */
    public CustomerView() {
        customerController = new CustomerController();
        initComponents();
        loadCustomers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerlbl = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();
        custidtxt = new javax.swing.JTextField();
        namelbl = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        numberlbl = new javax.swing.JLabel();
        numbertxt = new javax.swing.JTextField();
        addresslbl = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        savebtt = new javax.swing.JButton();
        updatebtt = new javax.swing.JButton();
        deletebtt = new javax.swing.JButton();
        serchbtt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmodel = new javax.swing.JTable();
        niclbl = new javax.swing.JLabel();
        nictxt = new javax.swing.JTextField();
        citylbl = new javax.swing.JLabel();
        citytxt = new javax.swing.JTextField();
        provincelbl = new javax.swing.JLabel();
        provincetxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerlbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        headerlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlbl.setText("Customer Mangae Form ");

        idlbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idlbl.setText("Cust ID");

        custidtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        namelbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        namelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namelbl.setText("Name ");

        nametxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        numberlbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numberlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberlbl.setText("Mobile Number");

        numbertxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        addresslbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addresslbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addresslbl.setText("Address");

        addresstxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        savebtt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        savebtt.setText("Save");
        savebtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebttActionPerformed(evt);
            }
        });

        updatebtt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updatebtt.setText("Update");
        updatebtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebttActionPerformed(evt);
            }
        });

        deletebtt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deletebtt.setText("Delete");
        deletebtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebttActionPerformed(evt);
            }
        });

        serchbtt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        serchbtt.setText("Serach");
        serchbtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serchbttActionPerformed(evt);
            }
        });

        tblmodel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblmodel);

        niclbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        niclbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        niclbl.setText("Nic");

        nictxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nictxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nictxtActionPerformed(evt);
            }
        });

        citylbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        citylbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        citylbl.setText("City");

        citytxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        provincelbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        provincelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        provincelbl.setText("Province");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(niclbl, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numbertxt, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nictxt)
                            .addComponent(custidtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(303, 303, 303)
                                .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(savebtt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(updatebtt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(deletebtt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(serchbtt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(68, 68, 68)
                                .addComponent(addresstxt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(citylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(provincelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(citytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(provincetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(citylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(citytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provincelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provincetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nictxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(niclbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serchbtt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nictxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nictxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nictxtActionPerformed

    private void savebttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebttActionPerformed
        saveCustomer();
    }//GEN-LAST:event_savebttActionPerformed

    private void updatebttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebttActionPerformed
        updateCustomer();
    }//GEN-LAST:event_updatebttActionPerformed

    private void deletebttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebttActionPerformed
        DeleteCustomer();
    }//GEN-LAST:event_deletebttActionPerformed

    private void serchbttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serchbttActionPerformed
        SerchCustomer();
    }//GEN-LAST:event_serchbttActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addresslbl;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JLabel citylbl;
    private javax.swing.JTextField citytxt;
    private javax.swing.JTextField custidtxt;
    private javax.swing.JButton deletebtt;
    private javax.swing.JLabel headerlbl;
    private javax.swing.JLabel idlbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel niclbl;
    private javax.swing.JTextField nictxt;
    private javax.swing.JLabel numberlbl;
    private javax.swing.JTextField numbertxt;
    private javax.swing.JLabel provincelbl;
    private javax.swing.JTextField provincetxt;
    private javax.swing.JButton savebtt;
    private javax.swing.JButton serchbtt;
    private javax.swing.JTable tblmodel;
    private javax.swing.JButton updatebtt;
    // End of variables declaration//GEN-END:variables
   private void saveCustomer() {
        try {
            CustomerDto customerDto = new CustomerDto(custidtxt.getText(),
                    nametxt.getText(),
                    addresstxt.getText(),
                    citytxt.getText(),
                    provincetxt.getText(),
                    Integer.parseInt(numbertxt.getText()),
                    nictxt.getText());

            String resp = customerController.save(customerDto);
            JOptionPane.showMessageDialog(this, resp);
            loadCustomers();
            clear();
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void clear() {
        custidtxt.setText("");
        nametxt.setText("");
        addresstxt.setText("");
        citytxt.setText("");
        provincetxt.setText("");
        nictxt.setText("");
        numbertxt.setText("");

    }

    private void loadCustomers() {
        try {
            String columns[] = {"cust_id", "name", "address", "city", "nic"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {

                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            tblmodel.setModel(dtm);

            List<CustomerDto> customerDtos = customerController.getAll();
            for (CustomerDto customerDto : customerDtos) {
                Object[] rowData = {customerDto.getCustid(),
                    customerDto.getName(),
                    customerDto.getAddress(),
                    customerDto.getCity(),
                    customerDto.getProvince(),
                    customerDto.getMobilenumber()};
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    private void updateCustomer() {
        try {
            CustomerDto dto = new CustomerDto();
            dto.setCustid(custidtxt.getText());
            dto.setName(nametxt.getText());
            dto.setAddress(addresstxt.getText());
            dto.setCity(citytxt.getText());
            dto.setProvince(provincetxt.getText());
            dto.setNic(nictxt.getText());
            dto.setMobilenumber(Integer.valueOf(numbertxt.getText()));

            String resp = customerController.update(dto);
            JOptionPane.showMessageDialog(this, resp);
            loadCustomers();
            clear();
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    private void DeleteCustomer() {
        try {
            String custId = custidtxt.getText();
            String resp = customerController.delete(custId);
            JOptionPane.showMessageDialog(this, resp);
            loadCustomers();
            clear();
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void SerchCustomer() {
        try {
            String id = tblmodel.getValueAt(tblmodel.getSelectedRow(), 0).toString();

            CustomerDto dto = customerController.get(id);
            if (dto != null) {
                custidtxt.setText(dto.getCustid());
                nametxt.setText(dto.getName());
                addresstxt.setText(dto.getAddress());
                citytxt.setText(dto.getCity());
                provincetxt.setText(dto.getProvince());
                numbertxt.setText(Integer.toString(dto.getMobilenumber()));
                nictxt.setText(dto.getNic());
                

            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }

        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
