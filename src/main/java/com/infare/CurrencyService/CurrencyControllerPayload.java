package com.infare.CurrencyService;;

import org.springframework.web.bind.annotation.*;

@RestController
public class CurrencyControllerPayload {

    //curl -XGET 'http://localhost:9999/currency?price=123.45'
    @RequestMapping("/currency")
    public Currency calculateCurrency(@RequestParam(value="price", defaultValue="0") String price) {
        try {
            Float priceF = Float.parseFloat(price);
            return new Currency(priceF*2, "");
        } catch (Exception ex) {
            System.out.println("incorrect input");
        }
        return new Currency(0F, "");
    }

    //curl --data-binary '@src/main/resources/request.json' -XPOST http://localhost:9999/currency_payload -H 'Content-type:application/json'
    @PostMapping("/currency_payload")
    public Currency calculateCurrencyWithPayload(@RequestBody Query query) {
        try {
            if (query.getPayload().length() == 1048576) {
                String reverse = new StringBuilder(query.getPayload()).reverse().toString();
                return new Currency(query.getCurrency()*2, reverse);//new Currency();
            }
        } catch (Exception ex) {
            System.out.println("incorrect input");
        }
        return new Currency(0F, "");
    }
}