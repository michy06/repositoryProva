package it.edu.iisgubbio.Vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Vettori extends Application  {
	TextField tNumero = new TextField(); 
	TextField tTempo = new TextField();
	TextField tCoach = new TextField();
	TextField tRisultati = new TextField();

	int tempi[] = new int[10];
	int numTempi;
	int pos;

	public void start(Stage primaryStage) {


		GridPane griglia = new GridPane();

		griglia.add(tNumero,0 ,0);
		griglia.add(tTempo, 0, 1);

		griglia.add(tCoach,0,2);
		griglia.add(tRisultati,0,3);

		tNumero.setOnAction(e-> alloca ());
		tCoach.setOnAction(e-> contaPessimi ());
		tTempo.setOnAction(e-> inserisciTempo ());

		Scene scena = new Scene(griglia);

		primaryStage.setTitle("Vettori");
		primaryStage.setScene(scena);
		primaryStage.show();

	}
	public void alloca() {
		numTempi = Integer.parseInt(tNumero.getText());
		tempi = new int[numTempi];
		pos = 0;
	}

	public void inserisciTempo() {
		if(pos < tempi.length) {
			tempi[pos++]=Integer.parseInt(tTempo.getText());
			tTempo.setText("");
		}
	}

	public void contaPessimi() {
		int indice, contatore;
		int coach = Integer.parseInt(tCoach.getText());
		for(contatore = indice = 0; indice < tempi.length; indice++) {
			if(tempi[indice] > coach) {
				contatore++;
			}
		}
		tRisultati.setText("" + contatore);
	}
	public static void main(String[] args) {
		launch(args);
	}
}


