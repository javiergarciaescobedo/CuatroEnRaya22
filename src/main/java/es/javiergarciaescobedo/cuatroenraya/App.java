package es.javiergarciaescobedo.cuatroenraya;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 * JavaFX App
 */
public class App extends Application {

    BorderPane paneRoot;

    @Override
    public void start(Stage stage) {
        
        short tamXPantalla = 640;
        short tamYPantalla = 480;
        
        paneRoot = new BorderPane();
        var scene = new Scene(paneRoot, tamXPantalla, tamYPantalla);
        stage.setScene(scene);
        stage.show();
                
        CuatroEnRaya cuatroEnRaya = new CuatroEnRaya();

        Tablero tablero = new Tablero(cuatroEnRaya);
        paneRoot.setCenter(tablero);    
        
        paneRoot.setBottom(new PanelMensajes());
    }

    public static void main(String[] args) {
        launch();
    }

}