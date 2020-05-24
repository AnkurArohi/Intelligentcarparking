import java.util.Map;

public interface ProbabilityFinder{

    Map<String, Parkplatz> getProbability(Map<String, Parkplatz> strasseMap, Integer seconds);

}
