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
import com.hyperswitch.client.model.IntentStatus;
import com.hyperswitch.client.model.NextActionData;
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
 * PaymentsPostSessionTokensResponse
 */
@JsonPropertyOrder({
  PaymentsPostSessionTokensResponse.JSON_PROPERTY_PAYMENT_ID,
  PaymentsPostSessionTokensResponse.JSON_PROPERTY_NEXT_ACTION,
  PaymentsPostSessionTokensResponse.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PaymentsPostSessionTokensResponse {
  public static final String JSON_PROPERTY_PAYMENT_ID = "payment_id";
  @javax.annotation.Nonnull
  private String paymentId;

  public static final String JSON_PROPERTY_NEXT_ACTION = "next_action";
  @javax.annotation.Nullable
  private JsonNullable<NextActionData> nextAction = JsonNullable.<NextActionData>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private IntentStatus status = IntentStatus.REQUIRES_CONFIRMATION;

  public PaymentsPostSessionTokensResponse() {
  }

  public PaymentsPostSessionTokensResponse paymentId(@javax.annotation.Nonnull String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

  /**
   * The identifier for the payment
   * @return paymentId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentId() {
    return paymentId;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentId(@javax.annotation.Nonnull String paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentsPostSessionTokensResponse nextAction(@javax.annotation.Nullable NextActionData nextAction) {
    this.nextAction = JsonNullable.<NextActionData>of(nextAction);
    
    return this;
  }

  /**
   * Get nextAction
   * @return nextAction
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public NextActionData getNextAction() {
        return nextAction.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<NextActionData> getNextAction_JsonNullable() {
    return nextAction;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT_ACTION)
  public void setNextAction_JsonNullable(JsonNullable<NextActionData> nextAction) {
    this.nextAction = nextAction;
  }

  public void setNextAction(@javax.annotation.Nullable NextActionData nextAction) {
    this.nextAction = JsonNullable.<NextActionData>of(nextAction);
  }

  public PaymentsPostSessionTokensResponse status(@javax.annotation.Nonnull IntentStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IntentStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull IntentStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsPostSessionTokensResponse paymentsPostSessionTokensResponse = (PaymentsPostSessionTokensResponse) o;
    return Objects.equals(this.paymentId, paymentsPostSessionTokensResponse.paymentId) &&
        equalsNullable(this.nextAction, paymentsPostSessionTokensResponse.nextAction) &&
        Objects.equals(this.status, paymentsPostSessionTokensResponse.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, hashCodeNullable(nextAction), status);
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
    sb.append("class PaymentsPostSessionTokensResponse {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    nextAction: ").append(toIndentedString(nextAction)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

    // add `payment_id` to the URL query string
    if (getPaymentId() != null) {
      try {
        joiner.add(String.format("%spayment_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `next_action` to the URL query string
    if (getNextAction() != null) {
      joiner.add(getNextAction().toUrlQueryString(prefix + "next_action" + suffix));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

