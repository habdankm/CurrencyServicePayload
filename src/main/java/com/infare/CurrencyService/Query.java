package com.infare.CurrencyService;

import lombok.Data;

@Data
public class Query {

    private final String payload;
    private final float currency;

    public Query() {
        payload = "NONE";
        currency = -1.0f;
    }

    public Query(String payload, int currency) {
        this.payload = payload;
        this.currency = currency;
    }

}
