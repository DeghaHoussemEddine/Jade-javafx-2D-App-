package com.Houssem_DEGHA.App_jad;
	
import com.Houssem_DEGHA.Agent_project.Contauner;
import com.Houssem_DEGHA.Agent_project.MainContauner;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;



public class Main extends Application {
public int i = 0;

public Agentp ag=	new Agentp();

TextArea ta ;
container main =new container();

container container1 = new container();
container container2 = new container();
container container3 = new container();

Agentp Agent1 = new Agentp();
Agentp Agent2 = new Agentp();
Agentp Agent3 = new Agentp();

Line line1 = new Line();
Line line4 = new Line();
	Line line2 = new Line();
	Line line3 = new Line();


MainContauner mc;


	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Pane pp = new Pane();
	
			VBox v= new VBox();
			v.setSpacing(50);
			v.setLayoutX(10);
			v.setLayoutY(10);
			v.setPrefSize(400, 620);
			v.getChildren().add(container1.p);
			v.getChildren().add(container2.p);
			v.getChildren().add(container3.p);
			
			container1.gridPane.add(Agent1.p,0,0);
			container2.gridPane.add(Agent2.p,0,0);
			container3.gridPane.add(Agent3.p,0,0);
			container1.p.setVisible(false);
			container2.p.setVisible(false);
			container3.p.setVisible(false);
			
			container3.Price.setText("80");
			container1.Price.setText("180");
			container2.Price.setText("130");
		
			main.p.setLayoutX(895);
			main.p.setLayoutY(230);
		    
		    
		    line1.setStartX(300.0f);
		    line1.setStartY(350.0f);
		    line1.setEndX(900.0f);		
		    line1.setEndY(350.0f);
		    
		    
		    
		
		    line2.setStartX(400.0f);
		    line2.setStartY(70.0f);
		    line2.setEndX(400.0f);		
		    line2.setEndY(550.0f);
		    
		    
	
		    line3.setStartX(300.0f);
		    line3.setStartY(70.0f);
		    line3.setEndX(400.0f);		
		    line3.setEndY(70.0f);
		    

		    line4.setStartX(300.0f);
		    line4.setStartY(550.0f);
		    line4.setEndX(400.0f);		
		    line4.setEndY(550.0f);
		    
		    line1.setVisible(false);
		    line2.setVisible(false);
		    line3 .setVisible(false);
		    line4 .setVisible(false);
		    
		    try{
		    main.p.getChildren().remove(1);
	
		    main.p.setVisible(false);
		   
		    }catch(Exception e){
		    	
		    }

		    pp.getChildren().add(v);
		    pp.getChildren().add(main.p);
		    pp.getChildren().add(line1);
		    pp.getChildren().add(line2);
		    
		    pp.getChildren().add(line3);
		    pp.getChildren().add(line4);
		    
		    Button n = new Button("creat Main");
		    
		    ta = new TextArea("stats: >>..");
		    ta.setPrefSize(690, 140);
		    ta.setLayoutX(500);
		    ta.setLayoutY(500);
		    ta.setEditable(false);
		    
		
			
			ag.p.setLayoutX(1000);
			ag.p.setLayoutY(250);
			ag.p.setVisible(false);
			   
			   
			   /**
			    * 
			    */

			   
			  
			     final Duration SEC_2 = Duration.millis(2000);
			     final Duration SEC_3 = Duration.millis(3000);
			 
			  //   PauseTransition pt = new PauseTransition(Duration.millis(1000));
			   /*  FadeTransition ft = new FadeTransition(SEC_3);
			     ft.setFromValue(1.0f);
			     ft.setToValue(0.3f);
			     ft.setCycleCount(2);
			     ft.setAutoReverse(true);*/
			     TranslateTransition tt = new TranslateTransition(SEC_2);
			     tt.setFromX(-00f);
			     tt.setToX(-650f);
			     
			     TranslateTransition tt2 = new TranslateTransition(SEC_2);
			    // tt2.setFromX(-ag.p.getLayoutX());
			     
			 
			     tt2.setToY(-150f);
			    
			   //  tt.setCycleCount(2);
			    // tt.setAutoReverse(true);
			  /*   RotateTransition rt = new RotateTransition(SEC_3);
			     rt.setByAngle(180f);
			     rt.setCycleCount(4);
			     rt.setAutoReverse(true);
			     */
			     ScaleTransition st = new ScaleTransition(SEC_2);
			     st.setByX(.5f);
			     st.setByY(.5f);
			   //st.setCycleCount(3);
			     st.setAutoReverse(true);
			     st.setCycleCount(2);
			 
			     final SequentialTransition seqT = new SequentialTransition (ag.p/*, pt*//*, ft, tt,tt2, rt,*/, st,tt,tt2);
			     
				   n.setOnAction(new EventHandler<ActionEvent>() {
		                public void handle(ActionEvent event) {
		                	  main.p.setVisible(true);
		                	  mc= new MainContauner();
		                	 mc.main(null);
		                	  ag.p.setVisible(true);
		              	  mc.Craet_Agent("A0","com.Houssem_DEGHA.Agent_project.Agent_buyer");
		            //  	  mc.Craet_Agent("A1","com.Houssem_DEGHA.Agent_project.Agent_Seller");
		                	/*  if(i==0){ ag.move_to_1(); i=1; }else if(i==1){
		    					  ag.p.setLayoutX(190); ag.p.setLayoutY(27);
		    					  ag.move_to_2(); i=2; }else if(i==2){
		    					  
		    					  ag.move_to_3(); i=3; }else {
		    					  
		    					 ag.move_to_0(); }*/
		                	try {
		                	//	
		                	 
		                	}catch(Exception e){
		                		
		                	}
		                      
		                }
		                });
			   /**
			    * 
			    */
			  //-------------------------------------------------------------  
				   Button n2_1 = new Button("pc1");
				   
				   n2_1.setOnAction(new EventHandler<ActionEvent>() {
		                public void handle(ActionEvent event) {
		                	try {
		                		container1.p.setVisible(true);
		                		Contauner c =	 new Contauner("A1","com.Houssem_DEGHA.Agent_project.Agent_Seller");
			               	c.main(null);
			               	c.Craet_Agent();
			                	}catch(Exception e){
			                		
			                	}
		                	  
		                      
		                }
		                });
                  Button n2_2 = new Button("pc2");
				   
				   n2_2.setOnAction(new EventHandler<ActionEvent>() {
		                public void handle(ActionEvent event) {
		                	try {
		                		container2.p.setVisible(true);
		                	Contauner c =	 new Contauner("A2","com.Houssem_DEGHA.Agent_project.Agent_Seller");
			               	c.main(null);
			                	c.Craet_Agent();
			                	}catch(Exception e){
			                		
			                	}
		                	  
		                      
		                }
		                });
				   
				   
   Button n2_3 = new Button("pc3");
				   
				   n2_3.setOnAction(new EventHandler<ActionEvent>() {
		                public void handle(ActionEvent event) {
		                	try {
		                		container3.p.setVisible(true);
		                		Contauner c =	 new Contauner("A3","com.Houssem_DEGHA.Agent_project.Agent_Seller");
			                	c.main(null);
			               	c.Craet_Agent();
			               	}catch(Exception e){
			                		
			                	}
		                	  
		                      
		                }
		                });
			//--------------------------------------------------------------	   
  Button n3 = new Button("start");
  //n3.setAccelerator(KeyCombination.keyCombination("Ctrl+H"));
  
 
		  /*  	switch (i) {
                case 1:  {
                	
                	ag.move_to_1();
                }
                         break;
                case 2:{
                	ag.send_message();
                }
                         break;
                case 3: {
                	Agent1.get_message();
                	
                }
                         break;
                case 4: {
                	Agent1.send_message();
                }
                         break;
                case 5:  {
                	ag.get_message();
                }
                         break;
                case 6: {
                	  ag.p.setLayoutX(190); ag.p.setLayoutY(27);
                	ag.move_to_2();
                }
                         break;
                case 7:  {
                	ag.send_message();
                }
                         break;
                case 8:  {
                	Agent2.get_message();
                }
                         break;
                case 9:  {
                	Agent2.send_message();
                	
                }
                         break;
                case 10:{
                	ag.get_message();
                
                }
                         break;
                case 11: {
                	ag.move_to_3();
                
                }
                         break;
                case 12: {
                	ag.send_message();
                	
                }
                         break;
                case 13: {
                	Agent3.get_message();
                	
                }
                         break;
                case 14: {
                	Agent3.send_message();
                	
                }
                         break;
                case 15: {
                	ag.get_message();
                	
                }
                         break;
                case 16: {
                	ag.move_to_0();
                	
                }
                         break;
                default: {
                	
                }
                
                         break;
            }
            		i++;
            	*/
 
  
				   n3.setOnAction(new EventHandler<ActionEvent>() {
		                public void handle(ActionEvent event) {
		                	
		                
		                	
		                	
		                	
		                	
		                	/*
		                	
		                	if(i==0){
		                		ag.move_to_1(); i=1; 
		                		
		                		}else if(i==1){
		    					  ag.p.setLayoutX(190); ag.p.setLayoutY(27);
		    					  ag.move_to_2(); i=2; 
		    					  
		                		}else if(i==2){
		    					  
		    					  ag.move_to_3(); i=3; 
		    					  
		                		}else {
		    					  
		    					 ag.move_to_0();
		    					  }
		                      */
		                }
		                });
				   
  Button b = new Button("creat network");
				   
				   b.setOnAction(new EventHandler<ActionEvent>() {
		                public void handle(ActionEvent event) {
		                	try {
		                	
		                		 line1.setVisible(true);
		             		    line2.setVisible(true);
		             		    line3 .setVisible(true);
		             		    line4 .setVisible(true);
			                	}catch(Exception e){
			                		
			                	}
		                	  
		                      
		                }
		                });
				   
				  HBox vv = new HBox(); vv.setSpacing(3);
				  vv.setLayoutX(450);
				  vv.setOpacity(0.2f);
				  vv.getChildren().addAll(n,n2_1,n2_2,n2_3,b,n3);
			 pp.getChildren().add(vv);
		
		    pp.getChildren().add(ta);
		    pp.getChildren().add(ag.p);
		    root.setCenter(pp);
		      Scene scene = new Scene(root,1200,650);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				
				 scene.getAccelerators().put(
					      new KeyCodeCombination(KeyCode.M), 
					      new Runnable() {
					        public void run() {
					         
					        /*	move to the computer Number >> [ 1 ] \n
					        	send a message : what the price of the javafx Book ?
					        	answer : 80 $

					        	move to the computer Number >> [ 1 ] \n
					        	send a message : what the price of the javafx Book ?
					        	answer : 180 $

					        	move to the computer Number >> [ 1 ] \n
					        	send a message : what the price of the javafx Book ?
					        	answer :130 $*/
					        	
					        	switch (i) {
				                case 1:  {
				                	
				                	ag.move_to_1();
				                	ta.appendText("move to the computer Number >> [ 1 ] \n");
				                	ta.appendText("");
				                }
				                         break;
				                case 2:{
				                	ag.send_message();
				                	ta.appendText("send a message : what the price of the javafx Book ? \n");
				                	ta.appendText("");
				                }
				                         break;
				                case 3: {
				                	Agent1.get_message();
				                	ta.appendText("the message has been getten!~ \n");
				                	ta.appendText("");
				                	
				                }
				                         break;
				                case 4: {
				                	Agent1.send_message();
				                	ta.appendText("answer : "+container1.Price.getText()+" $ \n");
				                	ta.appendText("");
				                }
				                         break;
				                case 5:  {
				                	ag.get_message();
				                	ta.appendText("ok thanks Agent [1] \n");
				                	ta.appendText("");
				                }
				                         break;
				                case 6: {
				                
				                	  ag.p.setLayoutX(190); ag.p.setLayoutY(27);
				                	ag.move_to_2();
				                	ta.appendText("------------------------------------------ \n");
				                	ta.appendText("move to the computer Number >> [ 2 ] \n");
				                	ta.appendText("");
				                }
				                         break;
				                case 7:  {
				                	ag.send_message();
				                	ta.appendText("send a message : what the price of the javafx Book ? \n");
				                	ta.appendText("");
				                }
				                         break;
				                case 8:  {
				                	Agent2.get_message();
				                	ta.appendText("ok i get the message!~ \n");
				                	ta.appendText("");
				                }
				                         break;
				                case 9:  {
				                	Agent2.send_message();
				                	ta.appendText("answer : "+container2.Price.getText()+" $ \n");
				                	ta.appendText("");
				                	
				                }
				                         break;
				                case 10:{
				                	ag.get_message();
				                	ta.appendText("thanks Agent [ 2 ] \n");
				                	ta.appendText("");
				                
				                }
				                         break;
				                case 11: {
				                	
				                
						        	
				                	ag.move_to_3();
				                	ta.appendText("------------------------------------------ \n");
				                	ta.appendText("move to the computer Number >> [ 3 ] \n");
				                	ta.appendText("");
				                
				                	
				                	
				                }
				                         break;
				                case 12: {
				                	ag.send_message();
				                	ta.appendText("send a message : what the price of the javafx Book ? \n");
				                	ta.appendText("");
				                	
				                }
				                         break;
				                case 13: {
				                	Agent3.get_message();
				                	ta.appendText("ok i get the message@~ \n");
				                	ta.appendText("");
				                	
				                }
				                         break;
				                case 14: {
				                	Agent3.send_message();
				                	
				                	ta.appendText("answer : "+"+container3.Price.getText()+"+" $ \n");
				                	ta.appendText("");
				                }
				                         break;
				                case 15: {
				                	ag.get_message();
				                	ta.appendText("ok thank you Agent [ 3 ] \n");
				                	ta.appendText("");
				                	
				                }
				                         break;
				                case 16: {
				                	ta.appendText("------------------------------------------ \n");
				                	ag.move_to_0();
				                	ta.appendText("move to the computer Number >> [ Main ] \n");
				                	
				                	Integer x = Math.min(Integer.valueOf(container1.Price.getText()), Integer.valueOf(container2.Price.getText())
		                				                					);            	 
				                	
				                			
				                					ta.appendText("the best privce is  = " +Math.min(Integer.valueOf(container3.Price.getText()),x));
				                }
				                         break;
				                default: {
				                	
				                }
				                
				                         break;
				            }
				            		i++;
					        	
					        	
					        }
					        
					      }
					    );
					  
				
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

	public static void main(String[] args) {
		launch(args);
	}
}
