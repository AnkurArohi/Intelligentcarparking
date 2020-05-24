import java.util.Map;
public interface ParkPlatzFinder {
//INFO TO uniquely identify a place both PLZ and the strasse name are required
    Map<String, Parkplatz> getParkPlatz(Strasse dest, Double radius);
}
