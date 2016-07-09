
public class Tor {
	
	private State state=null;
	
	
	
	public Tor(){
		this.state=Offen.getOffen(this);
	}
	
	public void öffen(){
		state.öffnen();
	}
	
	public void schließen(){
		state.schließen();
	}
	
	public void setZustand(State s){
		this.state=s;
	}
	
	public String getZustand(){
		return this.state.toString();
	}
	
	public static void main(String[] args) {
		Tor tor=new Tor();
		System.out.println(tor.getZustand());
		tor.schließen();
		System.out.println(tor.getZustand());
		tor.schließen();
		tor.schließen();
		
		tor.öffen();
		tor.öffen();
		tor.schließen();
		tor.öffen();
		tor.öffen();
		tor.schließen();
		tor.öffen();
		tor.öffen();
		tor.schließen();
		tor.öffen();
		tor.öffen();
		tor.schließen();
		
		
		
		
		
		
	}

}
