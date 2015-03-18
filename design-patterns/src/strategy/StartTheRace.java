package strategy;


/**
 * <h1> Strategy pattern </h1>
 *
 * The strategy pattern defines a family of algorithms, encapsulates each one,
 * and makes them interchangeable.
 * <p>
 * Strategy lets the algorithm var independently from clients that use it.
 * 
 *  
 */

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
