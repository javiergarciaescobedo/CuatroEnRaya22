package es.javiergarciaescobedo.cuatroenraya;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Tablero extends Pane {
    
    public Tablero() {
        this.setBackground(
            new Background(
            new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        this.setMinWidth(Ficha.TAM_FICHA * 7);
        this.setMinHeight(200); 
    }
    
    public void colocarFicha() {
        Ficha ficha = new Ficha();
        this.getChildren().add(ficha);
    }
    
}
