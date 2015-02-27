package strategy;

public class StartTheRace {

	public static void main(String[] args) {
		
		StreetRacer streetracer = new StreetRacer();
		Helicopter helicopter = new Helicopter();
		Jet jet = new Jet();
		
		streetracer.go();
		helicopter.go();
		jet.go();
		
	}

}
