package tickettoride.Locations;

import java.util.ArrayList;
import tickettoride.Routes.RouteWrapper;

/**
 *
 * @author AlpacaBasket
 */
public abstract class Location {
    
    private ArrayList<RouteWrapper> routes;
    private String name;
    
    public String getName() {
        return this.name;
    }
    
    public ArrayList<RouteWrapper> getRoutes() {
        return this.routes;
    }
    
}
