package co.za.neneit.invoicing.model;

import java.math.BigDecimal;

public class Service {

    private final String description;
    private final ServiceType type;
    private final BigDecimal rate;

    public Service(String description, ServiceType type, BigDecimal rate) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Service description is required");
        }
        if (rate == null || rate.signum() < 0) {
            throw new IllegalArgumentException("Rate must be zero or positive");
        }
        this.description = description;
        this.type = type;
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public ServiceType getType() {
        return type;
    }

    public BigDecimal getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return description + " (" + type + ") @ " + rate;
    }
}