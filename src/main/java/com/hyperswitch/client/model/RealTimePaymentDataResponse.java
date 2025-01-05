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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RealTimePaymentDataResponse
 */
@JsonPropertyOrder({
  RealTimePaymentDataResponse.JSON_PROPERTY_FPS,
  RealTimePaymentDataResponse.JSON_PROPERTY_DUIT_NOW,
  RealTimePaymentDataResponse.JSON_PROPERTY_PROMPT_PAY,
  RealTimePaymentDataResponse.JSON_PROPERTY_VIET_QR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RealTimePaymentDataResponse {
  public static final String JSON_PROPERTY_FPS = "fps";
  private Object fps;

  public static final String JSON_PROPERTY_DUIT_NOW = "duit_now";
  private Object duitNow;

  public static final String JSON_PROPERTY_PROMPT_PAY = "prompt_pay";
  private Object promptPay;

  public static final String JSON_PROPERTY_VIET_QR = "viet_qr";
  private Object vietQr;

  public RealTimePaymentDataResponse() {
  }

  public RealTimePaymentDataResponse fps(Object fps) {
    
    this.fps = fps;
    return this;
  }

   /**
   * Get fps
   * @return fps
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getFps() {
    return fps;
  }


  @JsonProperty(JSON_PROPERTY_FPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFps(Object fps) {
    this.fps = fps;
  }


  public RealTimePaymentDataResponse duitNow(Object duitNow) {
    
    this.duitNow = duitNow;
    return this;
  }

   /**
   * Get duitNow
   * @return duitNow
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DUIT_NOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDuitNow() {
    return duitNow;
  }


  @JsonProperty(JSON_PROPERTY_DUIT_NOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDuitNow(Object duitNow) {
    this.duitNow = duitNow;
  }


  public RealTimePaymentDataResponse promptPay(Object promptPay) {
    
    this.promptPay = promptPay;
    return this;
  }

   /**
   * Get promptPay
   * @return promptPay
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROMPT_PAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPromptPay() {
    return promptPay;
  }


  @JsonProperty(JSON_PROPERTY_PROMPT_PAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPromptPay(Object promptPay) {
    this.promptPay = promptPay;
  }


  public RealTimePaymentDataResponse vietQr(Object vietQr) {
    
    this.vietQr = vietQr;
    return this;
  }

   /**
   * Get vietQr
   * @return vietQr
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VIET_QR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getVietQr() {
    return vietQr;
  }


  @JsonProperty(JSON_PROPERTY_VIET_QR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVietQr(Object vietQr) {
    this.vietQr = vietQr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealTimePaymentDataResponse realTimePaymentDataResponse = (RealTimePaymentDataResponse) o;
    return Objects.equals(this.fps, realTimePaymentDataResponse.fps) &&
        Objects.equals(this.duitNow, realTimePaymentDataResponse.duitNow) &&
        Objects.equals(this.promptPay, realTimePaymentDataResponse.promptPay) &&
        Objects.equals(this.vietQr, realTimePaymentDataResponse.vietQr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fps, duitNow, promptPay, vietQr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealTimePaymentDataResponse {\n");
    sb.append("    fps: ").append(toIndentedString(fps)).append("\n");
    sb.append("    duitNow: ").append(toIndentedString(duitNow)).append("\n");
    sb.append("    promptPay: ").append(toIndentedString(promptPay)).append("\n");
    sb.append("    vietQr: ").append(toIndentedString(vietQr)).append("\n");
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

