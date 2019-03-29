package tickettoride.Routes;

import java.util.ArrayList;
import tickettoride.Locations.Location;

/**
 *
 * @author AlpacaBasket
 */
public abstract class Route {
    
    private ArrayList<Location> locations;
    
    enum RType { blue, red, yellow, green, pink, grey, white, orange };
    private RType type;
    
    public ArrayList<Location> getLocations() {
        return this.locations;
    }
    
    public void setLocations(ArrayList<Location> list) {
        this.locations = list;
    }
    
    public void addLocation(Location l) {
        this.locations.add(l);
    }
    
}
