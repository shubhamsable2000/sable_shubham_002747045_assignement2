/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import model.City;
import model.Community;
import model.Hospital;
import model.SystemAdmin;

/**
 *
 * @author shubham
 */
public class CreateHospitalPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateHospitalPanel
     */
    SystemAdmin sysAdmin;
    public CreateHospitalPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateCommunities();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblHospitalName = new javax.swing.JLabel();
        lblHospitalphoneNumber = new javax.swing.JLabel();
        lblHospitalCommunity = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        txtHospitalPhone = new javax.swing.JTextField();
        jComboBoxHospitalCommunity = new javax.swing.JComboBox<>();
        btnSaveHospital = new javax.swing.JButton();

        setBackground(new java.awt.Color(43, 145, 191));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Hospital");

        lblHospitalName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHospitalName.setForeground(new java.awt.Color(255, 255, 255));
        lblHospitalName.setText("Hospital Name");

        lblHospitalphoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHospitalphoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblHospitalphoneNumber.setText("Hospital Phone Number");

        lblHospitalCommunity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHospitalCommunity.setForeground(new java.awt.Color(255, 255, 255));
        lblHospitalCommunity.setText("Hospital Community");

        btnSaveHospital.setForeground(new java.awt.Color(43, 145, 191));
        btnSaveHospital.setText("Save Hospital");
        btnSaveHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHospitalphoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHospitalCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHospitalName))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHospitalName)
                            .addComponent(txtHospitalPhone)
                            .addComponent(jComboBoxHospitalCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnSaveHospital))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHospitalName))
                        .addGap(40, 40, 40)
                        .addComponent(lblHospitalphoneNumber))
                    .addComponent(txtHospitalPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHospitalCommunity)
                    .addComponent(jComboBoxHospitalCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnSaveHospital)
                .addContainerGap(297, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveHospitalActionPerformed
        // TODO add your handling code here:
        
        if(jComboBoxHospitalCommunity.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Select Community");
            return;
        }
        Community community = (Community)jComboBoxHospitalCommunity.getSelectedItem();
        Hospital h = sysAdmin.getHospitalDirectory().addHospital();
        String hospitalName = txtHospitalName.getText();
        String phone = txtHospitalPhone.getText();
        String hospitalId = String.valueOf(sysAdmin.getHospitalDirectory().hospitalCount() + Integer.parseInt("100000"));
        
        if(hospitalName.length()==0 || phone.length()==0){
            JOptionPane.showMessageDialog(this, "Emter All Fields");
            return;
        }
        
        h.setHospitalId(hospitalId);
        h.setHospitalName(hospitalName);
        h.setPhoneNumber(phone);
        h.setCommunity(community);
        
        JOptionPane.showMessageDialog(this, "Hospital Info Saved"); 
        
        txtHospitalName.setText("");
        txtHospitalPhone.setText("");
        jComboBoxHospitalCommunity.setSelectedItem(null);
        
    }//GEN-LAST:event_btnSaveHospitalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveHospital;
    private javax.swing.JComboBox<Object> jComboBoxHospitalCommunity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHospitalCommunity;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblHospitalphoneNumber;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtHospitalPhone;
    // End of variables declaration//GEN-END:variables

    private void populateCommunities() {
        
        List<City> cities = sysAdmin.getCities();
        jComboBoxHospitalCommunity.removeAllItems();
        for(City c : cities){
            for(Community community : c.getCommunityList()){
                jComboBoxHospitalCommunity.addItem(community);
            }
        }
    
    }
}
