import java.util.List;

//INFO TO uniquely identify a place both PLZ and the strasse name are required

public interface ParkPlatzFinder{

    Map<Str, Strasse> getParkPlatz(Strasse dest, Double radius);

}
