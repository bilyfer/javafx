/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bindings;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

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
    TableColumn colNombre;
    
    @FXML
    TableView tableView;
    
    Estudiante estudiante;
    
    ObservableList<Estudiante> data;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {                
        estudiante = new Estudiante();
        
        colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));

        data = FXCollections.observableArrayList();
        tableView.setItems(data);
    }    
    
    public void resultado() {
        Estudiante nuevoEstudiante = new Estudiante();
        nuevoEstudiante.setNombre(txtNombre.getText());
        
        data.add(nuevoEstudiante);
    }
    
}
