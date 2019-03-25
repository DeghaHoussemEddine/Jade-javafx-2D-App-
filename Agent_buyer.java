package com.Houssem_DEGHA.Agent_project;

import jade.core.AID;
import jade.core.Agent;
import jade.core.ContainerID;
import jade.core.Location;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.core.behaviours.WakerBehaviour;
import jade.domain.mobility.MobileAgentDescription;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

import org.omg.PortableInterceptor.LOCATION_FORWARD;




public class Agent_buyer extends Agent {
	int i=1;
	protected void setup() {
		
		
		
/*		ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
		msg.addReceiver(new AID("A1",AID.ISLOCALNAME));
		msg.setContent("hello Agent im the Agent A0");
		send(msg);
		*/
	/*	if(vals.length==1){
			a = (Agentp) vals[0];
			System.out.println("val1=" + vals[0]);
		a.move_to_1();*/
		//}
		
		
	
		addBehaviour(new CyclicBehaviour() {
			
			
			public void action() {
				ACLMessage message = receive();
				if(message!=null){
					System.out.println("the message is : "+message.getContent());
					
				}else {
					block();
				}
				
			}
		});
		
	/*	
	addBehaviour(new TickerBehaviour(this, 10000) {
		
			protected void onTick() {
			
					/*
				}
				}
				}else if(i==2){
					System.out.println("i will move to Main-Container! soon 2");
					ContainerID dest = new ContainerID("Container-2", null);
					desc.setDestination(dest);
					//moveAct.setMobileAgentDescription(desc);
					doMove(dest);
					i++;
				}else if(i==3){
					System.out.println("i will move to Main-Container! soon 3");
					ContainerID dest = new ContainerID("Container-3", null);
					desc.setDestination(dest);
					//moveAct.setMobileAgentDescription(desc);
					doMove(dest);
					i++;
				}
			
				*/
				/*"/*Main-Container"*/
		/*		
			}
		});
	
	*/
    addBehaviour(new WakerBehaviour(this, 10000) {
		
		protected void onWake() {
			MobileAgentDescription desc = new MobileAgentDescription();
			desc.setName(new AID("192.168.1.8:1099/JADE", AID.ISLOCALNAME));
			
			try{	
				System.out.println("i will move to Main-Container! soon 1");
				ContainerID dest = new ContainerID("Container-2", null);
				desc.setDestination(dest);
				//moveAct.setMobileAgentDescription(desc);
				
				doMove(dest);
			
			
				
			}catch(Exception e){
				
			}
			super.onWake();
		}
		
	});
   
    /*
addBehaviour(new WakerBehaviour(this, 20000) {
	
	protected void onWake() {
		MobileAgentDescription desc = new MobileAgentDescription();
		desc.setName(new AID("192.168.1.8:1099/JADE", AID.ISLOCALNAME));
		
		try{	
			System.out.println("i will move to Main-Container! soon 1");
			ContainerID dest = new ContainerID("Container-3", null);
			desc.setDestination(dest);
			//moveAct.setMobileAgentDescription(desc);
			
			doMove(dest);
		
			return ;
			
		}catch(Exception e){
			
		}
		super.onWake();
	}
	
});
*/
/*
addBehaviour(new TickerBehaviour(this,30000) {
		
		public void onTick() {
		
			
		}
	});
		*/
	/*	addBehaviour(new TickerBehaviour(this,1000) {
			
		
			protected void onTick() {
				 System.out.println(" the message number = "+i++);
				 
				 if(i==2){
					//MoveAction moveAct = new MoveAction();
						MobileAgentDescription desc = new MobileAgentDescription();
						desc.setName(new AID("192.168.1.8:1099/JADE", AID.ISLOCALNAME));
							System.out.println("i will move to Main-Container! soon 2");
							ContainerID dest = new ContainerID("Container-2", null);
							desc.setDestination(dest);
							//moveAct.setMobileAgentDescription(desc);
							doMove(dest);
							i++;
						}
				// TODO Auto-generated method stub
				
			}
		});
		*/
		//System.out.println("agent Acheteur : " + this.getAID().getName());
    // doDelete();
	}
	
	

	protected void takeDown() {
       System.out.println(" destruction an Agant");
	}
/*
	public void doMove(Location arg0) {
	//	 System.out.println(" im movong to " +LOCATION_FORWARD.value);
			
	}*/
}
