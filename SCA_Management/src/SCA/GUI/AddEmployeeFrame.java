/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCA.GUI;

import SCA.Dao.EmployeesDao;
import SCA.POJO.Employees;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ankitjain
 */
public class AddEmployeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployeeFrame
     */
   private File file1;
   private File file2;
   
    private String gender=null;
    private Date joining_date,dDob;
    private String status=null;
    private int salary;
    private int picUpload=0;
    Employees emp=null;
    
    public AddEmployeeFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setEmpId();
    }

    private void setEmpId() {
        try
        {
            empIdTxt.setText(EmployeesDao.empId());
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
        btnDocument = new javax.swing.JButton();
        txtDocument = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
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
        jLabel16 = new javax.swing.JLabel();
        jrbActive = new javax.swing.JRadioButton();
        jrbNot_Active = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        photoLbl = new javax.swing.JLabel();
        photoBtn = new javax.swing.JButton();
        jDate = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDocument.setText("Documents");
        btnDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentActionPerformed(evt);
            }
        });

        txtDocument.setEditable(false);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnback.setText("Back");

        jPanel1.setMinimumSize(new java.awt.Dimension(940, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Bank Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 165, -1));

        empIdTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        empIdTxt.setText("Id");
        jPanel1.add(empIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 78, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Father's Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 40, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 80, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Contact");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 88, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Account No.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 90, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("IFSC Code");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Bank Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 90, 30));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 290, 30));
        jPanel1.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 290, 30));
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 160, 30));
        jPanel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 290, 30));
        jPanel1.add(txtAddres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 730, 30));
        jPanel1.add(txtBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 286, 30));
        jPanel1.add(txtAccNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 250, 30));
        jPanel1.add(txtIfsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 286, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Pin Code");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 98, 30));
        jPanel1.add(txtPinCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 250, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Pan Number");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, 30));
        jPanel1.add(txtPancard, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 290, 30));
        jPanel1.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 250, 30));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Gender");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 70, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Email Id");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, 30));
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 250, 30));

        buttonGroup1.add(jrbMale);
        jrbMale.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jrbMale.setText("Male");
        jPanel1.add(jrbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        buttonGroup1.add(jrbFemale);
        jrbFemale.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jrbFemale.setText("Female");
        jPanel1.add(jrbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("DOB");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 40, 30));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Status");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 75, 30));

        buttonGroup2.add(jrbActive);
        jrbActive.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jrbActive.setText("Active");
        jPanel1.add(jrbActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, -1, -1));

        buttonGroup2.add(jrbNot_Active);
        jrbNot_Active.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jrbNot_Active.setText("Not-Active");
        jPanel1.add(jrbNot_Active, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Salary");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 107, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 870, 10));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Name");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 78, 30));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Emp Id");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 78, -1));
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 160, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Personal Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 165, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 450, 10));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 30, 130));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 870, 10));

        photoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photoLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(photoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 130, 160));

        photoBtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        photoBtn.setText("Upload Photo");
        photoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(photoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 240, 30));
        jPanel1.add(jDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 286, 30));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Joining Date");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addComponent(btnDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDocument)
                    .addComponent(txtDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(btnback))
                .addGap(24, 24, 24))
        );

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
            emp.setDocuments(file1);
            emp.setPhoto(file2);
            emp.setDob(sdf.format(dDob));
            
            boolean ans = EmployeesDao.addEmplyee(emp);
            if(ans)
            {
                JOptionPane.showMessageDialog(this,"Data Inserted Successfully!!");
                clearAll();
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
            file1 = fileChooser.getSelectedFile();
            //emp.setDocuments(file);
            txtDocument.setText(file1.getPath()); 
        }
    }//GEN-LAST:event_btnDocumentActionPerformed

    private void photoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoBtnActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.setDialogTitle("Browse Files");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int result =chooser.showOpenDialog(null);

        if (result == chooser.APPROVE_OPTION)
        {
            try
            {   
                
                file2=chooser.getSelectedFile();
                Image image = (new ImageIcon(file2.toString())).getImage().getScaledInstance(130,160, 0);
                Icon icon = new javax.swing.ImageIcon(image);
                photoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                photoLbl.setIcon(icon);
                if(emp==null)
                    emp=new Employees();
                emp.setPhoto(file2);
                picUpload=1;
            }
            //catch(FileNotFoundException ex)
            catch(Exception ex)
            {
                System.out.println("File Not FOund Exception\nWhile Upload Image");
            }
        }
        else if (result == chooser.CANCEL_OPTION)
        {
            System.out.println("Cancel was selected");
        }
    }//GEN-LAST:event_photoBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDocument;
    private javax.swing.JButton btnback;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JDateChooser dob;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JRadioButton jrbActive;
    private javax.swing.JRadioButton jrbFemale;
    private javax.swing.JRadioButton jrbMale;
    private javax.swing.JRadioButton jrbNot_Active;
    private javax.swing.JButton photoBtn;
    private javax.swing.JLabel photoLbl;
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
    dob.setCalendar(null);
    jDate.setCalendar(null);
    txtDocument.setText("");
}
    
private boolean validateInputs()
{
    status = getStatus();
    gender = getGender();
    joining_date = jDate.getDate();
    dDob = dob.getDate();
    
    if(picUpload!=1)
    {
        JOptionPane.showMessageDialog(this, "Please Uplaod Photo!!");
        return true;
    }   
    
    if(gender==null || status==null || joining_date==null || dob==null)
    {
        JOptionPane.showMessageDialog(this, "Please select Gener Or Status Or Date Or Dob!!");
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
