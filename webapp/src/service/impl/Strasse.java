// this is the class that creates an abstraction for addresses - source/destination

public class Strasse {

    public Strasse() {
        // require name and PLZ to construct it
    }

    public String getAddr() {
        return name;
    }

    public void setAddr(String addr) {
        this.name = addr;
    }

    private String name;

    private String addr;

    private Double probability;
}
