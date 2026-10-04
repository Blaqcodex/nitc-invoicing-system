package co.za.neneit.invoicing;

import co.za.neneit.invoicing.model.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Acme Trading", "accounts@acme.co.za",
                                    "12 Example Street", "4123456789");
        System.out.println(client);
    }
}