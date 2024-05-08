package org.iesalandalus.programacion.javafx.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.iesalandalus.programacion.javafx.utilidades.Controlador;
import org.iesalandalus.programacion.javafx.utilidades.Controladores;

public class HolaMundo extends Controlador {

    @FXML
    void saludar() {
        Controlador saludo = Controladores.get("/vistas/Saludo.fxml", "Saludo", getEscenario());
        saludo.addHojaEstilos("/estilos/aplicacion.css");
        saludo.getEscenario().show();
    }

}