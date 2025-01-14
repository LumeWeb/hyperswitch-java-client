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
import com.hyperswitch.client.model.MerchantAccountData;
import com.hyperswitch.client.model.MerchantRecipientDataOneOf;
import com.hyperswitch.client.model.MerchantRecipientDataOneOf1;
import com.hyperswitch.client.model.MerchantRecipientDataOneOf2;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * MerchantRecipientData
 */
@JsonPropertyOrder({
  MerchantRecipientData.JSON_PROPERTY_CONNECTOR_RECIPIENT_ID,
  MerchantRecipientData.JSON_PROPERTY_WALLET_ID,
  MerchantRecipientData.JSON_PROPERTY_ACCOUNT_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantRecipientData {
  public static final String JSON_PROPERTY_CONNECTOR_RECIPIENT_ID = "connector_recipient_id";
  private String connectorRecipientId;

  public static final String JSON_PROPERTY_WALLET_ID = "wallet_id";
  private String walletId;

  public static final String JSON_PROPERTY_ACCOUNT_DATA = "account_data";
  private MerchantAccountData accountData;

  public MerchantRecipientData() {
  }

  public MerchantRecipientData connectorRecipientId(String connectorRecipientId) {
    
    this.connectorRecipientId = connectorRecipientId;
    return this;
  }

   /**
   * Get connectorRecipientId
   * @return connectorRecipientId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTOR_RECIPIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnectorRecipientId() {
    return connectorRecipientId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_RECIPIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectorRecipientId(String connectorRecipientId) {
    this.connectorRecipientId = connectorRecipientId;
  }


  public MerchantRecipientData walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * Get walletId
   * @return walletId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WALLET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWalletId() {
    return walletId;
  }


  @JsonProperty(JSON_PROPERTY_WALLET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  public MerchantRecipientData accountData(MerchantAccountData accountData) {
    
    this.accountData = accountData;
    return this;
  }

   /**
   * Get accountData
   * @return accountData
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MerchantAccountData getAccountData() {
    return accountData;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountData(MerchantAccountData accountData) {
    this.accountData = accountData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantRecipientData merchantRecipientData = (MerchantRecipientData) o;
    return Objects.equals(this.connectorRecipientId, merchantRecipientData.connectorRecipientId) &&
        Objects.equals(this.walletId, merchantRecipientData.walletId) &&
        Objects.equals(this.accountData, merchantRecipientData.accountData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectorRecipientId, walletId, accountData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantRecipientData {\n");
    sb.append("    connectorRecipientId: ").append(toIndentedString(connectorRecipientId)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    accountData: ").append(toIndentedString(accountData)).append("\n");
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

    // add `connector_recipient_id` to the URL query string
    if (getConnectorRecipientId() != null) {
      try {
        joiner.add(String.format("%sconnector_recipient_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConnectorRecipientId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `wallet_id` to the URL query string
    if (getWalletId() != null) {
      try {
        joiner.add(String.format("%swallet_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWalletId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `account_data` to the URL query string
    if (getAccountData() != null) {
      joiner.add(getAccountData().toUrlQueryString(prefix + "account_data" + suffix));
    }

    return joiner.toString();
  }

}

