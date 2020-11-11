package com.mustafa.interfaces.services.carpet;

import com.mustafa.enums.City;
import com.mustafa.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetTX implements Carpet {

    private static final Map<City, BigDecimal> squarePriceForCity = new HashMap<>();

    static {
        squarePriceForCity.put(City.AUSTIN,new BigDecimal("1.42"));
        squarePriceForCity.put(City.DULLES,new BigDecimal("3.75"));
        squarePriceForCity.put(City.SAN_ANTONIO,new BigDecimal("9.74"));
    }

    @Override
    public BigDecimal getSqFtPrices(City city) {
        BigDecimal defaultValue = BigDecimal.ZERO;
        Optional<Map.Entry<City,BigDecimal>> collect = squarePriceForCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();


        return collect.isPresent() ? collect.get().getValue() : defaultValue;
    }
}
