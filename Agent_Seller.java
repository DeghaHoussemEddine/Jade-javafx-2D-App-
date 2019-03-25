package com.Houssem_DEGHA.Agent_project;

import javafx.application.Platform;

import org.omg.PortableInterceptor.LOCATION_FORWARD;












import jade.core.AID;
import jade.core.Agent;
import jade.core.ContainerID;
import jade.core.Location;
import jade.core.PlatformID;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.core.behaviours.WakerBehaviour;
import jade.domain.introspection.AddedBehaviour;
import jade.domain.mobility.MobileAgentDescription;
import jade.domain.mobility.MoveAction;
import jade.lang.acl.ACLMessage;

public class Agent_Seller extends Agent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	protected void setup() {
		
		
		
		
		
		
		
		
		
	            /*	ContainerID cid = new ContainerID("C1", null);
	            	doMove(cid);*/
	         
		            
	            try {
	           
	           // 	a.send_message();
				} catch (Exception e) {
					
				}
	        
	     
	//	if(vals.length==1){
		
	//	a.move_to_1();
		//	System.out.println("val1=" + vals[1]);
		
	//	}*/
	        //    addBehaviour(new TickerBehaviour(this, 5000) {
	    	/*		int i=0;
	    			protected void onTick() {
	    				System.out.println("i will move to Main-Container! soon");
	    				//MoveAction moveAct = new MoveAction();
	    				MobileAgentDescription desc = new MobileAgentDescription();
	    				desc.setName(new AID("192.168.1.8:1099/JADE",/* AID.ISLOCALNAME*//*true));*/
	    			//	ContainerID dest = new ContainerID(/*"/*Main-Container"*/"Container-2", null);
	    			//	desc.setDestination(dest);
	    				//moveAct.setMobileAgentDescription(desc);
	    			//	doMove(dest);
	    				
	    		//	}
	    //		});
		/*addBehaviour(new WakerBehaviour(this,5000) {
		
		protected void onWake() {
			
		}
		});
		addBehaviour(new OneShotBehaviour() {
			
			public void action() {
				// TODO Auto-generated method stub
				
			}
			
		});*/
	/*	addBehaviour(new TickerBehaviour(this, 10000) {
		
			private static final long serialVersionUID = 1L;
			int i=0;
			protected void onTick() {
				
			
				
				
//				final Object[] vals = getArguments();
				//192.168.1.8:1099/JADE
				
				/* 	   AID remoteAMS = new AID("A0",true);
				   remoteAMS.addAddresses("192.168.1.8:1099:1099/JADE");
				        PlatformID destination = new PlatformID(remoteAMS);
				        doMove(destination);
			          
		/*		
				System.out.println("i will move to Main-Container! soon");
//				final Object[] vals = getArguments();
				//192.168.1.8:1099/JADE
				 	   AID remoteAMS = new AID("Main-Container", AID.ISGUID);
				     remoteAMS.addAddresses("localhost:1099/JADE");
				        PlatformID destination = new PlatformID(remoteAMS);
				        doMove(destination);
			          
			            
			       
				
			}
		});*/
		addBehaviour(new CyclicBehaviour() {
			
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void action() {
				
				ACLMessage message = receive();
				if(message!=null){
					System.out.println("the message is : "+message.getContent());
					ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
					msg.addReceiver(message.getSender());
					msg.setContent("thank you i get your message im Agent "+this.getAgent().toString());
					send(msg);
				}else {
					block();
				}
				
				
				
				
			}
		});
/*		addBehaviour(new TickerBehaviour(this, 1000) {
			int i=0;
			protected void onTick() {
				++i;
				System.out.println("y=" +i);
				// TODO Auto-generated method stub
				
			}
		});*/
		
		
		
		//System.out.println("agent Acheteur : " + this.getAID().getName());
    // doDelete();
	}
	
	

	protected void takeDown() {
       System.out.println(" destruction an Agant");
	}

	/*public void doMove(Location arg0) {
		 System.out.println(" im movong to " +LOCATION_FORWARD.value);
			
	}*/
}
