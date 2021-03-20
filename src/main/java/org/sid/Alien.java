package org.sid;




public class Alien {
	private Laptop lap;
	private teacher teche ;
	
	


	public void show() {
		lap.pricipalinfo();
		teche.teach();
		System.out.println("in show ");
	}


	

	public void setTeche(teacher teche) {
		this.teche = teche;
	}




	public void setLap(Laptop lap) {
		this.lap = lap;
	}

}
