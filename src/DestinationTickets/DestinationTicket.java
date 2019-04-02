package DestinationTickets;

import tickettoride.Routes.Route;

/**
 *
 * @author AlpacaBasket
 */
public class DestinationTicket {
    
    private final Route start;
    private final Route end;
    private final int points;
    
    DestinationTicket(Route r1, Route r2, int p) {
        this.start = r1;
        this.end = r2;
        this.points = p;
    }
    
    public Route getStart() {
        return this.start;
    }
    
    public Route getEnd() {
        return this.end;
    }
    
    public int getPoints() {
        return this.points;
    }
    
}
