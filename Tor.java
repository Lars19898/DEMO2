
public class Tor {
	
	private State state=null;
	
	
	
	public Tor(){
		this.state=Offen.getOffen(this);
	}
	
	public void �ffen(){
		state.�ffnen();
	}
	
	public void schlie�en(){
		state.schlie�en();
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
		tor.schlie�en();
		System.out.println(tor.getZustand());
		tor.schlie�en();
		tor.schlie�en();
		
		tor.�ffen();
		tor.�ffen();
		tor.schlie�en();
		tor.�ffen();
		tor.�ffen();
		tor.schlie�en();
		tor.�ffen();
		tor.�ffen();
		tor.schlie�en();
		tor.�ffen();
		tor.�ffen();
		tor.schlie�en();
		
		
		
		
		
		
	}

}
