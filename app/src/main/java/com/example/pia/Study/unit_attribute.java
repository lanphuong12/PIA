package com.example.pia.Study;

public class unit_attribute {
    String ID, Unit, Name;
    public byte[] img;
    public unit_attribute(String id, String unit, String name, byte[] img){
        this.ID=id;
        this.Unit = unit;
        this.Name = name;
        this.img = img;
    }
    public unit_attribute( String id, String name, byte[] img){
        this.ID = id;
        this.Name = name;
        this.img = img;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
}
