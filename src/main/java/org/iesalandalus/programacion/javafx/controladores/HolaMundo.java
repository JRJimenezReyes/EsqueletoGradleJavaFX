package org.iesalandalus.programacion.javafx.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HolaMundo extends Controlador{

    @FXML
    private Label lbSaludo;

    @FXML
    void saludar(ActionEvent event) {
        Controlador saludo = Controladores.get("/vistas/Saludo.fxml", "Saludo", getEscenario());
        saludo.addHojaEstilos("/estilos/aplicacion.css");
        saludo.getEscenario().show();
    }

}