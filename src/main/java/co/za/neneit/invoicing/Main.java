package co.za.neneit.invoicing;

import java.math.BigDecimal;
import co.za.neneit.invoicing.model.Client;
import co.za.neneit.invoicing.model.Service;
import co.za.neneit.invoicing.model.ServiceType;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Acme Trading", "accounts@acme.co.za",
                                    "12 Example Street", "4123456789");
        System.out.println(client);

        Service consulting = new Service("IT Consulting", ServiceType.HOURLY,
                                          new BigDecimal("850.00"));
        System.out.println(consulting);
    }
}