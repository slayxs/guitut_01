package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.shape.Circle;

public class Controller {

    public Circle kreis;

    public void moving(Event event) {
        double x = kreis.getCenterX();
        double y = kreis.getCenterY();
        kreis.setTranslateX(x+2);
        kreis.setTranslateY(y+2);
    }
}
