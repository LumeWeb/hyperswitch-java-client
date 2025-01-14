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
import com.hyperswitch.client.model.AdditionalMerchantDataOneOf;
import com.hyperswitch.client.model.MerchantRecipientData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AdditionalMerchantData
 */
@JsonPropertyOrder({
  AdditionalMerchantData.JSON_PROPERTY_OPEN_BANKING_RECIPIENT_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdditionalMerchantData {
  public static final String JSON_PROPERTY_OPEN_BANKING_RECIPIENT_DATA = "open_banking_recipient_data";
  private MerchantRecipientData openBankingRecipientData;

  public AdditionalMerchantData() {
  }

  public AdditionalMerchantData openBankingRecipientData(MerchantRecipientData openBankingRecipientData) {
    
    this.openBankingRecipientData = openBankingRecipientData;
    return this;
  }

   /**
   * Get openBankingRecipientData
   * @return openBankingRecipientData
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPEN_BANKING_RECIPIENT_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MerchantRecipientData getOpenBankingRecipientData() {
    return openBankingRecipientData;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_BANKING_RECIPIENT_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOpenBankingRecipientData(MerchantRecipientData openBankingRecipientData) {
    this.openBankingRecipientData = openBankingRecipientData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalMerchantData additionalMerchantData = (AdditionalMerchantData) o;
    return Objects.equals(this.openBankingRecipientData, additionalMerchantData.openBankingRecipientData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openBankingRecipientData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalMerchantData {\n");
    sb.append("    openBankingRecipientData: ").append(toIndentedString(openBankingRecipientData)).append("\n");
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

    // add `open_banking_recipient_data` to the URL query string
    if (getOpenBankingRecipientData() != null) {
      joiner.add(getOpenBankingRecipientData().toUrlQueryString(prefix + "open_banking_recipient_data" + suffix));
    }

    return joiner.toString();
  }

}

