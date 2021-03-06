package server;

import helpers.ItinerarySortingAlgorithm;
import information.Airport;

/**
 * Get itinerary command.
 */
class GetItinerary implements Request
{
    private final Airport originAirport;
    private final Airport destinationAirport;
    private final int maxConnections;
    private final ItinerarySortingAlgorithm sortingAlgorithm;

    /**
     * Create an itinerary command.
     * @param originAirport airport object
     * @param destinationAirport airport object
     * @param maxConnections user specified limit number for connection
     * @param sortingMethod user specified algorithm for sorting itineraries
     */
    GetItinerary(Airport originAirport, Airport destinationAirport, int maxConnections, ItinerarySortingAlgorithm sortingMethod)
    {
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.maxConnections = maxConnections;
        this.sortingAlgorithm = sortingMethod;
    }

    /**
     * Execute the command.
     * @return success string if executed without error
     */
    @Override
    public String executeCommand()
    {
        return AFRS.getItinerary(originAirport, destinationAirport, maxConnections, sortingAlgorithm);
    }

    @Override
    public String undo() {
        return null;
    }

    @Override
    public String redo() {
        return null;
    }
}
