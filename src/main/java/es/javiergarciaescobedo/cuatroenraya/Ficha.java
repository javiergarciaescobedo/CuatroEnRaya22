package es.javiergarciaescobedo.cuatroenraya;

import java.util.Random;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ficha extends Circle {
        
    public Ficha() {
        this.setRadius(20);
        Random random = new Random();        
        this.setFill(Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        this.setCenterX(random.nextInt(640));
        this.setCenterY(random.nextInt(480));
    }
    
}
