package es.javiergarciaescobedo.cuatroenraya;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class PanelMensajes extends StackPane {
    
    static Label labelMensaje = new Label();
    
    public PanelMensajes() {
        this.getChildren().add(labelMensaje);
        this.setMinHeight(100);
        this.setBackground(Background.EMPTY);
    }
    
    public static void mostrarMensaje(String mensaje) {
        labelMensaje.setText(mensaje);
        Timeline timelineMensaje = new Timeline(
            new KeyFrame(Duration.seconds(3), new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent t) {   
                    labelMensaje.setText("");
                }    
            })
        );
        timelineMensaje.setCycleCount(1);
        timelineMensaje.play();
    }
    
    
}
