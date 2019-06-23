package ch10pc10;

/**
 *
 * @author Frank
 */
public class CargoShip extends Ship {
    //fields
    public int capacity;
    
    //constructors
    public CargoShip () {
        name = "";
        yearBuilt = "";
        capacity = 0;
    }
    public CargoShip (String name, String yearBuilt, int capacity) {
        this.name = name;
        this.yearBuilt = yearBuilt;
        this.capacity = capacity;
    }
    
    //methods
    //accessors
    public int getCapacity () {
        return capacity;
    }
    
    //mutators
    public void setCapacity (int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public String toString () {
        return "The ship " + name + " can carry " + capacity + " tons of cargo.";
    }
}
