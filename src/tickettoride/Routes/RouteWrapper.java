package tickettoride.Routes;

import java.util.ArrayList;

/**
 * Wraps multiple shared track routes together
 * @author AlpacaBasket
 */
public class RouteWrapper {
    
    private final Route[] routes;
    
    RouteWrapper (Route[] r) {
        this.routes = r;
    }
    
    public Route [] getRoutes() {
        return this.routes;
    }
    
}
