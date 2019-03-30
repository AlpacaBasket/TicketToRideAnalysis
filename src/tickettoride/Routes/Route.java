package tickettoride.Routes;

import tickettoride.Locations.Location;

/**
 *
 * @author AlpacaBasket
 */
public class Route {
    
    public enum RType { blue, red, yellow, green, pink, grey, white, orange };
    private RType type;
    private Location[] locations;
    
    Route(Location[] l, RType t) {
        this.locations = l;
        this.type = t;
    }
    
    public Location[] getLocations() {
        return this.locations;
    }
    
    public RType getType() {
        return this.type;
    }
    
}
