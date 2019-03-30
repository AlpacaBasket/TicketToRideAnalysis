package tickettoride.Locations;

import tickettoride.Routes.RouteWrapper;

/**
 *
 * @author AlpacaBasket
 */
public abstract class Location {
    
    protected RouteWrapper[] routes;
    protected String name;
    
    public String getName() {
        return this.name;
    }
    
    public RouteWrapper[] getRoutes() {
        return this.routes;
    }
    
}
