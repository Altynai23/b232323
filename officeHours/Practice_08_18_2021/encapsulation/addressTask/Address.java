package Practice_08_18_2021.encapsulation.addressTask;

public class Address {

    private String street, city, state, zipCode;
    private final static String country = "USA";

    public Address() {
    }
    // DRY :DON'T REPEAT YOURSELF
    public Address(String street, String city, String state, String zipCode) {
        setStreet(street);
        this.city = city;
        this.state = state;
        setZipCode(zipCode);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street.isEmpty() || street.length() > 50) {
            System.out.println("ERROR : Invalid Street name");
            return; // exit the method
        }
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        if (zipCode.length() != 5) {
            System.out.println("ERROR: Invalid zipCode");

        } else {

            this.zipCode = zipCode;
        }
    }

    public static String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

}
