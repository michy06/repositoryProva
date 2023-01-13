package it.edu.iisgubbio.giochi.Pallina;

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

public class Pallinacherimbalsa extends Application {


	double LARGHEZZA = 550;
	double ALTEZZA = 250;
	double RAGGIO = 10;
	Rectangle rettangolo = new Rectangle(10,100);
	Rectangle rettangolo1 = new Rectangle(10,100);
	Circle cerchio = new Circle(RAGGIO);
	boolean avantiX=true;
	boolean avantiY=true;

	public void start(Stage finestra) {

		Pane areaDiGioco = new Pane();
		areaDiGioco.setPrefSize(LARGHEZZA, ALTEZZA);

		Timeline timeline = new Timeline(new KeyFrame(
				Duration.seconds(0.002), 
				n -> aggiornaTimer()));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();


		cerchio.setCenterX(50);
		cerchio.setCenterY(50);
		cerchio.setFill(Color.BLUE);
		areaDiGioco.getChildren().add(cerchio);
		rettangolo.setX(0);
		rettangolo.setY(0);
		rettangolo.setFill(Color.PURPLE);
		areaDiGioco.getChildren().add(rettangolo);
		rettangolo1.setX(540);
		rettangolo1.setY(0);
		rettangolo1.setFill(Color.PURPLE);
		areaDiGioco.getChildren().add(rettangolo1);

		Scene scene = new Scene(areaDiGioco);
		scene.setOnKeyPressed(e -> pigia(e));
		finestra.setTitle("Pallina che rimbalsa");
		finestra.setScene(scene);
		finestra.show();
	}

	private void pigia(KeyEvent e) {
		if (e.getText().equals("a")) {

			rettangolo.setY(rettangolo.getY()-25);
		}
		if (e.getText().equals("z")) {

			rettangolo.setY(rettangolo.getY()+25);
		}

		if (e.getText().equals("p")) {

			rettangolo1.setY(rettangolo1.getY()-25);
		}
		if (e.getText().equals("l")) {

			rettangolo1.setY(rettangolo1.getY()+25);
		}
	}

	private void aggiornaTimer() {

		double x = cerchio.getCenterX();
		double y = cerchio.getCenterY();

		if( avantiX ){
			x=x+0.5;
		}else{
			x=x-0.5;
		}

		if(avantiY){
			y=y+0.5;
		}else{
			y=y-0.5;
		}

		if(x>=LARGHEZZA+RAGGIO){
			avantiX=false;
		}

		if(y>=ALTEZZA-RAGGIO){
			avantiY=false;
		}

		if(x<=RAGGIO) {
			avantiX=true;
		}

		if(y<=RAGGIO) {
			avantiY=true;
		}

		cerchio.setCenterX(x);
		cerchio.setCenterY(y);

		Bounds b1 = cerchio.getBoundsInParent();
		Bounds b2 = rettangolo.getBoundsInParent();
		Bounds b3 = rettangolo1.getBoundsInParent();
		if(b1.intersects(b2)) {
			avantiX=!avantiX;
			avantiY=!avantiY;



		}
		if(b1.intersects(b3)) {
			avantiX=!avantiX;
			avantiY=!avantiY;



		}
		
		

	}
	public static void main(String[] args) {
		launch(args);
	}
}