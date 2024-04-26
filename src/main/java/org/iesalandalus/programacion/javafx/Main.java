package org.iesalandalus.programacion.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

	@Override
	public void start(Stage escenarioPrincipal) throws IOException {
        VBox raiz = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vistas/HolaMundo.fxml")));
        Scene escena = new Scene(raiz);
		escena.getStylesheets().add(getClass().getResource("/estilos/aplicacion.css").toExternalForm());
		escenarioPrincipal.setTitle("Hola mundo desde JavaFX");
		escenarioPrincipal.getIcons().add(new Image(getClass().getResourceAsStream("/imagenes/iconoSaludar.png")));
		escenarioPrincipal.setScene(escena);
		escenarioPrincipal.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
