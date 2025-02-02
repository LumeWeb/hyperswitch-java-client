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


package com.hyperswitch.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.client.model.SurchargePercentage;
import com.hyperswitch.client.model.SurchargeResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SurchargeDetailsResponse
 */
@JsonPropertyOrder({
  SurchargeDetailsResponse.JSON_PROPERTY_SURCHARGE,
  SurchargeDetailsResponse.JSON_PROPERTY_TAX_ON_SURCHARGE,
  SurchargeDetailsResponse.JSON_PROPERTY_DISPLAY_SURCHARGE_AMOUNT,
  SurchargeDetailsResponse.JSON_PROPERTY_DISPLAY_TAX_ON_SURCHARGE_AMOUNT,
  SurchargeDetailsResponse.JSON_PROPERTY_DISPLAY_TOTAL_SURCHARGE_AMOUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class SurchargeDetailsResponse {
  public static final String JSON_PROPERTY_SURCHARGE = "surcharge";
  @javax.annotation.Nonnull
  private SurchargeResponse surcharge;

  public static final String JSON_PROPERTY_TAX_ON_SURCHARGE = "tax_on_surcharge";
  @javax.annotation.Nullable
  private JsonNullable<SurchargePercentage> taxOnSurcharge = JsonNullable.<SurchargePercentage>undefined();

  public static final String JSON_PROPERTY_DISPLAY_SURCHARGE_AMOUNT = "display_surcharge_amount";
  @javax.annotation.Nonnull
  private Double displaySurchargeAmount;

  public static final String JSON_PROPERTY_DISPLAY_TAX_ON_SURCHARGE_AMOUNT = "display_tax_on_surcharge_amount";
  @javax.annotation.Nonnull
  private Double displayTaxOnSurchargeAmount;

  public static final String JSON_PROPERTY_DISPLAY_TOTAL_SURCHARGE_AMOUNT = "display_total_surcharge_amount";
  @javax.annotation.Nonnull
  private Double displayTotalSurchargeAmount;

  public SurchargeDetailsResponse() {
  }

  public SurchargeDetailsResponse surcharge(@javax.annotation.Nonnull SurchargeResponse surcharge) {
    
    this.surcharge = surcharge;
    return this;
  }

  /**
   * Get surcharge
   * @return surcharge
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SURCHARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SurchargeResponse getSurcharge() {
    return surcharge;
  }


  @JsonProperty(JSON_PROPERTY_SURCHARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSurcharge(@javax.annotation.Nonnull SurchargeResponse surcharge) {
    this.surcharge = surcharge;
  }

  public SurchargeDetailsResponse taxOnSurcharge(@javax.annotation.Nullable SurchargePercentage taxOnSurcharge) {
    this.taxOnSurcharge = JsonNullable.<SurchargePercentage>of(taxOnSurcharge);
    
    return this;
  }

  /**
   * Get taxOnSurcharge
   * @return taxOnSurcharge
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public SurchargePercentage getTaxOnSurcharge() {
        return taxOnSurcharge.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAX_ON_SURCHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SurchargePercentage> getTaxOnSurcharge_JsonNullable() {
    return taxOnSurcharge;
  }
  
  @JsonProperty(JSON_PROPERTY_TAX_ON_SURCHARGE)
  public void setTaxOnSurcharge_JsonNullable(JsonNullable<SurchargePercentage> taxOnSurcharge) {
    this.taxOnSurcharge = taxOnSurcharge;
  }

  public void setTaxOnSurcharge(@javax.annotation.Nullable SurchargePercentage taxOnSurcharge) {
    this.taxOnSurcharge = JsonNullable.<SurchargePercentage>of(taxOnSurcharge);
  }

  public SurchargeDetailsResponse displaySurchargeAmount(@javax.annotation.Nonnull Double displaySurchargeAmount) {
    
    this.displaySurchargeAmount = displaySurchargeAmount;
    return this;
  }

  /**
   * surcharge amount for this payment
   * @return displaySurchargeAmount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPLAY_SURCHARGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getDisplaySurchargeAmount() {
    return displaySurchargeAmount;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_SURCHARGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplaySurchargeAmount(@javax.annotation.Nonnull Double displaySurchargeAmount) {
    this.displaySurchargeAmount = displaySurchargeAmount;
  }

  public SurchargeDetailsResponse displayTaxOnSurchargeAmount(@javax.annotation.Nonnull Double displayTaxOnSurchargeAmount) {
    
    this.displayTaxOnSurchargeAmount = displayTaxOnSurchargeAmount;
    return this;
  }

  /**
   * tax on surcharge amount for this payment
   * @return displayTaxOnSurchargeAmount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPLAY_TAX_ON_SURCHARGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getDisplayTaxOnSurchargeAmount() {
    return displayTaxOnSurchargeAmount;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_TAX_ON_SURCHARGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplayTaxOnSurchargeAmount(@javax.annotation.Nonnull Double displayTaxOnSurchargeAmount) {
    this.displayTaxOnSurchargeAmount = displayTaxOnSurchargeAmount;
  }

  public SurchargeDetailsResponse displayTotalSurchargeAmount(@javax.annotation.Nonnull Double displayTotalSurchargeAmount) {
    
    this.displayTotalSurchargeAmount = displayTotalSurchargeAmount;
    return this;
  }

  /**
   * sum of display_surcharge_amount and display_tax_on_surcharge_amount
   * @return displayTotalSurchargeAmount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPLAY_TOTAL_SURCHARGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getDisplayTotalSurchargeAmount() {
    return displayTotalSurchargeAmount;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_TOTAL_SURCHARGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplayTotalSurchargeAmount(@javax.annotation.Nonnull Double displayTotalSurchargeAmount) {
    this.displayTotalSurchargeAmount = displayTotalSurchargeAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurchargeDetailsResponse surchargeDetailsResponse = (SurchargeDetailsResponse) o;
    return Objects.equals(this.surcharge, surchargeDetailsResponse.surcharge) &&
        equalsNullable(this.taxOnSurcharge, surchargeDetailsResponse.taxOnSurcharge) &&
        Objects.equals(this.displaySurchargeAmount, surchargeDetailsResponse.displaySurchargeAmount) &&
        Objects.equals(this.displayTaxOnSurchargeAmount, surchargeDetailsResponse.displayTaxOnSurchargeAmount) &&
        Objects.equals(this.displayTotalSurchargeAmount, surchargeDetailsResponse.displayTotalSurchargeAmount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(surcharge, hashCodeNullable(taxOnSurcharge), displaySurchargeAmount, displayTaxOnSurchargeAmount, displayTotalSurchargeAmount);
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
    sb.append("class SurchargeDetailsResponse {\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    taxOnSurcharge: ").append(toIndentedString(taxOnSurcharge)).append("\n");
    sb.append("    displaySurchargeAmount: ").append(toIndentedString(displaySurchargeAmount)).append("\n");
    sb.append("    displayTaxOnSurchargeAmount: ").append(toIndentedString(displayTaxOnSurchargeAmount)).append("\n");
    sb.append("    displayTotalSurchargeAmount: ").append(toIndentedString(displayTotalSurchargeAmount)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `surcharge` to the URL query string
    if (getSurcharge() != null) {
      joiner.add(getSurcharge().toUrlQueryString(prefix + "surcharge" + suffix));
    }

    // add `tax_on_surcharge` to the URL query string
    if (getTaxOnSurcharge() != null) {
      joiner.add(getTaxOnSurcharge().toUrlQueryString(prefix + "tax_on_surcharge" + suffix));
    }

    // add `display_surcharge_amount` to the URL query string
    if (getDisplaySurchargeAmount() != null) {
      try {
        joiner.add(String.format("%sdisplay_surcharge_amount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisplaySurchargeAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `display_tax_on_surcharge_amount` to the URL query string
    if (getDisplayTaxOnSurchargeAmount() != null) {
      try {
        joiner.add(String.format("%sdisplay_tax_on_surcharge_amount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisplayTaxOnSurchargeAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `display_total_surcharge_amount` to the URL query string
    if (getDisplayTotalSurchargeAmount() != null) {
      try {
        joiner.add(String.format("%sdisplay_total_surcharge_amount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisplayTotalSurchargeAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

