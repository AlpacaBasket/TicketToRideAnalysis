package tickettoride.Routes;

import java.util.ArrayList;
import tickettoride.Locations.Location;

/**
 *
 * @author AlpacaBasket
 */
public abstract class Route {
    
    private ArrayList<Location> locations;
    
    public enum RType { blue, red, yellow, green, pink, grey, white, orange };
    private RType type;
    
    public ArrayList<Location> getLocations() {
        return this.locations;
    }
    
    public RType getType() {
        return this.type;
    }
    
}
