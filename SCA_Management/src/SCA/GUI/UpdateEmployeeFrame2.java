/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCA.GUI;

import SCA.Dao.EmployeesDao;
import SCA.POJO.Employees;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ankitjain
 */
public class UpdateEmployeeFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployeeFrame
     */
   private File file;
   
   private int uplaodFlag=0;
    private String gender=null;
    private Date joining_date;
    private String status=null;
    private int salary;
    
    public UpdateEmployeeFrame2() throws ParseException {
        initComponents();
        setLocationRelativeTo(null);
        setEmpDetails("Emp-101");
    }
    
    public UpdateEmployeeFrame2(String empId) throws ParseException {
        initComponents();
        setLocationRelativeTo(null);
        setEmpDetails(empId);
        btnDocument.setEnabled(false);
    }

    private void setEmpDetails(String empId) throws ParseException {
        try
        {
            Employees emp=EmployeesDao.getEmpDetailById(empId);
            if(emp==null)
            {
                JOptionPane.showMessageDialog(null,"Error While retriving Emp Id","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            empIdTxt.setText(emp.getEmp_id());
            txtName.setText(emp.getName());
            txtFname.setText(emp.getFather_name());
            txtAge.setText(String.valueOf(emp.getAge()));
            txtContact.setText(emp.getContact());
            txtAddres.setText(emp.getAddress());
            if(emp.getGender().equals("Male"))
            {
                ButtonModel model = jrbMale.getModel();
                 buttonGroup1.setSelected(model, true);
            }
             else
            {  ButtonModel model1 = jrbFemale.getModel();
            buttonGroup1.setSelected(model1, true);
                
            }
              
         
           txtMail.setText(emp.getMail_id());
           txtBank.setText(emp.getBank_name());
           txtAccNo.setText(emp.getAccount_no());
           txtIfsc.setText(emp.getIfsc_code());
           txtPinCode.setText(emp.getPin_code());
           SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
           jDate.setDate(sdf.parse(emp.getJoining_date()));
           if(emp.getStatus().equals("Active"))
           {
               ButtonModel model = jrbActive.getModel();
               buttonGroup2.setSelected(model, true);
           }
           else
           {
               ButtonModel model1 = jrbNot_Active.getModel();
               buttonGroup2.setSelected(model1, true);
           }
           txtPancard.setText(emp.getPan_card());
           txtSalary.setText(String.valueOf(emp.getSalary()));
                
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error While retriving Emp Id","Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        empIdTxt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtAddres = new javax.swing.JTextField();
        txtBank = new javax.swing.JTextField();
        txtAccNo = new javax.swing.JTextField();
        txtIfsc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPinCode = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPancard = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jrbMale = new javax.swing.JRadioButton();
        jrbFemale = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jrbActive = new javax.swing.JRadioButton();
        jrbNot_Active = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnDocument = new javax.swing.JButton();
        txtDocument = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        sep = new javax.swing.JSeparator();
        uplaodDoc = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(940, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("UPDATE EMPLOYEE'S");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 165, -1));

        empIdTxt.setText("Id");
        jPanel1.add(empIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 78, -1));

        jLabel3.setText("Father's Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        jLabel4.setText("Age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 53, -1));

        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel6.setText("Contact");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 88, -1));

        jLabel7.setText("Account No.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 90, -1));

        jLabel8.setText("IFSC Code");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel9.setText("Bank Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 290, -1));
        jPanel1.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 250, -1));
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 290, -1));
        jPanel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 250, -1));
        jPanel1.add(txtAddres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 730, -1));
        jPanel1.add(txtBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 286, -1));
        jPanel1.add(txtAccNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 234, -1));
        jPanel1.add(txtIfsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 286, -1));

        jLabel10.setText("Pin Code");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 98, -1));
        jPanel1.add(txtPinCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 232, -1));

        jLabel11.setText("PanCard Number");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));
        jPanel1.add(txtPancard, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 290, -1));
        jPanel1.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, 231, -1));

        jLabel13.setText("Gender");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel14.setText("Email Id");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 230, -1));

        buttonGroup1.add(jrbMale);
        jrbMale.setText("Male");
        jPanel1.add(jrbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        buttonGroup1.add(jrbFemale);
        jrbFemale.setText("Female");
        jPanel1.add(jrbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        jLabel15.setText("Date of Joining");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));
        jPanel1.add(jDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 286, 27));

        jLabel16.setText("Status");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 75, -1));

        buttonGroup2.add(jrbActive);
        jrbActive.setText("Active");
        jPanel1.add(jrbActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, -1, -1));

        buttonGroup2.add(jrbNot_Active);
        jrbNot_Active.setText("Not-Active");
        jPanel1.add(jrbNot_Active, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, -1, -1));

        jLabel17.setText("Salary");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 107, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 840, -1));

        jLabel18.setText("Name");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 78, -1));

        jLabel19.setText("Emp Id");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 78, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 570));

        btnDocument.setText("Documents");
        btnDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentActionPerformed(evt);
            }
        });
        getContentPane().add(btnDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 603, 188, -1));

        txtDocument.setEditable(false);
        getContentPane().add(txtDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 603, 422, 25));

        btnAdd.setText("Update");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 603, 94, -1));

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 603, 89, -1));
        getContentPane().add(sep, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 870, 20));

        uplaodDoc.setText("Want to uplaod Document");
        uplaodDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uplaodDocActionPerformed(evt);
            }
        });
        getContentPane().add(uplaodDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        boolean isValidate = validateInputs();
        if(isValidate)
        {
            JOptionPane.showMessageDialog(this,"Please input all the fields");
            return;
        }
        
        try {
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Employees emp = new Employees();
            emp.setEmp_id(empIdTxt.getText().trim());
            emp.setName(txtName.getText().trim());
            emp.setFather_name(txtFname.getText().trim());
            emp.setAge(Integer.parseInt(txtAge.getText().trim()));
            emp.setContact(txtContact.getText().trim());
            emp.setAddress(txtAddres.getText().trim());
            emp.setGender(gender);
            emp.setMail_id(txtMail.getText().trim());
            emp.setBank_name(txtBank.getText().trim());
            emp.setAccount_no(txtAccNo.getText().trim());
            emp.setIfsc_code(txtIfsc.getText().trim());
            emp.setPin_code(txtPinCode.getText().trim());
            emp.setJoining_date(sdf.format(joining_date));
            emp.setStatus(status);
            emp.setPan_card(txtPancard.getText().trim());
            emp.setSalary(salary);
            emp.setDocuments(file);
            boolean ans;
            if(uplaodDoc.isSelected())
            {
                ans = EmployeesDao.updateEmployeeAll(emp);
            }
            else
            {
                ans = EmployeesDao.updateEmployee(emp);
            }
            if(ans)
            {
                JOptionPane.showMessageDialog(this,"Data Updated Successfully!!");
                new UpdateEmployee1().setVisible(true);
                this.dispose();
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(this, "DB Error!!");
            e.printStackTrace();
        } 
        catch (ParseException ex) 
        {
            JOptionPane.showMessageDialog(this, "Error while selecting date!!");
            ex.printStackTrace();
        }
        catch (FileNotFoundException ex) 
        {
            JOptionPane.showMessageDialog(this, "Error while uploading file!!");
            ex.printStackTrace();
       }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Your File");
        int result = fileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            file = fileChooser.getSelectedFile();
            //emp.setDocuments(file);
            txtDocument.setText(file.getPath()); 
        }
    }//GEN-LAST:event_btnDocumentActionPerformed

    private void uplaodDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uplaodDocActionPerformed
        // TODO add your handling code here:
        if(uplaodDoc.isSelected())
        {
            uplaodFlag=1;
            btnDocument.setEnabled(true);
        }  
        else
        {
            uplaodFlag=0;
            txtDocument.setText("");
            btnDocument.setEnabled(false);
        }
    }//GEN-LAST:event_uplaodDocActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        new UpdateEmployee1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UpdateEmployeeFrame2().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(UpdateEmployeeFrame2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDocument;
    private javax.swing.JButton btnback;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel empIdTxt;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton jrbActive;
    private javax.swing.JRadioButton jrbFemale;
    private javax.swing.JRadioButton jrbMale;
    private javax.swing.JRadioButton jrbNot_Active;
    private javax.swing.JSeparator sep;
    private javax.swing.JTextField txtAccNo;
    private javax.swing.JTextField txtAddres;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBank;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDocument;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtIfsc;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPancard;
    private javax.swing.JTextField txtPinCode;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JCheckBox uplaodDoc;
    // End of variables declaration//GEN-END:variables

private void clearAll()
{
    txtName.setText("");
    txtFname.setText("");
    txtAge.setText("");
    txtContact.setText("");
    txtAddres.setText("");
    txtMail.setText("");
    txtBank.setText("");
    txtAccNo.setText("");
    txtIfsc.setText("");
    txtPinCode.setText("");
    
    txtPancard.setText("");
    txtSalary.setText("");
    buttonGroup1.clearSelection();
    buttonGroup2.clearSelection();
    jDate.cleanup();
}
    
private boolean validateInputs()
{
    status = getStatus();
    gender = getGender();
    joining_date = jDate.getDate();
    if(gender==null || status==null || joining_date==null)
    {
        JOptionPane.showMessageDialog(this, "Please select Gener Or Status Or Date!!");
        return true;
    }     
    
    if(uplaodDoc.isSelected() && txtDocument.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(this, "Please select Documents Also!!");
        return true;
    }
        
    if(txtName.getText().isEmpty()||txtFname.getText().isEmpty()||txtAge.getText().isEmpty()
            ||txtContact.getText().isEmpty()||txtAddres.getText().isEmpty()||txtMail.getText().isEmpty()
            ||txtBank.getText().isEmpty()||txtAccNo.getText().isEmpty()||txtIfsc.getText().isEmpty()
            ||txtPinCode.getText().isEmpty()||joining_date==null||txtPancard.getText().isEmpty()
            ||txtSalary.getText().isEmpty())
        return true;
    salary = Integer.parseInt(txtSalary.getText().trim());
    return false; 
}


private String getGender()
{
    if(jrbMale.isSelected())
        return jrbMale.getText();
    else if(jrbFemale.isSelected())
        return jrbFemale.getText();
    else 
        return null;
}

private String getStatus()
{
    if(jrbActive.isSelected())
        return jrbActive.getText();
    else if(jrbNot_Active.isSelected())
        return jrbNot_Active.getText();
    else
        return null;
}

}
