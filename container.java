package com.Houssem_DEGHA.App_jad;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class container {

	Pane p ;
	Pane book ;
	Button Price;
	 GridPane gridPane ;
	
	
	public container(){
		
	p = new Pane();

	 
	  gridPane = new GridPane();
     gridPane.setPadding(new Insets(0,0,0,0));
     gridPane.setHgap(5);
     gridPane.setVgap(5);
     gridPane.setStyle("-fx-border-color: RED;");
     gridPane.setLayoutX(84);
     gridPane.setLayoutY(15);
     gridPane.setPrefSize(204, 114);
	
     
 
     
   //  gridPane.add(new Agent().p, 0, 0);
     
	//------------------------------------------
	      p.setPrefSize(250, 250);
	      File f1 = new File("c.png");
	        Image i1 = new Image(f1.toURI().toString());
		   final ImageView selectedImage1 = new ImageView();   
	        selectedImage1.setImage(i1);
	        selectedImage1.setFitHeight(180);
	        selectedImage1.setFitWidth(300);
	        selectedImage1.setId("selectedImage");
	        
	        File f2 = new File("fx.jpg");
	        Image i2 = new Image(f2.toURI().toString());
		   final ImageView selectedImage2 = new ImageView();   
	        selectedImage2.setImage(i2);
	        selectedImage2.setFitHeight(50);
	        selectedImage2.setFitWidth(50);
	        book = new Pane();
	        Price = new Button("1000 $");
	       
	     
	       // Price.setStyle("-fx-background-color: #EEEEFF;");
	        VBox v = new VBox();
	        v.setSpacing(3);
	        v.getChildren().addAll(selectedImage2,Price);
	         book.getChildren().add(v);
	         book.setLayoutX(10);
	         book.setLayoutY(70);
	         
	        p.getChildren().add(selectedImage1);
	        p.getChildren().add(gridPane);
	        p.getChildren().add(book);
	        
	        
	        
	     
	      
	   
	      
	}
	
	
}
