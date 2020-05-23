import java.util.List;
//INFO TO uniquely identify a place both PLZ and the straße name are required
public interface ParkPlatzFinder{

    List<String> getParkPlatz(String addr,int radius);
    double getDistance(String addr1, String addr2);
}
