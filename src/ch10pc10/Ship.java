package ch10pc10;

/**
 *
 * @author Frank
 * 
 * Ship superclass
 */
public class Ship {
    //fields
    public String name;
    public String yearBuilt;
    
    //Constructors
    public Ship() {
        name = "";
        yearBuilt = "";
    }
    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }
    
    //methods
    //accessors
    public String getName() {
        return name;
    }
    public String getYearBuilt() {
        return yearBuilt;
    }
    
    //mutators
    public void setName(String name) {
        this.name = name;
    }
    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    
    @Override
    public String toString() {
        return "The ship " + name + " was built on this date: " + yearBuilt + ".";
    }
}
