package strategy;

public abstract class Vehicle {
  
	
	private GoAlgorithm goalgorithm;
	
	public Vehicle() {
		
	}
	
	/**
	 * when you want to use a particular algorithm in a derived class, all
     * you’ve got to do is to call the setGoAlgorithm method with the correct
     * algorithm object
	 */
	public void setGoalgorithm(GoAlgorithm goalgorithm) {
		this.goalgorithm = goalgorithm;
	}
  
    // calling this method from subclasses means the correct 
	// algorithm is called despite it being extracted out
	// of the working part of the subclass or super class Vehicle
	public void go() {
    	goalgorithm.go();
    }
}
