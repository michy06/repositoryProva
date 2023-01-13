package it.edu.iisgubbio.Flappybird;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Flappybird extends Application {

	Pane areaDiGioco = new Pane();
	Circle pallina = new Circle(8);
	double pallinaX;
	Rectangle rettangolo = new Rectangle(20,50);
	Rectangle rettangolo1 = new Rectangle(20,50);


	public void start(Stage primaryStage) throws Exception {
		areaDiGioco.setPrefSize(500,150);

		pallina.setFill(Color.RED);
		pallinaX = 20;
		pallina.setTranslateX(pallinaX);
		pallina.setTranslateY(70);
		areaDiGioco.getChildren().add(pallina);

		rettangolo.setX(250);
		rettangolo.setY(0);
		rettangolo.setFill(Color.BLACK);
		areaDiGioco.getChildren().add(rettangolo);
		rettangolo1.setX(250);
		rettangolo1.setY(100);
		rettangolo1.setFill(Color.BLACK);
		areaDiGioco.getChildren().add(rettangolo1);

		Scene scena = new Scene(areaDiGioco);
		Scene scene = new Scene(areaDiGioco);
		scene.setOnKeyPressed(e -> pigia(e));
		primaryStage.setScene(scena);
		primaryStage.setTitle("flappy bird");
		primaryStage.show();

		Timeline timeline = new Timeline(new KeyFrame(
				Duration.millis(20),
				
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
		
		
		
	
	
	      



	public static void main(String[] args) {
		launch(args);
	}
}
