package cw2.library;

public class Address {

    private String country;
    private String city;
    private String street;
    private int house;
    private int flat;

    public Address(String country, String city, String street, int house, int flat) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            throw new RuntimeException("Country must be specified.");
        }
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            throw new RuntimeException("City must be specified.");
        }
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street == null || street.isEmpty()) {
            throw new RuntimeException("Street name must be specified.");
        }
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        if (house <= 0) {
            throw new RuntimeException("House no cannot be a negative value.");
        }
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        if (flat <= 0) {
            throw new RuntimeException("Flat no cannot be a negative value.");
        }
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", flat=" + flat +
                '}';
    }
}
