
public class Offen extends State {
	
	private static Offen o=null;
	
	private Offen(Tor tor){
		this.tor=tor;
	}
	
	
	public static Offen getOffen(Tor tor){
		if(o==null){
			o=new Offen(tor);
		}
		return o;
	}
	
	
	public void schlie�en(){
		tor.setZustand(Geschlossen.getGeschlossen(tor));
	}
	
	public String toString(){
		return "Tor ist ge�ffnet";
	}

	
	
}
