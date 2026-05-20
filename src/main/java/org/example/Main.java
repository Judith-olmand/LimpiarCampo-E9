package org.example;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage){
        Button boton = new Button("Boton");     //BOTÓN
        Label label = new Label("Etiqueta");    //ETIQUETA
        TextField campo = new TextField();         //CAMPO TEXTO

        boton.setOnAction(actionEvent -> {label.setText(campo.getText());
                    campo.clear();});

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(label,boton,campo);

        Scene scene = new Scene(vBox, 300, 200);
        primaryStage.setTitle("Boton, Limpiar campo, Ejercicio 9");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
