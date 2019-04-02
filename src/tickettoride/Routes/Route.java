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
    private final boolean tunnel;
    
    
    Route(Location[] l, RType t, int len, boolean b) {
        this.locations = l;
        this.type = t;
        this.length = len;
        this.points = points(len);
        this.tunnel = b;
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
    
    public boolean isTunnel() {
        return this.tunnel;
    }
    
    // Return point value depending on route length
    // Considering being able to pass the game type in case different games have different point values for lengths
    private int points(int len) {
        
        switch (len) {
            case 1: return 1;
            case 2: return 2;
            case 3: return 4;
            case 4: return 7;
            case 5: return 10;
            case 6: return 15;
            default: return 0; // Something went wrong
        }
        
    }
}
