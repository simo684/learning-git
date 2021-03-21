package org.sid;




public class Alien {
	private Laptop lap;
	private teacher teche ;
	
	


	public void show() {
		lap.pricipalinfo();
		teche.teach();
		System.out.println("in show ");
		System.out.println("je t ai ecris from github");
		
	}


	

	public void setTeche(teacher teche) {
		this.teche = teche;
	}




	public void setLap(Laptop lap) {
		this.lap = lap;
	}

}
