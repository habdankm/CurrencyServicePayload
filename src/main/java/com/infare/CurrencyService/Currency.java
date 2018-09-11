package com.infare.CurrencyService;

import lombok.Data;

@Data
public class Currency {

  private final float price;
  private final String payload;

  public Currency(float price, String payload) {
    this.price = price;
    this.payload = payload;
  }

  }
