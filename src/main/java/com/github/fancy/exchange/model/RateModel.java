package com.github.fancy.exchange.model;

import lombok.Getter;

import java.time.OffsetDateTime;

@Getter
public class RateModel {
    private OffsetDateTime date;
    private String base;
    private String rates;
}
