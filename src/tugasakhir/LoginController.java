/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mutiara
 */
public class LoginController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Button buttonlogin;
    private Component rootPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void login(ActionEvent event) throws IOException, SQLException {
        Connection connection;
        PreparedStatement ps;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_akun?zeroDateTimeBehavior=convertToNull", "root","");
            ps = connection.prepareStatement("SELECT * FROM `tb_akun` WHERE username=? AND password =?");
            ps.setString(1,username.getText());
            ps.setString(2,password.getText());
            ResultSet result = ps.executeQuery();
            if(result.next()){
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Benar!");
          
        
        
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Model.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 619, 602);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("FXMLDocument");
            stage.show();
       } else{
              javax.swing.JOptionPane.showMessageDialog(rootPane, "Salah!");  
              password.setText("");
              username.requestFocus();
            }
    } catch(java.sql.SQLException ex){
         javax.swing.JOptionPane.showMessageDialog(rootPane, "Gagal!"); 
    }
}
}
    

