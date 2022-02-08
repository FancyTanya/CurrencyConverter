package com.github.fancy.exchange.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class ExchangeValue {

    @Id
    private Long id;

    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;

    private BigDecimal conversion;
    private int port;

    public ExchangeValue() {}

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConversion() {
        return conversion;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ExchangeValue(Long id, String from, String to, BigDecimal conversion) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversion = conversion;
    }
}
