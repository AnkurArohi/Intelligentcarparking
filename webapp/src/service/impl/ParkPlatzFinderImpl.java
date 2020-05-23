import java.util.List;

public class ParkPlatzFinderImpl implements ParkPlatzFinder {
    public ParkPlatzFinderImpl() {
    }

    @Override
    public List<String> getParkPlatz(String addr, int radius) {
        return null;
    }

    @Override
    public double getDistance(String addr1, String addr2) {
        //TODO Find if its required to calculate in realtime or
        //we want to read saved data from DB
        return 0;
    }
}
