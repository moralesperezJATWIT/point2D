import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyJavaFX3 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

@Override
public void start(Stage
primaryStage) {
	

	final Circle c = new Circle();
	c.setCenterX(100);
	c.setCenterY(100);
	c.setRadius(50);
	c.setStroke(Color.BLUE);
	c.setFill(Color.BLACK);

Pane pane = new Pane();
pane.getChildren().add(c);
	
Scene scene = new Scene(
			pane, 200, 200);
	
	primaryStage.setTitle("Circle!");
		primaryStage.setScene(scene);
		primaryStage.show();
}
}