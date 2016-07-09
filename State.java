
public abstract class State {

	protected Tor tor=null; // Referenz auf den Kontext
	
	

	
	public void öffnen(){
		System.out.println("Tor ist bereits geöffnet");
	}
	
	public void schließen(){
		System.out.println("Tor bereits geschlossen!");
	}
	
}
