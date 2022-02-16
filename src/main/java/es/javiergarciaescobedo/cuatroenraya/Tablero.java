package es.javiergarciaescobedo.cuatroenraya;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Tablero extends Pane {
    
    Timeline timelineFicha;
    CuatroEnRaya cuatroEnRaya;
    
    public Tablero(CuatroEnRaya cuatroEnRaya) {
        this.cuatroEnRaya = cuatroEnRaya;
        this.setBackground(
            new Background(
            new BackgroundFill(Color.DARKGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        this.setMinWidth(Ficha.TAM_FICHA * cuatroEnRaya.tamXTablero);
        this.setMinHeight(Ficha.TAM_FICHA * (cuatroEnRaya.tamYTablero + 1)); 
        
        this.setOnMouseClicked((event) -> {
            int columna = (int)(event.getX() / Ficha.TAM_FICHA);
            colocarFicha(columna);            
        });
    }
    
    public void colocarFicha(int columna) {
        Ficha ficha = new Ficha();
        ficha.setPosX(columna * Ficha.TAM_FICHA + Ficha.TAM_FICHA / 2);
        ficha.setPosY(Ficha.TAM_FICHA / 2);
        this.getChildren().add(ficha);
        int filaFin = cuatroEnRaya.buscarFila(columna);
        animarCaida(ficha, filaFin);
    }
    
    public void animarCaida(Ficha ficha, int filaFin) {
        timelineFicha = new Timeline(
            new KeyFrame(Duration.seconds(0.017), new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent t) {                    
                    if(ficha.posY < Ficha.TAM_FICHA * filaFin) {
                        ficha.moverY(3);
                    } else {
                        timelineFicha.stop();
                    }
                }        
            })
        );
        timelineFicha.setCycleCount(Timeline.INDEFINITE);
        timelineFicha.play();        
    }    
    
    
}
