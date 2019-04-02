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
    private final int locomotives;
    
    /**
     * @param l1
     * Locations
     * @param t
     * Colour of route: RType enum
     * @param l2
     * Length of route
     * @param b
     * If route is a tunnel
     * @param l3 
     * Number of locomotives needed
     */
    Route(Location[] l1, RType t, int l2, boolean b, int l3) {
        this.locations = l1;
        this.type = t;
        this.length = l2;
        this.points = points(l2);
        this.tunnel = b;
        this.locomotives = l3;
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
