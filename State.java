
public abstract class State {

	protected Tor tor=null; // Referenz auf den Kontext
	
	

	
	public void �ffnen(){
		System.out.println("Tor ist bereits ge�ffnet");
	}
	
	public void schlie�en(){
		System.out.println("Tor bereits geschlossen!");
	}
	
}
