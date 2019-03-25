package com.Houssem_DEGHA.App_jad;

import java.io.File;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Agentp {
	public Pane p ;
	ImageView message_send;
	ImageView message_come;
	int My_plays = 0 ;
	
	public Agentp(){
		
		p = new Pane();
		File f3 = new File("a.png");
	     Image i3 = new Image(f3.toURI().toString());
		   final ImageView selectedImage3 = new ImageView();   
	     selectedImage3.setImage(i3);
	     selectedImage3.setFitHeight(100);
	     selectedImage3.setFitWidth(90);
	   /*  DropShadow ds = new DropShadow();
	        ds.setOffsetY(3.0);
	        ds.setOffsetX(3.0);
	        ds.setColor(Color.BLUE);
	       // selectedImage3.setEffect(ds);
	     */
	
		File f = new File("ms.png");
	     Image i = new Image(f.toURI().toString());
	     message_send = new ImageView();   
	     message_send.setImage(i);
	     message_send.setFitHeight(25);
	     message_send.setFitWidth(25);
		   
	     message_send.setLayoutX(35);
	     message_send.setLayoutY(50);
		   
		
			File f1 = new File("mc.png");
		     Image i1 = new Image(f1.toURI().toString());
		     message_come = new ImageView();   
		     message_come.setImage(i1);
		     message_come.setFitHeight(25);
		     message_come.setFitWidth(25);
		     
		     message_come.setLayoutX(35);
		     message_come.setLayoutY(50);
		     
		     message_send.setVisible(false);
		     message_come.setVisible(false);
	     
	     p.getChildren().add(selectedImage3);
	   p.getChildren().add(message_come);
	   
	   
	   
	   
	    p.getChildren().add(message_send);
	   
	    
  
	}
	
	public void send_message(){
		
		final Duration SEC_2 = Duration.millis(200);
		final Duration SEC_3 = Duration.millis(1000);
		
	    
		 RotateTransition rt2 = new RotateTransition(SEC_2);
	     rt2.setByAngle(-40f);
	    
	     rt2.setCycleCount(2);
	  rt2.setAutoReverse(true);
	  
	  RotateTransition rt = new RotateTransition(SEC_2);
	     rt.setByAngle(40f);
	    
	     rt.setCycleCount(2);
	  rt.setAutoReverse(true);
	  
	     final SequentialTransition seqT = new SequentialTransition (p,rt,rt2);
	   //  seqT.setAutoReverse(true);
  		  seqT.play();
  		  
  		  
  		 FadeTransition ft = new FadeTransition(SEC_3);
	     ft.setFromValue(0f);
	     ft.setToValue(1f);
	     ft.setCycleCount(2);
	     ft.setAutoReverse(true);
	     message_send.setVisible(true);
	     final SequentialTransition seqT2 = new SequentialTransition (message_send,ft);
		   //  seqT.setAutoReverse(true);
	  		  seqT2.play();
	  		  
  		
  		
		
	}
public void get_message(){
		
		final Duration SEC_2 = Duration.millis(200);
		final Duration SEC_3 = Duration.millis(1000);
		
	    
		 RotateTransition rt2 = new RotateTransition(SEC_2);
	     rt2.setByAngle(-40f);
	    
	     rt2.setCycleCount(2);
	  rt2.setAutoReverse(true);
	  
	  RotateTransition rt = new RotateTransition(SEC_2);
	     rt.setByAngle(40f);
	    
	     rt.setCycleCount(2);
	  rt.setAutoReverse(true);
	  
	     final SequentialTransition seqT = new SequentialTransition (p,rt,rt2);
	   //  seqT.setAutoReverse(true);
  		  seqT.play();
  		  
  		  
  		 FadeTransition ft = new FadeTransition(SEC_3);
	     ft.setFromValue(0f);
	     ft.setToValue(1f);
	     ft.setCycleCount(2);
	     ft.setAutoReverse(true);
	     message_come.setVisible(true);
	     final SequentialTransition seqT2 = new SequentialTransition (message_come,ft);
		   //  seqT.setAutoReverse(true);
	  		  seqT2.play();
	  		  
  		
  		
		
	}
	
    public void move_to_1(){
//--------------------------------------------------------------------------------------------
    	 final Duration SEC_2 = Duration.millis(500);
    	 ScaleTransition st = new ScaleTransition(SEC_2);
		     st.setByX(.5f);
		     st.setByY(.5f);		
		     st.setAutoReverse(true);
		     st.setCycleCount(2);

          TranslateTransition m1 = new TranslateTransition(SEC_2);
    	 TranslateTransition m2 = new TranslateTransition(SEC_2);
    	 TranslateTransition m3 = new TranslateTransition(SEC_2);
    	            m1.setFromX(-00f);
	                     m1.setToX(-645f);
	                     m2.setToY(-223f);
	        		     m3.setFromX(-650);
	        		     m3.setToX(-810f);
	        		     final SequentialTransition seqT = new SequentialTransition (p,st,m1,m2,m3);
	           		  seqT.play();
	           		  
    }
    
    public void move_to_2(){
    
    	 final Duration SEC_2 = Duration.millis(500);
    	 ScaleTransition st = new ScaleTransition(SEC_2);
		     st.setByX(.5f);
		     st.setByY(.5f);		
		     st.setAutoReverse(true);
		     st.setCycleCount(2);

          TranslateTransition m1 = new TranslateTransition(SEC_2);
    	 TranslateTransition m2 = new TranslateTransition(SEC_2);
    	 TranslateTransition m3 = new TranslateTransition(SEC_2);
    	 m1.setFromX(-00f);
	        m1.setToX(160f);
	         m2.setFromY(-00f);
	        m2.setToY(230f);
	        
	       // m3.setFromX(-650);
 		     m3.setToX(-00f);
 		   My_plays = 2;
	          		   final SequentialTransition seqT = new SequentialTransition (p,st,m1,m2,m3);
		           		  seqT.play();
    	
    	
    }
	                    
    public void move_to_3(){
    	final Duration SEC_2 = Duration.millis(500);
   	 ScaleTransition st = new ScaleTransition(SEC_2);
		     st.setByX(.5f);
		     st.setByY(.5f);		
		     st.setAutoReverse(true);
		     st.setCycleCount(2);

         TranslateTransition m1 = new TranslateTransition(SEC_2);
   	 TranslateTransition m2 = new TranslateTransition(SEC_2);
   	 TranslateTransition m3 = new TranslateTransition(SEC_2);
   	 
   
     m1.setToX(160f);
      m2.setToY(445f);
      m3.setToX(-00f);
      final SequentialTransition seqT = new SequentialTransition (p,st,m1,m2,m3);
		  seqT.play();
   	 
    }
    public void move_to_0(){
    	
    	final Duration SEC_2 = Duration.millis(500);
      	 ScaleTransition st = new ScaleTransition(SEC_2);
   		     st.setByX(.5f);
   		     st.setByY(.5f);		
   		     st.setAutoReverse(true);
   		     st.setCycleCount(2);

            TranslateTransition m1 = new TranslateTransition(SEC_2);
      	 TranslateTransition m2 = new TranslateTransition(SEC_2);
      	 TranslateTransition m3 = new TranslateTransition(SEC_2);
     	 TranslateTransition m4 = new TranslateTransition(SEC_2);
      	 
      	 
  	 
	     m1.setToX(155f);	   
	     m2.setToY(235f);
	 	m3.setToX(810);
		 //   m4.setToY(270);
		     final SequentialTransition seqT = new SequentialTransition (p,st,m1,m2,m3);
			  seqT.play();
	     
    }
    
    /*
                }else if(My_plays==1){
                m1.setFromX(-00f);
		        m1.setToX(150f);
		         m2.setFromY(-00f);
		        m2.setToY(270f);


                }else if(My_plays==2){
                 m1.setFromX(-00f);
		     m1.setToX(155f);
                }else {
                	  m1.setFromX(-00f);
		     m1.setToX(155f);
		       m2.setFromY(-00f);
		     m2.setToY(-170f);
		     

                }
               */
             /** ****************************************************** **/
          //  if(x==0){
        /*   	 m3.setFromX(p.getTranslateX());
        	 m3.setFromY(p.getTranslateY());
        	 m4.setFromX(p.getTranslateX());
        	 m4.setFromY(p.getTranslateY());
          
		     */
      /*      	m3.setToX(710);
   		     m4.setToY(270);
            
		     m.setToX(820);
		     m.setToY(220);
		     My_plays =0;
		  
             }else if(x==1){
            
            
    		     My_plays = 1;
    		   }else if(x==2){
    			   m3.setFromX(p.getTranslateX());
              	 m3.setFromY(p.getTranslateY());
              	 m4.setFromX(p.getTranslateX());
              	 m4.setFromY(p.getTranslateY());
  		     
    			   m3.setFromX(-650);
      		     m3.setToX(-790f);
      		   My_plays = 2;
             }else {
            	 m3.setFromX(p.getTranslateX());
            	 m3.setFromY(p.getTranslateY());
            	 m4.setFromX(p.getTranslateX());
            	 m4.setFromY(p.getTranslateY());
		     
            	 My_plays = 3 ;
            	// m3.setFromY(-00f);
    		     m3.setToY(+225f);
             	   m4.setFromX(-650);
    		     m4.setToX(-800f);
    		     

             }
   final SequentialTransition seqT = new SequentialTransition (p,st,m1,m2,m3,m4,m);
    		  seqT.play();
    		 
 //-----------------------------------------------------------------------------------------------------------------
*/
    	
   
    
   
	
}
