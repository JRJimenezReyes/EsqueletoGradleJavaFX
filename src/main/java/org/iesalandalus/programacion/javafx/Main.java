package org.iesalandalus.programacion.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage escenarioPrincipal) {
		HBox raiz = new HBox();
		raiz.setPadding(new Insets(50, 50, 50, 50));
		raiz.setAlignment(Pos.CENTER);

		Label lbMensaje = new Label();
		lbMensaje.setText("Hola mundo desde JavaFX!!!!");
		lbMensaje.setFont(Font.font("Arial", 40));
		lbMensaje.setMinWidth(150);

		raiz.getChildren().add(lbMensaje);
		Scene escena = new Scene(raiz, 650, 150);
		escenarioPrincipal.setTitle("Hola mundo desde JavaFX");
		escenarioPrincipal.setScene(escena);
		escenarioPrincipal.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
