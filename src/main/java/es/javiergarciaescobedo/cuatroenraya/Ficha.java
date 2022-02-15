package es.javiergarciaescobedo.cuatroenraya;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;

public class Ficha extends Group {
        
    public Ficha() {
        Circle circleExterior = new Circle();
        circleExterior.setRadius(20);
        circleExterior.setFill(Color.RED);
        circleExterior.setCenterX(0);
        circleExterior.setCenterY(0);
        circleExterior.setStroke(Color.DARKGRAY);
        
        Circle circleInterior = new Circle();
        circleInterior.setRadius(15);
        LinearGradient g = LinearGradient.valueOf("from 0% 0% to 100% 100%, DarkRed 0%, Red 75% , White 100%");
        circleInterior.setFill(g);
        circleInterior.setCenterX(0);
        circleInterior.setCenterY(0);
        circleInterior.setStroke(Color.LIGHTGRAY);
        
        this.setLayoutX(100);
        this.setLayoutY(100);
        this.getChildren().addAll(circleExterior, circleInterior);
    }
    
}
