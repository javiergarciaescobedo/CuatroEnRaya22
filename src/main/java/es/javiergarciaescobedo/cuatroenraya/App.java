package es.javiergarciaescobedo.cuatroenraya;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        short tamXPantalla = 640;
        short tamYPantalla = 480;
        
        var scene = new Scene(new StackPane(), tamXPantalla, tamYPantalla);
        stage.setScene(scene);
        stage.show();
        
        // Crear objeto de la lógica del juego
        CuatroEnRaya cuatroEnRaya = new CuatroEnRaya((short)20, (short)10);
        
        //cuatroEnRaya.colocarFicha(3, 9, 1);
        //cuatroEnRaya.mostrarTableroConsola();
        
        for(int i=0; i<10; i++) {
            int fila = cuatroEnRaya.buscarFila(3);
            boolean colocado = cuatroEnRaya.colocarFicha(3, fila, 1);
            if(colocado == true) {
                cuatroEnRaya.mostrarTableroConsola();
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("No se ha podido colocar la ficha");
                alert.showAndWait();
            }
        }
        
        
    }

    public static void main(String[] args) {
        launch();
    }

}