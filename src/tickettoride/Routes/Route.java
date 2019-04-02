package tickettoride.Routes;

import tickettoride.Locations.Location;

/**
 *
 * @author AlpacaBasket
 */
public class Route {

    public enum RType { blue, red, yellow, green, pink, grey, white, orange };
    
    private final RType type;
    private final Location[] locations;
    private final int length;
    private final int points;
    
    Route(Location[] l, RType t, int len) {
        this.locations = l;
        this.type = t;
        this.length = len;
        this.points = points(len);
    }
    
    public Location[] getLocations() {
        return this.locations;
    }
    
    public RType getType() {
        return this.type;
    }
    
    public int getPoints() {
        return this.points;
    }
    
    public int getLength() {
        return this.length;
    }
    
    // Return point value depending on route length
    // Considering being able to pass the game type in case different games have different point values for lengths
    private int points(int len) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
