/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCA.Dao;

/**
 *
 * @author ankitjain
 */
public class Documents {
    private String pathURL;

    public String getPathURL() {
        return pathURL;
    }

    public void setPathURL(String pathURL) {
        this.pathURL = pathURL;
    }

    public Documents(String pathURL) {
        this.pathURL = pathURL;
    }
    
    public Documents()
    {
        
    }
}
