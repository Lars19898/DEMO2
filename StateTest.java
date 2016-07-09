import junit.framework.TestCase;

public class StateTest extends TestCase {
	State s = null;
	State s1 = null;
	Tor tor = null;
	protected void setUp() throws Exception {
		tor = new Tor();
		s = Geschlossen.getGeschlossen(tor);
		s1 = Geschlossen.getGeschlossen(tor);
	}

	// Test des Singelton

	public void testEquals() {
		assertEquals(s, s1);
	}
	
	public void testZustand(){
		assertEquals(tor.getZustand(),"Tor ist geöffnet");
		tor.schließen();
		assertEquals(tor.getZustand(), "Tor ist Geschlossen");
	}

}
