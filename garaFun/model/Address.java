package controler;

public class Address {
    private String streetName;
    private String districName;

    public Address() {
    }

    public Address(String streetName, String districName) {
        this.streetName = streetName;
        this.districName = districName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getDistricName() {
        return districName;
    }

    public void setDistricName(String districName) {
        this.districName = districName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", districName='" + districName + '\'' +
                '}';
    }
}
