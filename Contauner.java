package com.Houssem_DEGHA.Agent_project;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.util.ExtendedProperties;
import jade.util.leap.Properties;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;
import jade.wrapper.StaleProxyException;
public class Contauner {
static String s1 ; 
static String s2 ;
AgentContainer con;
Runtime rt =Runtime.instance();
static ProfileImpl pc = new ProfileImpl(false);
	public Contauner(String s1,String s2){
		this.s1 = s1 ; this.s2 = s2 ;
	}
public static void main(String[] king){
		
		try {
			
			pc.setParameter(ProfileImpl.MAIN_HOST, "localhost");
			System.out.println("the container x = "+pc.getProperties().stringPropertyNames());
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public void Craet_Agent(){
	 con = rt.createAgentContainer(pc);
	 
	AgentController agentController;
	try {
		agentController = con.createNewAgent
(s1, s2, new Object[]{ });
		agentController.start();
	} catch (StaleProxyException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
