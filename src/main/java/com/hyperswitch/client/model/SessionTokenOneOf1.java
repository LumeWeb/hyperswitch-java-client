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
import com.hyperswitch.client.model.SamsungPayAmountDetails;
import com.hyperswitch.client.model.SamsungPayMerchantPaymentInformation;
import com.hyperswitch.client.model.SamsungPayProtocolType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SessionTokenOneOf1
 */
@JsonPropertyOrder({
  SessionTokenOneOf1.JSON_PROPERTY_VERSION,
  SessionTokenOneOf1.JSON_PROPERTY_SERVICE_ID,
  SessionTokenOneOf1.JSON_PROPERTY_ORDER_NUMBER,
  SessionTokenOneOf1.JSON_PROPERTY_MERCHANT,
  SessionTokenOneOf1.JSON_PROPERTY_AMOUNT,
  SessionTokenOneOf1.JSON_PROPERTY_PROTOCOL,
  SessionTokenOneOf1.JSON_PROPERTY_ALLOWED_BRANDS,
  SessionTokenOneOf1.JSON_PROPERTY_WALLET_NAME
})
@JsonTypeName("SessionToken_oneOf_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class SessionTokenOneOf1 {
  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nonnull
  private String version;

  public static final String JSON_PROPERTY_SERVICE_ID = "service_id";
  @javax.annotation.Nonnull
  private String serviceId;

  public static final String JSON_PROPERTY_ORDER_NUMBER = "order_number";
  @javax.annotation.Nonnull
  private String orderNumber;

  public static final String JSON_PROPERTY_MERCHANT = "merchant";
  @javax.annotation.Nonnull
  private SamsungPayMerchantPaymentInformation merchant;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nonnull
  private SamsungPayAmountDetails amount;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  @javax.annotation.Nonnull
  private SamsungPayProtocolType protocol;

  public static final String JSON_PROPERTY_ALLOWED_BRANDS = "allowed_brands";
  @javax.annotation.Nonnull
  private List<String> allowedBrands = new ArrayList<>();

  /**
   * Gets or Sets walletName
   */
  public enum WalletNameEnum {
    SAMSUNG_PAY(String.valueOf("samsung_pay"));

    private String value;

    WalletNameEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WalletNameEnum fromValue(String value) {
      for (WalletNameEnum b : WalletNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WALLET_NAME = "wallet_name";
  @javax.annotation.Nonnull
  private WalletNameEnum walletName;

  public SessionTokenOneOf1() {
  }

  public SessionTokenOneOf1 version(@javax.annotation.Nonnull String version) {
    
    this.version = version;
    return this;
  }

  /**
   * Samsung Pay API version
   * @return version
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(@javax.annotation.Nonnull String version) {
    this.version = version;
  }

  public SessionTokenOneOf1 serviceId(@javax.annotation.Nonnull String serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Samsung Pay service ID to which session call needs to be made
   * @return serviceId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServiceId() {
    return serviceId;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiceId(@javax.annotation.Nonnull String serviceId) {
    this.serviceId = serviceId;
  }

  public SessionTokenOneOf1 orderNumber(@javax.annotation.Nonnull String orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

  /**
   * Order number of the transaction
   * @return orderNumber
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORDER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrderNumber() {
    return orderNumber;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderNumber(@javax.annotation.Nonnull String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public SessionTokenOneOf1 merchant(@javax.annotation.Nonnull SamsungPayMerchantPaymentInformation merchant) {
    
    this.merchant = merchant;
    return this;
  }

  /**
   * Get merchant
   * @return merchant
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SamsungPayMerchantPaymentInformation getMerchant() {
    return merchant;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchant(@javax.annotation.Nonnull SamsungPayMerchantPaymentInformation merchant) {
    this.merchant = merchant;
  }

  public SessionTokenOneOf1 amount(@javax.annotation.Nonnull SamsungPayAmountDetails amount) {
    
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SamsungPayAmountDetails getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(@javax.annotation.Nonnull SamsungPayAmountDetails amount) {
    this.amount = amount;
  }

  public SessionTokenOneOf1 protocol(@javax.annotation.Nonnull SamsungPayProtocolType protocol) {
    
    this.protocol = protocol;
    return this;
  }

  /**
   * Get protocol
   * @return protocol
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SamsungPayProtocolType getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProtocol(@javax.annotation.Nonnull SamsungPayProtocolType protocol) {
    this.protocol = protocol;
  }

  public SessionTokenOneOf1 allowedBrands(@javax.annotation.Nonnull List<String> allowedBrands) {
    
    this.allowedBrands = allowedBrands;
    return this;
  }

  public SessionTokenOneOf1 addAllowedBrandsItem(String allowedBrandsItem) {
    if (this.allowedBrands == null) {
      this.allowedBrands = new ArrayList<>();
    }
    this.allowedBrands.add(allowedBrandsItem);
    return this;
  }

  /**
   * List of supported card brands
   * @return allowedBrands
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALLOWED_BRANDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAllowedBrands() {
    return allowedBrands;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_BRANDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowedBrands(@javax.annotation.Nonnull List<String> allowedBrands) {
    this.allowedBrands = allowedBrands;
  }

  public SessionTokenOneOf1 walletName(@javax.annotation.Nonnull WalletNameEnum walletName) {
    
    this.walletName = walletName;
    return this;
  }

  /**
   * Get walletName
   * @return walletName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WALLET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WalletNameEnum getWalletName() {
    return walletName;
  }


  @JsonProperty(JSON_PROPERTY_WALLET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWalletName(@javax.annotation.Nonnull WalletNameEnum walletName) {
    this.walletName = walletName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionTokenOneOf1 sessionTokenOneOf1 = (SessionTokenOneOf1) o;
    return Objects.equals(this.version, sessionTokenOneOf1.version) &&
        Objects.equals(this.serviceId, sessionTokenOneOf1.serviceId) &&
        Objects.equals(this.orderNumber, sessionTokenOneOf1.orderNumber) &&
        Objects.equals(this.merchant, sessionTokenOneOf1.merchant) &&
        Objects.equals(this.amount, sessionTokenOneOf1.amount) &&
        Objects.equals(this.protocol, sessionTokenOneOf1.protocol) &&
        Objects.equals(this.allowedBrands, sessionTokenOneOf1.allowedBrands) &&
        Objects.equals(this.walletName, sessionTokenOneOf1.walletName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, serviceId, orderNumber, merchant, amount, protocol, allowedBrands, walletName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionTokenOneOf1 {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    allowedBrands: ").append(toIndentedString(allowedBrands)).append("\n");
    sb.append("    walletName: ").append(toIndentedString(walletName)).append("\n");
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `service_id` to the URL query string
    if (getServiceId() != null) {
      try {
        joiner.add(String.format("%sservice_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServiceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `order_number` to the URL query string
    if (getOrderNumber() != null) {
      try {
        joiner.add(String.format("%sorder_number%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrderNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchant` to the URL query string
    if (getMerchant() != null) {
      joiner.add(getMerchant().toUrlQueryString(prefix + "merchant" + suffix));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(getAmount().toUrlQueryString(prefix + "amount" + suffix));
    }

    // add `protocol` to the URL query string
    if (getProtocol() != null) {
      try {
        joiner.add(String.format("%sprotocol%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProtocol()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `allowed_brands` to the URL query string
    if (getAllowedBrands() != null) {
      for (int i = 0; i < getAllowedBrands().size(); i++) {
        try {
          joiner.add(String.format("%sallowed_brands%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getAllowedBrands().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `wallet_name` to the URL query string
    if (getWalletName() != null) {
      try {
        joiner.add(String.format("%swallet_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWalletName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

