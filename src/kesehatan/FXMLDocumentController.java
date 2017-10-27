/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kesehatan;

import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Lely
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private RadioButton tb_laki;
    @FXML
    private RadioButton tb_perempuan;
    @FXML
    private ToggleGroup Pilihan;
    @FXML
    private TextField nama;
    @FXML
    private TextField beratBadan;
    @FXML
    private TextField tinggiBadan;
    @FXML
    private JFXTextField ideal;
    @FXML
    private Button OK;
    @FXML
    private Button Reset;
    @FXML
    private TextArea hasil;
    @FXML
    private TextArea saran;

  /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
    @FXML
    private void Proses(ActionEvent event) {
    int Ideal = 0;
    String Nama = nama.getText();
    int tinggi = Integer.parseInt(tinggiBadan.getText());
     int berat = Integer.parseInt(beratBadan.getText());
     
    if(tb_laki.isSelected())
    {
        Ideal = parseInt(tinggiBadan.getText()) -105;
        ideal.setText(""+Ideal);
        
        if (Ideal == berat){
            hasil.setText("nama:  "+nama.getText()+ "\nTinggi:  "+tinggiBadan.getText()+"\n ideal ");
            saran.setText("pertahankan");
        }
        else if (Ideal > berat)
        {
        hasil.setText("nama:  "+nama.getText()+ " Tinggi:  "+tinggiBadan.getText()+"\n Underweight ");
        saran.setText("Kurangi Makan");
        } 
        else if (Ideal < berat)
        {
        hasil.setText("nama:  "+Nama+ " Tinggi:  "+tinggi+"\n Overweight ");
        saran.setText("Kurangi Makan");
        } 
    }
    
    else 
    {
        
    Ideal = parseInt(tinggiBadan.getText()) -110;
    ideal.setText(""+Ideal);
    
    if (Ideal== berat){
             hasil.setText("nama:  "+nama.getText()+ "\nTinggi:  "+tinggiBadan.getText()+"\nideal ");
            saran.setText("pertahankan");
        }

    else if (Ideal > berat){ 
           hasil.setText("nama:  "+nama.getText()+ "\nTinggi:  "+tinggiBadan.getText()+"Underweight");
           saran.setText ("Sering-sering makan");
     }
    else if (Ideal < berat){
        hasil.setText("nama:  "+nama.getText()+ " \nTinggi:  "+tinggiBadan.getText()+"\nOverweight ");
        saran.setText("Kurangi Makan");
    }
    }
    }
     @FXML
    private void Hapus(ActionEvent event) {
        hasil.setText("");
        nama.setText("");
        beratBadan.setText("");
        tinggiBadan.setText("");
        ideal.setText("");
        saran.setText("");
        tb_laki.setSelected(false);
        tb_perempuan.setSelected(false);
        
    }
}

   
