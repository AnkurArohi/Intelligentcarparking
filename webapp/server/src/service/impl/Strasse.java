// this is the class that creates an abstraction for addresses - source/destination

public class Strasse {

    private String name;//26121Sophienstr
    private String addr;//Exact string like sophienstr.

    public Strasse(String name,int plz) {
        // require name and PLZ to construct it
        this.addr=name;
        this.name=plz+name;//unique identifier
    }

    public String getName() {
        return name;
    }

    public String getAddr() { return addr; }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setName(String name,int plz) { this.name = plz+name;}

}
