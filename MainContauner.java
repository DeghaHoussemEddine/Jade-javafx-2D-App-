package com.Houssem_DEGHA.Agent_project;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.util.ExtendedProperties;
import jade.util.leap.Properties;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;
import jade.wrapper.StaleProxyException;
public class MainContauner {
public	static String s1 ; 
	static String s2 ;
	static Runtime rt =Runtime.instance();
	static Properties p = new ExtendedProperties();
	static AgentContainer con;
	static AgentController agentController;
	
	public static void main(String[] king){
		
		
		
		try {
			
			p.setProperty("gui", "true");
			ProfileImpl pc = new ProfileImpl(p);
			 con = rt.createMainContainer(pc);
			con.start();
			System.out.println(con.getPlatformName());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Craet_Agent(String s1,String s2){
		 
	
		try {
			agentController = con.createNewAgent
	(s1, s2, new Object[]{});
			agentController.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
