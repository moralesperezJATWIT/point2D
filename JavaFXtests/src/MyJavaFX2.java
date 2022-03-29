import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class MyJavaFX2 extends Application {
	public static void main(String[] args) {
		launch(args);
	}




public void start(Stage
primaryStage) {
Scene scene = new Scene(
new Button("Not OK"), 100,
150);
primaryStage.setTitle("Screen 1");
primaryStage.setScene(scene);
primaryStage.show();
Stage stage = new Stage();
stage.setTitle("Screen 2");
stage.setScene(new Scene(new Button("Click Me to Leave"), 400, 450));
stage.show();
}
}