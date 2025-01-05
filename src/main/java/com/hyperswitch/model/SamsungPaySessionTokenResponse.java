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
import com.hyperswitch.model.SamsungPayAmountDetails;
import com.hyperswitch.model.SamsungPayMerchantPaymentInformation;
import com.hyperswitch.model.SamsungPayProtocolType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SamsungPaySessionTokenResponse
 */
@JsonPropertyOrder({
  SamsungPaySessionTokenResponse.JSON_PROPERTY_VERSION,
  SamsungPaySessionTokenResponse.JSON_PROPERTY_SERVICE_ID,
  SamsungPaySessionTokenResponse.JSON_PROPERTY_ORDER_NUMBER,
  SamsungPaySessionTokenResponse.JSON_PROPERTY_MERCHANT,
  SamsungPaySessionTokenResponse.JSON_PROPERTY_AMOUNT,
  SamsungPaySessionTokenResponse.JSON_PROPERTY_PROTOCOL,
  SamsungPaySessionTokenResponse.JSON_PROPERTY_ALLOWED_BRANDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SamsungPaySessionTokenResponse {
  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_SERVICE_ID = "service_id";
  private String serviceId;

  public static final String JSON_PROPERTY_ORDER_NUMBER = "order_number";
  private String orderNumber;

  public static final String JSON_PROPERTY_MERCHANT = "merchant";
  private SamsungPayMerchantPaymentInformation merchant;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private SamsungPayAmountDetails amount;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private SamsungPayProtocolType protocol;

  public static final String JSON_PROPERTY_ALLOWED_BRANDS = "allowed_brands";
  private List<String> allowedBrands = new ArrayList<>();

  public SamsungPaySessionTokenResponse() { 
  }

  public SamsungPaySessionTokenResponse version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Samsung Pay API version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Samsung Pay API version")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(String version) {
    this.version = version;
  }


  public SamsungPaySessionTokenResponse serviceId(String serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Samsung Pay service ID to which session call needs to be made
   * @return serviceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Samsung Pay service ID to which session call needs to be made")
  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServiceId() {
    return serviceId;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  public SamsungPaySessionTokenResponse orderNumber(String orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Order number of the transaction
   * @return orderNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Order number of the transaction")
  @JsonProperty(JSON_PROPERTY_ORDER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrderNumber() {
    return orderNumber;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public SamsungPaySessionTokenResponse merchant(SamsungPayMerchantPaymentInformation merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MERCHANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SamsungPayMerchantPaymentInformation getMerchant() {
    return merchant;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchant(SamsungPayMerchantPaymentInformation merchant) {
    this.merchant = merchant;
  }


  public SamsungPaySessionTokenResponse amount(SamsungPayAmountDetails amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SamsungPayAmountDetails getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(SamsungPayAmountDetails amount) {
    this.amount = amount;
  }


  public SamsungPaySessionTokenResponse protocol(SamsungPayProtocolType protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SamsungPayProtocolType getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProtocol(SamsungPayProtocolType protocol) {
    this.protocol = protocol;
  }


  public SamsungPaySessionTokenResponse allowedBrands(List<String> allowedBrands) {
    
    this.allowedBrands = allowedBrands;
    return this;
  }

  public SamsungPaySessionTokenResponse addAllowedBrandsItem(String allowedBrandsItem) {
    this.allowedBrands.add(allowedBrandsItem);
    return this;
  }

   /**
   * List of supported card brands
   * @return allowedBrands
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of supported card brands")
  @JsonProperty(JSON_PROPERTY_ALLOWED_BRANDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAllowedBrands() {
    return allowedBrands;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_BRANDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowedBrands(List<String> allowedBrands) {
    this.allowedBrands = allowedBrands;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamsungPaySessionTokenResponse samsungPaySessionTokenResponse = (SamsungPaySessionTokenResponse) o;
    return Objects.equals(this.version, samsungPaySessionTokenResponse.version) &&
        Objects.equals(this.serviceId, samsungPaySessionTokenResponse.serviceId) &&
        Objects.equals(this.orderNumber, samsungPaySessionTokenResponse.orderNumber) &&
        Objects.equals(this.merchant, samsungPaySessionTokenResponse.merchant) &&
        Objects.equals(this.amount, samsungPaySessionTokenResponse.amount) &&
        Objects.equals(this.protocol, samsungPaySessionTokenResponse.protocol) &&
        Objects.equals(this.allowedBrands, samsungPaySessionTokenResponse.allowedBrands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, serviceId, orderNumber, merchant, amount, protocol, allowedBrands);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamsungPaySessionTokenResponse {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    allowedBrands: ").append(toIndentedString(allowedBrands)).append("\n");
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

