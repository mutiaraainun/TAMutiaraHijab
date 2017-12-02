/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mutiara
 */
public class AkhirController implements Initializable {
    
    @FXML
    private Button buttonlogout;
    @FXML
    private JFXTextField datanamapemesan;
    @FXML
    private JFXTextField datatelp;
    @FXML
    private JFXTextField datakode;
    @FXML
    private JFXTextField datanamabarang;
    @FXML
    private JFXTextField datakategori;
    @FXML
    private JFXTextField dataharga;
    @FXML
    private JFXTextField dataalamat;
    @FXML
    private JFXTextField datatgl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logout(ActionEvent event) {
       Stage stage = (Stage) buttonlogout.getScene().getWindow();
        stage.close();
    }

   

    void setText(String Nama, String Telpon, String Alamat,String Tanggal, String Kode, String NamaBarang, String Kategori, String Harga){
        
        
       
     
        datanamapemesan.setText(Nama);
        datatelp.setText(Telpon);
        dataalamat.setText(Alamat);
        datatgl.setText(Tanggal);
        datakode.setText(Kode);
        datanamabarang.setText(NamaBarang);
        datakategori.setText(Kategori);
        dataharga.setText(Harga);
       
}

    void setText(TextField namapemesan, TextField telp, TextField alamat, 
            TextField kode, TextField namabarang, JFXComboBox<String> pilihkategori, TextField harga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
    

