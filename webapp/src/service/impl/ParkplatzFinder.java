import java.util.List;
//INFO TO uniquely identify a place both PLZ and the straße name are required
public interface ParkPlatzFinder{

    List<Strasse> getParkPlatz(String addr,int radius);
    double getDistance(Strasse addr1, Strasse addr2);
}
