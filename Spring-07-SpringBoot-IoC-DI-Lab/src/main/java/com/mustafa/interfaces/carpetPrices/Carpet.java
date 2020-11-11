package com.mustafa.interfaces.carpetPrices;

import com.mustafa.enums.City;

import java.math.BigDecimal;

public interface Carpet {

    BigDecimal getSqFtPrices(City city);
}
