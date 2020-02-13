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
import javafx.scene.control.ComboBox;
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
    
    @FXML
    ComboBox cmbCarrera;
    
    Estudiante estudiante;
    
    ObservableList<Estudiante> dataEstudiante;
    ObservableList<Carrera> dataCarrera;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {                
        estudiante = new Estudiante();
        cargarCategorias();
        
        cmbCarrera.valueProperty().bindBidirectional(estudiante.carreraProperty());
        
        colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));

        dataEstudiante = FXCollections.observableArrayList();
        tableView.setItems(dataEstudiante);
    }    
    
    public void resultado() {
        Estudiante nuevoEstudiante = new Estudiante();
        nuevoEstudiante.setNombre(txtNombre.getText());
        
        dataEstudiante.add(nuevoEstudiante);
    }

    private void cargarCategorias() {
        dataCarrera = FXCollections.observableArrayList();
        
        Carrera carrera1 = new Carrera("IS", "Ingenieria en Sistemas");
        Carrera carrera2 = new Carrera("IA", "Informatica Administrativa");
        Carrera carrera3 = new Carrera("D", "Derecho");
        
        dataCarrera.add(carrera1);
        dataCarrera.add(carrera2);
        dataCarrera.add(carrera3);
        
        cmbCarrera.setItems(dataCarrera);
        
    }
    
}
