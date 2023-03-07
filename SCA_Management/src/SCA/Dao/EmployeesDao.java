/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCA.Dao;

import SCA.DbUtil.DBConnection;
import SCA.POJO.Employees;
import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.text.Document;

/**
 *
 * @author Neel_Esh
 */
public class EmployeesDao {
    
    public static String empId() throws SQLException
    {
        int count;
        Statement st=DBConnection.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select count(*) from employees");
        if(rs.next())
        {
            System.out.println("total rows"+rs.getInt(1));
            
            return "Emp-"+(101+rs.getInt(1));
        }
        return "Emp-101";
    }
    
    public static boolean addEmplyee(Employees emp) throws SQLException, ParseException, FileNotFoundException
    {
        Connection conn = DBConnection.getConnection();
        String qry = "insert into employees values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement ps=conn.prepareStatement(qry);
        
        ps.setString(1,emp.getEmp_id());
        ps.setString(2,emp.getName());
        ps.setString(3,emp.getFather_name());
        ps.setString(4,emp.getContact());
        ps.setInt(5,emp.getAge());
        ps.setString(6,emp.getAddress());
        ps.setString(7,emp.getGender());
        ps.setString(8,emp.getMail_id());
        ps.setString(9,emp.getBank_name());
        ps.setString(10,emp.getAccount_no());
        ps.setString(11,emp.getIfsc_code());
        ps.setString(12,emp.getPin_code());
        //-->
        String genDate = emp.getJoining_date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date gen = sdf.parse(genDate);
        java.sql.Date genD = new java.sql.Date(gen.getTime());
        ps.setDate(13, genD);
  
        
        ps.setString(14,emp.getStatus());
        ps.setString(15,emp.getPan_card());
        ps.setInt(16,emp.getSalary());
        //-->
        
        File f=emp.getDocuments();
        FileInputStream fin = new FileInputStream(emp.getDocuments().getPath());
        ps.setBlob(17, fin, (int)f.length());
        
       
        return 1==ps.executeUpdate(); 
    }
    
   public static ArrayList<Employees> getDetails() throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select * from employees where status='Actice'");
        ResultSet rs = ps.executeQuery();
        ArrayList<Employees> empList = new ArrayList<>();
        while(rs.next())
        {
            Employees emp = new Employees();
            emp.setEmp_id(rs.getString(1));
            emp.setName(rs.getString(2));
            emp.setFather_name(rs.getString(3));
            emp.setContact(rs.getString(4));
            emp.setAge(rs.getInt(5));
            emp.setGender(rs.getString(7));
            emp.setMail_id(rs.getString(8));
            emp.setStatus(rs.getString(14));
            emp.setSalary(rs.getInt(16));
            empList.add(emp);
        }
        return empList;
    }
   
   public static ArrayList<Employees> getEmpDetailById(String empId) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select * from employees where emp_id=?");
        ps.setString(1, empId);
        ResultSet rs = ps.executeQuery();
        ArrayList<Employees> empList = new ArrayList<>();
        while(rs.next())
        {
            Employees emp = new Employees();
            emp.setEmp_id(rs.getString(1));
            emp.setName(rs.getString(2));
            emp.setFather_name(rs.getString(3));
            emp.setContact(rs.getString(4));
            emp.setAge(rs.getInt(5));
            emp.setGender(rs.getString(7));
            emp.setMail_id(rs.getString(8));
            emp.setStatus(rs.getString(14));
            emp.setSalary(rs.getInt(16));
            empList.add(emp);
        }
        return empList;
    }
}
