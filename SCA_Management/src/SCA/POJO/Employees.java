/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCA.POJO;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author ankitjain
 */
public class Employees {

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }
    private String emp_id;
    private String name;
    private String father_name;
    private int age;
    private String contact;
    private String address;
    private String gender;
    private String mail_id;
    private String bank_name;
    private String account_no;
    private String ifsc_code;
    private String pin_code;
    private String joining_date;
    private String status;
    private String pan_card;
    private int salary;
    private File documents;
    private File photo=null;
    private String dob;

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMail_id() {
        return mail_id;
    }

    public void setMail_id(String mail_id) {
        this.mail_id = mail_id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getIfsc_code() {
        return ifsc_code;
    }

    public void setIfsc_code(String ifsc_code) {
        this.ifsc_code = ifsc_code;
    }

    public String getPin_code() {
        return pin_code;
    }

    public void setPin_code(String pin_code) {
        this.pin_code = pin_code;
    }

    public String getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(String joining_date) {
        this.joining_date = joining_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPan_card() {
        return pan_card;
    }

    public void setPan_card(String pan_card) {
        this.pan_card = pan_card;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public File getDocuments() {
        return documents;
    }

    public void setDocuments(File documents) {
        this.documents = documents;
    }

    @Override
    public String toString() {
        return "Employees{" + "emp_id=" + emp_id + ", name=" + name + ", father_name=" + father_name + ", age=" + age + ", contact=" + contact + ", address=" + address + ", gender=" + gender + ", mail_id=" + mail_id + ", bank_name=" + bank_name + ", account_no=" + account_no + ", ifsc_code=" + ifsc_code + ", pin_code=" + pin_code + ", joining_date=" + joining_date + ", status=" + status + ", pan_card=" + pan_card + ", salary=" + salary + ", documents=" + documents + '}';
    }

    public Employees(String emp_id, String name, String father_name, int age, String contact, String address, String gender, String mail_id, String bank_name, String account_no, String ifsc_code, String pin_code, String joining_date, String status, String pan_card, int salary, File documents) {
        this.emp_id = emp_id;
        this.name = name;
        this.father_name = father_name;
        this.age = age;
        this.contact = contact;
        this.address = address;
        this.gender = gender;
        this.mail_id = mail_id;
        this.bank_name = bank_name;
        this.account_no = account_no;
        this.ifsc_code = ifsc_code;
        this.pin_code = pin_code;
        this.joining_date = joining_date;
        this.status = status;
        this.pan_card = pan_card;
        this.salary = salary;
        this.documents = documents;
    }

  public Employees()
  {
      
  }
    
    
}
