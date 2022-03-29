import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class point2D {

	private final double x;
	private final double y;

	public point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double computeDistance(point2D point) {
		return 0.0;
	}

	public static void main(String[] args) {

		if (args.length != 4) {
			System.out.println("Please enter X1, Y1, X2, Y2");
			System.exit(0);;
		}

		double x1 = Double.parseDouble(args[0]);
		double y1 = Double.parseDouble(args[1]);

		point2D point1 = new point2D(x1, y1);

		double x2 = Double.parseDouble(args[2]);
		double y2 = Double.parseDouble(args[3]);

		point2D point2 = new point2D(x2, y2);

		point1.computeDistance(point2);
		point2.computeDistance(point1);
		
		System.out.printf("Point 1: (%.3f, %.3f)%n", point1.getX(), point1.getY());
		System.out.printf("Point 2: (%.3f, %.3f)%n", point2.getX(), point2.getY());
		System.out.printf("The distance betweent the points is: %.3f%n", point1.computeDistance(point2));
    
		// for (String arg:args) {
		// System.out.println(args);

		// Double value = Double.parseDouble(arg);
		// }
	}
}
//source, generate
//pass strings as doubles