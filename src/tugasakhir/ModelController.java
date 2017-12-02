/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mutiara
 */
public class ModelController implements Initializable {

    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    
    //* Data Untuk Syari
    public String jenis;
    public String kode;
    public String nama;
    public String harga;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
       
    }    

    @FXML
    private void syari(ActionEvent event) {
        jenis = "Syar'i";
        kode = "0101";
        nama="Kerudung Syar'i";
        harga="100.000";
        try{
            ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLPasmina.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 556, 492);
            FXMLPasminaController pasmina = new FXMLPasminaController();
            pasmina = fxmlLoader.getController();
            
            pasmina.datapasmina(nama, jenis, kode, harga);
            
            Stage stage = new Stage();
            stage.setScene(scene);
            
            stage.show();
        }catch(Exception e){
            System.out.println(e);
        }
        
      
     }

    @FXML
    private void rawis(ActionEvent event) throws IOException {
        jenis = "Rawis";
        kode = "0102";
        nama="Kerudung Rawis";
        harga="25.000";
    ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLPasmina.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 556, 492);
           
            FXMLPasminaController pasmina = new FXMLPasminaController();
            pasmina = fxmlLoader.getController();
            pasmina.datapasmina(nama, jenis, kode, harga);
            
            Stage stage = new Stage();
            stage.setScene(scene);
            
            stage.show();
        
        
    }

    @FXML
    private void pasmina(ActionEvent event) throws IOException {
        nama="Kerudung Pasmina";
        harga="30.000";
        kode="0103";
        jenis="Pasmina";
                
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLPasmina.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 556, 492);
            Stage stage = new Stage();
            stage.setScene(scene);
           
            stage.show();
         FXMLPasminaController pasmina = new FXMLPasminaController();
            pasmina = fxmlLoader.getController();
            pasmina.datapasmina(nama, jenis, kode, harga);
            
      
    }

    @FXML
    private void paris(ActionEvent event) throws IOException {
         nama="Kerudung Paris";
        harga="15.000";
        kode="0104";
        jenis="Paris";
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLPasmina.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 556, 492);
            Stage stage = new Stage();
            stage.setScene(scene);
            
            stage.show();
            FXMLPasminaController pasmina = new FXMLPasminaController();
            pasmina = fxmlLoader.getController();
            pasmina.datapasmina(nama, jenis, kode, harga);
        
      
    }

    @FXML
    private void satin(ActionEvent event) throws IOException {
         nama="Kerudung Satin";
        harga="20.000";
        kode="0105";
        jenis="Satin";
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLPasmina.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 556, 492);
            Stage stage = new Stage();
            stage.setScene(scene);
           
            stage.show();
        FXMLPasminaController pasmina = new FXMLPasminaController();
            pasmina = fxmlLoader.getController();
            pasmina.datapasmina(nama, jenis, kode, harga);
        
      
    }
    
    
    
}
