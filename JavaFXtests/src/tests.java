import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class tests {


final private double x;
final private double y;
private double p;
public tests(double x, double y) {
this.x =x;
this.y =y;
}

public tests() {

this(0., 0.);
}


public double getX() {
return x; 
}


public double getY() {
return y; 
}


public String toString() {
return String.format("(%.3f, %.3f)", x, y);
}


public static double distance(tests p1, tests p2) {
final double xDiff = (p1.x - p2.x);
final double yDiff = (p1.y - p2.y);

return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
}


public double distanceTo(tests p) {
return (this.p); 
}


}

