/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import UsersFile.Users;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import query.DataQuery;

/**
 *
 * @author falbellaihi
 */
@ManagedBean
@SessionScoped
public class Controller {

    private String username; 
    private String password;
    private String type;
    private DataQuery q = new DataQuery(); 
    /**
     * Creates a new instance of Controller
     */
    public Controller() {
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DataQuery getQ() {
        return q;
    }

    public void setQ(DataQuery q) {
        this.q = q;
    }
    
    
    
    public String loginA(){
        System.out.println("\n\n\n test test "+username + " -- "+ password);
        Users user = q.login(username, password,0);
        if(user == null){
            return null;
        }
        else{
            System.out.println("\n\n\n test test ");
         return "AdminControlPanel.xhtml";   
        
        }
    }
    public String loginS(){
        System.out.println("\n\n\n test test "+username + " -- "+ password);
        Users user = q.login(username, password,1);
        if(user == null){
            return null;
        }
        else{
            System.out.println("\n\n\n test test ");
         return "StudentControlPanel.xhtml";   
        
        }
    }
    public String loginD(){
        System.out.println("\n\n\n test test "+username + " -- "+ password);
        Users user = q.login(username, password,2);
        if(user == null){
            return null;
        }
        else{
            System.out.println("\n\n\n test test ");
         return "AdminControlPanel.xhtml";   
        
        }
    }
}