package co.za.neneit.invoicing.model;

public class Client {

    private final String name;
    private final String email;
    private final String address;
    private final String taxNumber;

    public Client(String name, String email, String address, String taxNumber) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Client name is required");
        }
        this.name = name;
        this.email = email;
        this.address = address;
        this.taxNumber = taxNumber;
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    @Override
    public String toString() {
        return name + " <" + email + ">";
    }
}