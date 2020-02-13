/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bindings;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author billy
 */
public class Estudiante {
    private final SimpleStringProperty nombre;
    private final SimpleObjectProperty carrera;

    public Estudiante() {
        nombre = new SimpleStringProperty();
        carrera = new SimpleObjectProperty();
    }

    public String getNombre() {
        return nombre.get();
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }
    
    public SimpleStringProperty nombreProperty() {
        return nombre;
    }

    public Carrera getCarrera() {
        return (Carrera) carrera.get();
    }

    public void setCarrera(Carrera carrera) {
        this.carrera.set(carrera);
    }
    
    public SimpleObjectProperty carreraProperty(){
        return carrera;
    }
}
