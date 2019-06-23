package ch10pc10;

/**
 *
 * @author Frank
 */
public class CruiseShip extends Ship {
    //fields
    public int maxPassengers;
    
    //constructors
    public CruiseShip() {
        name = "";
        yearBuilt = "";
        maxPassengers = 0;
    }
    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        this.name = name;
        this.yearBuilt = yearBuilt;
        this.maxPassengers = maxPassengers;
    }
    
    //methods
    //accessor
    public int getMaxPassengers() {
        return maxPassengers;
    }
    
    //mutator
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
    
    @Override
    public String toString() {
        return "The ship " + name + " can hold " + maxPassengers + " passengers.";
    }
}
