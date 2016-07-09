
public class Geschlossen extends State {
	
	private static Geschlossen g=null;
	
	private Geschlossen(Tor tor){
		this.tor=tor;
	}
	
	
	
	
	public static Geschlossen getGeschlossen(Tor tor){
		if(g==null){
			g=new Geschlossen(tor);
		}
		return g;
	}
	
	
	public void öffnen(){
		tor.setZustand(Offen.getOffen(tor));
	}
	
	public String toString(){
		return "Tor ist Geschlossen";
	}

}
