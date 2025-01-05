/*
 * Hyperswitch - API Documentation
 *  ## Get started  Hyperswitch provides a collection of APIs that enable you to process and manage payments. Our APIs accept and return JSON in the HTTP body, and return standard HTTP response codes.  You can consume the APIs directly using your favorite HTTP/REST library.  We have a testing environment referred to \"sandbox\", which you can setup to test API calls without affecting production data. Currently, our sandbox environment is live while our production environment is under development and will be available soon. You can sign up on our Dashboard to get API keys to access Hyperswitch API.  ### Environment  Use the following base URLs when making requests to the APIs:  | Environment   |  Base URL                          | |---------------|------------------------------------| | Sandbox       | <https://sandbox.hyperswitch.io>   | | Production    | <https://api.hyperswitch.io>       |  ## Authentication  When you sign up on our [dashboard](https://app.hyperswitch.io) and create a merchant account, you are given a secret key (also referred as api-key) and a publishable key. You may authenticate all API requests with Hyperswitch server by providing the appropriate key in the request Authorization header.  | Key             |  Description                                                                                  | |-----------------|-----------------------------------------------------------------------------------------------| | api-key         | Private key. Used to authenticate all API requests from your merchant server                  | | publishable key | Unique identifier for your account. Used to authenticate API requests from your app's client  |  Never share your secret api keys. Keep them guarded and secure. 
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: hyperswitch@juspay.in
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hyperswitch.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.model.Currency;
import com.hyperswitch.model.SurchargeCalculationOverride;
import com.hyperswitch.model.TaxCalculationOverride;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AmountDetails
 */
@JsonPropertyOrder({
  AmountDetails.JSON_PROPERTY_ORDER_AMOUNT,
  AmountDetails.JSON_PROPERTY_CURRENCY,
  AmountDetails.JSON_PROPERTY_SHIPPING_COST,
  AmountDetails.JSON_PROPERTY_ORDER_TAX_AMOUNT,
  AmountDetails.JSON_PROPERTY_SKIP_EXTERNAL_TAX_CALCULATION,
  AmountDetails.JSON_PROPERTY_SKIP_SURCHARGE_CALCULATION,
  AmountDetails.JSON_PROPERTY_SURCHARGE_AMOUNT,
  AmountDetails.JSON_PROPERTY_TAX_ON_SURCHARGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AmountDetails {
  public static final String JSON_PROPERTY_ORDER_AMOUNT = "order_amount";
  private Long orderAmount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_SHIPPING_COST = "shipping_cost";
  private JsonNullable<Long> shippingCost = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ORDER_TAX_AMOUNT = "order_tax_amount";
  private JsonNullable<Long> orderTaxAmount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SKIP_EXTERNAL_TAX_CALCULATION = "skip_external_tax_calculation";
  private TaxCalculationOverride skipExternalTaxCalculation;

  public static final String JSON_PROPERTY_SKIP_SURCHARGE_CALCULATION = "skip_surcharge_calculation";
  private SurchargeCalculationOverride skipSurchargeCalculation;

  public static final String JSON_PROPERTY_SURCHARGE_AMOUNT = "surcharge_amount";
  private JsonNullable<Long> surchargeAmount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_TAX_ON_SURCHARGE = "tax_on_surcharge";
  private JsonNullable<Long> taxOnSurcharge = JsonNullable.<Long>undefined();

  public AmountDetails() {
  }

  public AmountDetails orderAmount(Long orderAmount) {
    
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * The payment amount. Amount for the payment in the lowest denomination of the currency, (i.e) in cents for USD denomination, in yen for JPY denomination etc. E.g., Pass 100 to charge $1.00 and 1 for 1¥ since ¥ is a zero-decimal currency. Read more about [the Decimal and Non-Decimal Currencies](https://github.com/juspay/hyperswitch/wiki/Decimal-and-Non%E2%80%90Decimal-Currencies)
   * minimum: 0
   * @return orderAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOrderAmount() {
    return orderAmount;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderAmount(Long orderAmount) {
    this.orderAmount = orderAmount;
  }


  public AmountDetails currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Currency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public AmountDetails shippingCost(Long shippingCost) {
    this.shippingCost = JsonNullable.<Long>of(shippingCost);
    
    return this;
  }

   /**
   * This Unit struct represents MinorUnit in which core amount works
   * @return shippingCost
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getShippingCost() {
        return shippingCost.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHIPPING_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getShippingCost_JsonNullable() {
    return shippingCost;
  }
  
  @JsonProperty(JSON_PROPERTY_SHIPPING_COST)
  public void setShippingCost_JsonNullable(JsonNullable<Long> shippingCost) {
    this.shippingCost = shippingCost;
  }

  public void setShippingCost(Long shippingCost) {
    this.shippingCost = JsonNullable.<Long>of(shippingCost);
  }


  public AmountDetails orderTaxAmount(Long orderTaxAmount) {
    this.orderTaxAmount = JsonNullable.<Long>of(orderTaxAmount);
    
    return this;
  }

   /**
   * This Unit struct represents MinorUnit in which core amount works
   * @return orderTaxAmount
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getOrderTaxAmount() {
        return orderTaxAmount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORDER_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getOrderTaxAmount_JsonNullable() {
    return orderTaxAmount;
  }
  
  @JsonProperty(JSON_PROPERTY_ORDER_TAX_AMOUNT)
  public void setOrderTaxAmount_JsonNullable(JsonNullable<Long> orderTaxAmount) {
    this.orderTaxAmount = orderTaxAmount;
  }

  public void setOrderTaxAmount(Long orderTaxAmount) {
    this.orderTaxAmount = JsonNullable.<Long>of(orderTaxAmount);
  }


  public AmountDetails skipExternalTaxCalculation(TaxCalculationOverride skipExternalTaxCalculation) {
    
    this.skipExternalTaxCalculation = skipExternalTaxCalculation;
    return this;
  }

   /**
   * Get skipExternalTaxCalculation
   * @return skipExternalTaxCalculation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKIP_EXTERNAL_TAX_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaxCalculationOverride getSkipExternalTaxCalculation() {
    return skipExternalTaxCalculation;
  }


  @JsonProperty(JSON_PROPERTY_SKIP_EXTERNAL_TAX_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkipExternalTaxCalculation(TaxCalculationOverride skipExternalTaxCalculation) {
    this.skipExternalTaxCalculation = skipExternalTaxCalculation;
  }


  public AmountDetails skipSurchargeCalculation(SurchargeCalculationOverride skipSurchargeCalculation) {
    
    this.skipSurchargeCalculation = skipSurchargeCalculation;
    return this;
  }

   /**
   * Get skipSurchargeCalculation
   * @return skipSurchargeCalculation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKIP_SURCHARGE_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SurchargeCalculationOverride getSkipSurchargeCalculation() {
    return skipSurchargeCalculation;
  }


  @JsonProperty(JSON_PROPERTY_SKIP_SURCHARGE_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkipSurchargeCalculation(SurchargeCalculationOverride skipSurchargeCalculation) {
    this.skipSurchargeCalculation = skipSurchargeCalculation;
  }


  public AmountDetails surchargeAmount(Long surchargeAmount) {
    this.surchargeAmount = JsonNullable.<Long>of(surchargeAmount);
    
    return this;
  }

   /**
   * This Unit struct represents MinorUnit in which core amount works
   * @return surchargeAmount
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getSurchargeAmount() {
        return surchargeAmount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SURCHARGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getSurchargeAmount_JsonNullable() {
    return surchargeAmount;
  }
  
  @JsonProperty(JSON_PROPERTY_SURCHARGE_AMOUNT)
  public void setSurchargeAmount_JsonNullable(JsonNullable<Long> surchargeAmount) {
    this.surchargeAmount = surchargeAmount;
  }

  public void setSurchargeAmount(Long surchargeAmount) {
    this.surchargeAmount = JsonNullable.<Long>of(surchargeAmount);
  }


  public AmountDetails taxOnSurcharge(Long taxOnSurcharge) {
    this.taxOnSurcharge = JsonNullable.<Long>of(taxOnSurcharge);
    
    return this;
  }

   /**
   * This Unit struct represents MinorUnit in which core amount works
   * @return taxOnSurcharge
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getTaxOnSurcharge() {
        return taxOnSurcharge.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAX_ON_SURCHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getTaxOnSurcharge_JsonNullable() {
    return taxOnSurcharge;
  }
  
  @JsonProperty(JSON_PROPERTY_TAX_ON_SURCHARGE)
  public void setTaxOnSurcharge_JsonNullable(JsonNullable<Long> taxOnSurcharge) {
    this.taxOnSurcharge = taxOnSurcharge;
  }

  public void setTaxOnSurcharge(Long taxOnSurcharge) {
    this.taxOnSurcharge = JsonNullable.<Long>of(taxOnSurcharge);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmountDetails amountDetails = (AmountDetails) o;
    return Objects.equals(this.orderAmount, amountDetails.orderAmount) &&
        Objects.equals(this.currency, amountDetails.currency) &&
        equalsNullable(this.shippingCost, amountDetails.shippingCost) &&
        equalsNullable(this.orderTaxAmount, amountDetails.orderTaxAmount) &&
        Objects.equals(this.skipExternalTaxCalculation, amountDetails.skipExternalTaxCalculation) &&
        Objects.equals(this.skipSurchargeCalculation, amountDetails.skipSurchargeCalculation) &&
        equalsNullable(this.surchargeAmount, amountDetails.surchargeAmount) &&
        equalsNullable(this.taxOnSurcharge, amountDetails.taxOnSurcharge);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderAmount, currency, hashCodeNullable(shippingCost), hashCodeNullable(orderTaxAmount), skipExternalTaxCalculation, skipSurchargeCalculation, hashCodeNullable(surchargeAmount), hashCodeNullable(taxOnSurcharge));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountDetails {\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
    sb.append("    orderTaxAmount: ").append(toIndentedString(orderTaxAmount)).append("\n");
    sb.append("    skipExternalTaxCalculation: ").append(toIndentedString(skipExternalTaxCalculation)).append("\n");
    sb.append("    skipSurchargeCalculation: ").append(toIndentedString(skipSurchargeCalculation)).append("\n");
    sb.append("    surchargeAmount: ").append(toIndentedString(surchargeAmount)).append("\n");
    sb.append("    taxOnSurcharge: ").append(toIndentedString(taxOnSurcharge)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

