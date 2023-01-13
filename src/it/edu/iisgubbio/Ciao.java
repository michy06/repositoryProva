package it.edu.iisgubbio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class Ciao extends Application {


  Button pSaluto = new Button(); 
  Button pLuto = new Button();
  Button p3i = new Button(); 
  Button pInfo = new Button();
  Label l3i4 =new Label ("3i4");
  Label lCiao =new Label ("ciao");
  
  
  public void start(Stage finestra) {
 

 
    pSaluto.setText("saluto");
    pLuto.setText("pluto");
    p3i.setText("3i");
    pInfo.setText("info");
    
    pSaluto.setOnAction(e -> esegui());
    pLuto.setOnAction(e -> esegui());
    p3i.setOnAction(e -> esegui());
    pInfo.setOnAction(e -> esegui());
   
    GridPane principale = new GridPane();
    
    
    
    principale.add(pSaluto,0,0);
    principale.add(pLuto,1,1);
    principale.add(p3i,2,0);
    principale.add(pInfo,2,1);
    

    principale.add(l3i4,1,0);
    principale.add(lCiao,0,1);
    
    Scene scena = new Scene(principale, 300, 250);

    finestra.setTitle("Hello World!");
    finestra.setScene(scena);
    finestra.show();
  }

  private void esegui(){
 

  
  }

  public static void main(String[] args) {
    launch(args);
  }
}

