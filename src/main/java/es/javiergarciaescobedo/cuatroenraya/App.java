package es.javiergarciaescobedo.cuatroenraya;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        short tamXPantalla = 640;
        short tamYPantalla = 480;
        
        Pane paneRoot = new Pane();
        var scene = new Scene(paneRoot, tamXPantalla, tamYPantalla);
        stage.setScene(scene);
        stage.show();
        
        for(int i=0; i<100; i++) {
            Ficha ficha = new Ficha();
            paneRoot.getChildren().add(ficha);   
        }

        
        // Crear objeto de la lógica del juego
        //CuatroEnRaya cuatroEnRaya = new CuatroEnRaya((short)20, (short)10);
        CuatroEnRaya cuatroEnRaya = new CuatroEnRaya();
               
        Random random = new Random();
        for(int i=0; i<20; i++) {
            int col = random.nextInt(7);
            if(cuatroEnRaya.colocarFicha(col)) {
                cuatroEnRaya.cambiarTurnoJugador();
            }
        }
                
        cuatroEnRaya.mostrarTableroConsola();
        
    }

    public static void main(String[] args) {
        launch();
    }

}