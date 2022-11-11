package giaodien;

public class NhapKho {
    private String ID, name;
    private int unit;

    public NhapKho(String ID, String name, int unit) {
        this.ID = ID;
        this.name = name;
        this.unit = unit;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }
    
    
}
