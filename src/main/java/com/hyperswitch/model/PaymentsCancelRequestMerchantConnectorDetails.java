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
import com.hyperswitch.model.MerchantConnectorCreateConnectorAccountDetails;
import com.hyperswitch.model.MerchantConnectorDetailsWrap;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PaymentsCancelRequestMerchantConnectorDetails
 */
@JsonPropertyOrder({
  PaymentsCancelRequestMerchantConnectorDetails.JSON_PROPERTY_CREDS_IDENTIFIER,
  PaymentsCancelRequestMerchantConnectorDetails.JSON_PROPERTY_ENCODED_DATA
})
@JsonTypeName("PaymentsCancelRequest_merchant_connector_details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentsCancelRequestMerchantConnectorDetails {
  public static final String JSON_PROPERTY_CREDS_IDENTIFIER = "creds_identifier";
  private String credsIdentifier;

  public static final String JSON_PROPERTY_ENCODED_DATA = "encoded_data";
  private JsonNullable<MerchantConnectorCreateConnectorAccountDetails> encodedData = JsonNullable.<MerchantConnectorCreateConnectorAccountDetails>undefined();

  public PaymentsCancelRequestMerchantConnectorDetails() { 
  }

  public PaymentsCancelRequestMerchantConnectorDetails credsIdentifier(String credsIdentifier) {
    
    this.credsIdentifier = credsIdentifier;
    return this;
  }

   /**
   * Creds Identifier is to uniquely identify the credentials. Do not send any sensitive info, like encoded_data in this field. And do not send the string \&quot;null\&quot;.
   * @return credsIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Creds Identifier is to uniquely identify the credentials. Do not send any sensitive info, like encoded_data in this field. And do not send the string \"null\".")
  @JsonProperty(JSON_PROPERTY_CREDS_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCredsIdentifier() {
    return credsIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_CREDS_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCredsIdentifier(String credsIdentifier) {
    this.credsIdentifier = credsIdentifier;
  }


  public PaymentsCancelRequestMerchantConnectorDetails encodedData(MerchantConnectorCreateConnectorAccountDetails encodedData) {
    this.encodedData = JsonNullable.<MerchantConnectorCreateConnectorAccountDetails>of(encodedData);
    
    return this;
  }

   /**
   * Get encodedData
   * @return encodedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public MerchantConnectorCreateConnectorAccountDetails getEncodedData() {
        return encodedData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENCODED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MerchantConnectorCreateConnectorAccountDetails> getEncodedData_JsonNullable() {
    return encodedData;
  }
  
  @JsonProperty(JSON_PROPERTY_ENCODED_DATA)
  public void setEncodedData_JsonNullable(JsonNullable<MerchantConnectorCreateConnectorAccountDetails> encodedData) {
    this.encodedData = encodedData;
  }

  public void setEncodedData(MerchantConnectorCreateConnectorAccountDetails encodedData) {
    this.encodedData = JsonNullable.<MerchantConnectorCreateConnectorAccountDetails>of(encodedData);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsCancelRequestMerchantConnectorDetails paymentsCancelRequestMerchantConnectorDetails = (PaymentsCancelRequestMerchantConnectorDetails) o;
    return Objects.equals(this.credsIdentifier, paymentsCancelRequestMerchantConnectorDetails.credsIdentifier) &&
        equalsNullable(this.encodedData, paymentsCancelRequestMerchantConnectorDetails.encodedData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(credsIdentifier, hashCodeNullable(encodedData));
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
    sb.append("class PaymentsCancelRequestMerchantConnectorDetails {\n");
    sb.append("    credsIdentifier: ").append(toIndentedString(credsIdentifier)).append("\n");
    sb.append("    encodedData: ").append(toIndentedString(encodedData)).append("\n");
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

