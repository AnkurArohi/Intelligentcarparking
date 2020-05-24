import java.util.Map;

public interface ProbabilityFinder{

    Map<String, Strasse> getProbability(Map<String, Strasse> strasseMap, Integer seconds);

}
