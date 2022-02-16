package es.javiergarciaescobedo.cuatroenraya;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.shape.Circle;

public class Ficha extends Group {
        
    static final double TAM_FICHA = 40;
    
    public Ficha() {
        Circle circleExterior = new Circle();
        circleExterior.setRadius(TAM_FICHA / 2);
        circleExterior.setFill(Color.RED);
        circleExterior.setCenterX(0);
        circleExterior.setCenterY(0);
        circleExterior.setStroke(Color.DARKGRAY);
        
        Circle circleInterior = new Circle();
        circleInterior.setRadius(TAM_FICHA / 2 - 5);
        LinearGradient g = LinearGradient.valueOf("from 0% 0% to 100% 100%, DarkRed 0%, Red 75% , White 100%");
        circleInterior.setFill(g);
        circleInterior.setCenterX(0);
        circleInterior.setCenterY(0);
        circleInterior.setStroke(Color.LIGHTGRAY);
        
        this.setLayoutX(0);
        this.setLayoutY(0);
        this.getChildren().addAll(circleExterior, circleInterior);
    }
    
}
