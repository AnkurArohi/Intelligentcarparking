// this is the class that creates an abstraction for addresses - source/destination

public class Strasse {

    private String name;// e.g. 26121Sophienstr
    private String addr;// e.g. Exact string like sophienstr.
    private Integer plz;// e.g. 22453

    public Strasse(String addr,Integer plz) {
        // require name and PLZ to construct it
        this.addr = addr;
        this.plz = plz;
        this.setName();
    }

    public String getName() {
        return this.name;
    }

    public Integer getPlz(){
        return this.plz;
    }

    public String getAddr() {
        return this.addr;
    }

    private void setName(){
       this.name = this.plz+this.addr;
    }

}
