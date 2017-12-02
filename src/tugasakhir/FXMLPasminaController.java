/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Mutiara
 */
public class FXMLPasminaController implements Initializable {
   
    
    private Label label;
    @FXML
    private TextField namapemesan;
    @FXML
    private TextField telp;
    @FXML
    private TextField alamat;
    @FXML
    private TextField kode;
    @FXML
    private TextField namabarang;
    @FXML
    private TextField harga;
    @FXML
    private Button JFXcombokeluar;
    @FXML
    private Button JFXcombosimpan;
    @FXML
    private Button JFXcombobersih;
    @FXML
    private JFXComboBox<String> pilihkategori;
    ObservableList<String> list = FXCollections.observableArrayList("Syar'i","Rawis","Paris","Pasmina","Satin");
    
    
    String Nama,Telpon,Alamat,Tanggal,Kode,NamaBarang,Kategori,Harga;
    @FXML
    private DatePicker tgl;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       
        pilihkategori.setItems(list);
    }  
    public void datapasmina(String namaa, String jeniss, String kodee, String hargaa){
         pilihkategori.setValue(jeniss);
         namabarang.setText(namaa);
         kode.setText(kodee);
         harga.setText(hargaa);
    }
    
     
    void proses(){
          if(namapemesan.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap inputkan nama Anda");
        }else if (telp.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap isikan nomor hp Anda");
        }else if(alamat.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap inputkan alamat Anda");
        }else if(kode.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap inputkan kode Hijab");
        }else if(namabarang.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap inputkan nama Hijab");
        }else if(pilihkategori.getValue().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap pilih model Hijab");
        }else if(harga.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap inputkan nama Hijab");
        }else if(tgl.getValue().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap pilih model Hijab");}
        else{
         Nama = namapemesan.getText();
         Telpon = telp.getText();
         Alamat = alamat.getText();
         Tanggal = tgl.getValue().toString();
         Kode = kode.getText();
         NamaBarang = namabarang.getText();
         Kategori = pilihkategori.getValue().toString();
         Harga = harga.getText();
        
        }
         
    }

    @FXML
    private void keluar(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 550, 480);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Sukses Pemesanan");
            stage.show();}

        
    @FXML
    private void simpan(ActionEvent event) throws IOException{
        
     proses();//akan memanggil menjalankan method Kirim
        try {
            ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Akhir.fxml"));
            
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Form Hasil");
            stage.show();
            
            AkhirController Data = new AkhirController();
            Data = fxmlLoader.getController();
            
            Data.setText(Nama, Telpon, Alamat,Tanggal, Kode, NamaBarang, Kategori,Harga);
            
        } catch (IOException e) {
            System.out.println("Batal membuat window baru" + e);
        }
        
    }
       
            
             
           
    

    @FXML
    private void bersih(ActionEvent event) {
        namapemesan.setText("");
        telp.setText("");
        alamat.setText("");
        kode.setText("");
        namabarang.setText("");
        pilihkategori.setValue("");
        harga.setText("");
      
        
    }

    @FXML
    private void kategori(ActionEvent event) {
    }
    
}
