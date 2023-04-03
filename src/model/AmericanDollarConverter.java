package model;

import enums.Currency;

import java.math.BigDecimal;

public class AmericanDollarConverter extends CurrencyConverter {

  @Override
  public BigDecimal convertToCurrency(Currency currency, BigDecimal COPValue) {
    currency = Currency.AMERICAN_DOLLAR;
    return super.convertToCurrency(currency, COPValue);
  }
  @Override
  public BigDecimal convertToCOP(Currency currency, BigDecimal currencyValue) {
    currency = Currency.AMERICAN_DOLLAR;
    return super.convertToCOP(currency, currencyValue);
  }
}
