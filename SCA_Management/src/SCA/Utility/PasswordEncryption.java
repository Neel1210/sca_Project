package SCA.Utility;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Base64;  
public class PasswordEncryption {  
        
    public static String getEncryptedPassword(String password) 
    {    
        Base64.Encoder encoder = Base64.getEncoder();  
 
        return encoder.encodeToString(password.getBytes());  
    }  
    
    public static void main(String[] args) {
        
        Base64.Encoder encoder = Base64.getEncoder();  
        System.out.println(encoder.encodeToString("admin".getBytes()));   
    }
}  

class test{
    public static void main(String[] args) {
        String s  = "Admin";
        System.out.println(PasswordEncryption.getEncryptedPassword(s));
    }
}