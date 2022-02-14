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
        //CuatroEnRaya cuatroEnRaya = new CuatroEnRaya((short)20, (short)10);
        CuatroEnRaya cuatroEnRaya = new CuatroEnRaya();
        
        //cuatroEnRaya.colocarFicha(3, 9, 1);
        //cuatroEnRaya.mostrarTableroConsola();
        
//        for(int i=0; i<10; i++) {
//            int fila = cuatroEnRaya.buscarFila(3);
//            boolean colocado = cuatroEnRaya.colocarFicha(3, fila, 1);
//            if(colocado == true) {
//                cuatroEnRaya.mostrarTableroConsola();
//            } else {
//                Alert alert = new Alert(Alert.AlertType.INFORMATION);
//                alert.setContentText("No se ha podido colocar la ficha");
//                alert.showAndWait();
//            }
//        }

        cuatroEnRaya.colocarFicha(0, 5, 1);
        cuatroEnRaya.colocarFicha(1, 4, 1);
        cuatroEnRaya.colocarFicha(2, 3, 1);
        cuatroEnRaya.colocarFicha(3, 2, 1);
        cuatroEnRaya.colocarFicha(4, 1, 1);
        
        if(cuatroEnRaya.comprobar4EnRayaDiagonal2(4, 1, '1')) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Has hecho 4 en raya");
            alert.showAndWait();
        }
        
        cuatroEnRaya.mostrarTableroConsola();
        
    }

    public static void main(String[] args) {
        launch();
    }

}