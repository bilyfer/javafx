/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bindings;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author billy
 */
public class FormBindingController implements Initializable {

    @FXML
    Label lblNombre;
    
    @FXML
    TextField txtNombre;

    @FXML
    TextField txtNombre1;

    @FXML
    TextField txtNombre2;
    
    Estudiante estudiante;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {                
        estudiante = new Estudiante();
        
        txtNombre.textProperty().bindBidirectional(estudiante.nombreProperty());
        txtNombre2.textProperty().bindBidirectional(estudiante.nombreProperty());
        txtNombre1.textProperty().bindBidirectional(estudiante.nombreProperty());
        
        lblNombre.textProperty().bindBidirectional(estudiante.nombreProperty());
        
    }    
    
    public void resultado() {
        System.out.println(estudiante.getNombre());
    }
    
}
